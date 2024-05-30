public class main {
    public static void main(String[] args) {
        //Bitwise operator
        //their are 6 types of bit wise operator
    // AND
    // OR
    // XOR
    // NOT
    // LEFT SHIFT
    // RIGHT SHIFT
    // Discuss some rules of bitwise operator
    // rule for AND operator is that if both the bits are 1 then only 1 will be there
    // rule for OR operator is that if both the bits are 0 then only 0 will be there
    // rule for XOR operator is that if both the bits are same then only 0 will be there
    // rule for NOT operator is that if the bit is 1 then it will be 0 and if the bit is 0 then it will be 1
    

    // AND operator
    System.out.println(5 & 4);
    //Description of AND operator fistly we change 5 and 6  in binary format then after that we perform AND operation on them anr write 1 where both the bits are 1 where the bits are mismatched then we write 0

    // OR operator
    System.out.println(5 | 4);
    //Description of OR operator firstly we change 5 and 6  in binary format then after that we perform OR operation on them and write 1 where any one bit is 1 and we write 0 where both the bits are 0

    // XOR operator
    System.out.println(5 ^ 4);
    // Description of XOR operator firstly we change 5 and 6  in binary format then after that we perform XOR operation on them and write the opopsite of the bit where both bits are equal and we write 0 where both the bits are 0 and we write 1 where any one bit is 1

    // NOT operator one complement operator
    System.out.println(~5);
    // Description of NOT operator firstly we change 5 in binary format then after that we perform NOT operation on them and write the 1 in place of 0 and 0 in place of 1

    // LEFT SHIFT operator
    System.out.println(5 << 2);
    // Description of LEFT SHIFT operator firstly we change 5 and 6 in binary format then after we have to shift the 2 digits from the left side and place it in the right side

    // RIGHT SHIFT operator
    System.out.println(5 >> 2);
    // Description of RIGHT SHIFT operator firstly we change 5 and 6 in binary format then after we have to shift the 2 digits from the right side and place it in the left side

    }
}