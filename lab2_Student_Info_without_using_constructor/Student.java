package lab2_Student_Info_without_using_constructor;

/**
 * Created by ashoknath on 7/6/19.
 */
public class Student {
    private String name;
    private int roll_no;
    private String faculty;
    public void displayInfo()
    {
        System.out.println("Name::"+name);
        System.out.println("RollP_No::"+roll_no);
        System.out.println("Faculty:"+faculty);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

}
