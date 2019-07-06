package lab2_Student_Info_without_using_constructor;

/**
 * Created by ashoknath on 7/6/19.
 */
public class StudentInfo {
    public static void main(String[] args) {
        Student student=new Student();
       student.setName("Ashok");
        student.setRoll_no(171204);
        student.setFaculty("BE Computer");
        student.displayInfo();
    }
}
