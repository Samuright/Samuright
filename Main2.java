import DataTransferObject.Student;

public class Main2 {
    public static void main(String[] args) {
        //student là 1 hiện thực của lớp Student
        //student là 1 instance của lớp Student
        Student student = new Student();
        student.setCode("SE193112");
        System.out.println(student.getCode());
    }
}
