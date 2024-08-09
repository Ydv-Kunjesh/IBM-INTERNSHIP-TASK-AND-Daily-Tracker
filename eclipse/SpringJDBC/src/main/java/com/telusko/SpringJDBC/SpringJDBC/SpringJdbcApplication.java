package com.telusko.SpringJDBC.SpringJDBC;

import com.telusko.SpringJDBC.SpringJDBC.model.Student;
import com.telusko.SpringJDBC.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
	ApplicationContext context  =  SpringApplication.run(SpringJdbcApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRollNo(1);
		s.setName("Kunjesh Yadav");
		s.setMarks(97);


		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);

	}
}
