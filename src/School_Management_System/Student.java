package School_Management_System;

/**
 * created by naveen in 14-july-2024
 * This class is responsible for keeping the track of students
 * fees ,name,grade and fees paid
 * here we declare the fields.
 */
public class Student
{
    private int id; // give private because some one should need permmision to access from outside the student class
    private String name;
    private int grade; // this is class from which the student is studying
    private int feespaid;
    private int feesTotal;

    /**
     * The role of constructor is to create a new student by intializing.
     * let the fees of every student per year is 30000/-
     * fees paid intially for new joining studnet is 0.
     * here this keyword used to overcome ambiguity.
     * here in constructor we intialize the field.
     */
    public Student(int id, String name, int grade) //constructor that calls when we create object fro the class
    {
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.feespaid=0;
        this.feesTotal=30000;
    }
    /**
     * we are not going to alter the student name and id.
     * we can alter the student grade and feespaid.
     * hare we use setter method for updation.
     * This is used to update student grade.
     */
    public void setGrade(int grade)
    {
        this.grade=grade;
    }

    /**
     * keep adding the fees paid to feespaid field.
     * add the fees to the fees paid.
     *
     */
    public void payFees( int fees)
    {
        feespaid+=fees;
        School.UpdateTotalMoneyEarned(feespaid);

    }
//Press alt+insert to get seeters and getters.

    /**
     *
     * @return id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the student.
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * @return the grade of the student.
     */
    public int getGrade()
    {
        return grade;
    }

    /**
     *
     * @return the feespaid by the student.
     */
    public int getFeespaid()
    {
        return feespaid;
    }

    /**
     *
     * @return the total fee for the student.
     */
    public int getFeesTotal()
    {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */
    public  int getRemainingFee()
    {
       return feesTotal-feespaid;
    }

    /**
     * here we override to string method to meet our requirement instead if we print student it print
     * unnecessary stuff so we use this.
     * if we doesn't override toString and print student directly we will get memeory address of object.
     * ctrl+O to get toString
     * @return
     */
    @Override
    public String toString() {
        return "Student's Name: "+name+
                " Total Fee's Paid so far is "+feespaid;
    }
}
