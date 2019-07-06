package lab2studentinfo_using_constructor;

/**
 * Created by ashoknath on 7/6/19.
 */
public class StudentInf {
    private String name;
    private int roll_no;
    private String faculty;
    public StudentInf(String name, int roll_no, String faculty)
    {
        this.name=name;
        this.roll_no=roll_no;
        this.faculty=faculty;
    }

    public void getInfo()
    {
        System.out.println("Name::"+name);
        System.out.println("RollP_No::"+roll_no);
        System.out.println("Faculty:"+faculty);
    }



}
