package School_Management_System;

/**
 * created by naveen on 14 july 2024
 * This class is responsible for keeping track of the teacher's name,id,salary.
 */
public class Teacher
{
    private int id;
    private String name;
    private int salary;
    private  int salaryEarned;

    /**
     * create a new teacher object.
     * @param id id for the teacher
     * @param name name for the teacher
     * @param salary salary for the teacher
     */
    public Teacher(int id, String name, int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     * getter method.
     * @return it return id of the teacher.
     */
    public int getId()
    {
        return id;
    }

    /**
     * getter method
     * @return it return name of the teacher.
     */
    public String getName()
    {
        return name;
    }

    /**
     * getter method
     * @return it return salary of the teacher.
     */
    public int getSalary()
    {
        return salary;
    }
    // getter required for salary because salary changes acc to the experience.
    // but where as id and name canmot be changed.

    /**
     * Set the salary.
     */
    public void setSalary()
    {
        this.salary=salary;
    }

    /**
     *
     * @param salary add to the Salary
     *  Removes from total money earned by the school
     */
    public void receiveSalary(int salary)
    {
        salaryEarned+=salary;
        School.UpdateTotalMoneySpent(salary);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Name of the Teacher : " + name+
                 " Total Salary Earned so far " + salaryEarned;
    }
}
