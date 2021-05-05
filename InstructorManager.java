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
public class InstructorManager {

   
   public void AddLesson(Student student,Instructor instructor){
       System.out.println(instructor.getName() + " Ogretmen" + instructor.getLesson() + "'dersine  e " + student.getName()+" adli ogrenici ekledi.\n" );
   }
   public void deleteLesson(){
       System.out.println("Ders Silindi:\n");
   }
   
    
    
}
