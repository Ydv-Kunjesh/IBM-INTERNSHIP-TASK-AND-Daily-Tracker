package com.telusko.SpringJDBC.SpringJDBC.repo;
import com.telusko.SpringJDBC.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class StudentRepo {
    private JdbcTemplate jdbc;
    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }


    public void save(Student s) {
        String sql = "insert into student (rollNo , name  , marks) values(?,?,?)" ;
      int rows =  jdbc.update(sql ,s.getRollNo() , s.getName() , s.getMarks() );
      System.out.println(rows + " affected");
    }

    public List<Student> findAll() {
      String sql = "select * from student";
      return   jdbc.query(sql,(rs,rowNum) -> {
            Student s = new Student();
            s.setRollNo(rs.getInt("rollno"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;
        });
    }
    public StudentRepo(){
        System.out.println("Object Created for StudentRepo");
    }
}
