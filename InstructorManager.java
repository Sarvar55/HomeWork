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
public class InstructorManager extends UserManager{

   
   public void AddLesson(Student student,Instructor instructor){
       System.out.println(instructor.getName() + " Ogretmen" + instructor.getLesson() + "'dersine  e " + student.getName()+" adli ogrenici ekledi.\n" );
   }

    @Override
    public void delete() {
       
        System.out.println( "Dersi kaldirdi: \n");
    }

    @Override
    public void update() {
        System.out.println("Dersi yeniledi: \n");
    }

    @Override
    public void add() {
        System.out.println("Ders Ekledi: \n");
    }
     
   
    
    
}
