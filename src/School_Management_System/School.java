package School_Management_System;

import java.util.List;

public class School
{
    /**
     * here we don't know how many employess should add to the school
     * so we took array concept if we take array there is a problem we don't know the
     * exact length how many students and teachers should there so we took arraylist
     * this can extend when we insert data so we use array list here.
     */
    private List<Teacher> teachers;
    private List<Student> students;
    private  static int TotalMoneyEarned;
    private  static int TotalMoneySpent;

    /**
     * New school object is created.
     * @param teachers= list of teachers in the school.
     * @param students= list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        TotalMoneyEarned=0;
        TotalMoneySpent=0;
    }

    /**
     *
     * @return returns the list of teachers in the school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Add a teacher to the school
     * take single teacher and add it to the Teacher arraylist
     * @param teacher -- here teacher is to be added.
     */
    public void addTeachers(Teacher teacher) {
      teachers.add(teacher);
    }

    /**
     *
     * @return return list of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Add a student to the school.
     * take single student and add it to the Student arraylist
     * @param student
     */
    public void setStudents(Student student) {
       students.add(student);
    }

    public int getTotalMoneyEarned() {
        return TotalMoneyEarned;
    }

    /**
     * Add total money earned by the school.
     * @param MoneyEarned  money that is supposed to be added.
     */
    public static void UpdateTotalMoneyEarned(int MoneyEarned) {
        TotalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return total money spend by the school.
     */
    public int getTotalMoneySpent() {
        return TotalMoneySpent;
    }

    /**
     * returns the total money spend by the school.
     * that is the salary that is given for the teachers.
     * @param MoneySpent money that is spend by the school.
     */
    public static void UpdateTotalMoneySpent(int MoneySpent) {
        TotalMoneyEarned -= MoneySpent;
    }
}
