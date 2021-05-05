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
public class Instructor extends User{
    private String lesson;

    public Instructor(){
        
    }
    public Instructor(String lesson, String name, String LastName, String email, int password) {
        super(name, LastName, email, password);
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    
}
