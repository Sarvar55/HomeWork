/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camphomework1;

/**
 *
 * @author User
 */
public class Student extends User{
    private String StudentClass;
    private String department;
    
public Student(){
    
}
    
    public Student(String StudentClass, String department, String name, String LastName, String email, int password) {
        super(name, LastName, email, password);
        this.StudentClass = StudentClass;
        this.department = department;
    }

    public String getStudentClass() {
        return StudentClass;
    }

    public void setStudentClass(String StudentClass) {
        this.StudentClass = StudentClass;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
}