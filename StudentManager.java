/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camphomework1;


public class StudentManager{
  public void DepartmanChange(Student student){
      System.out.println(student.getName()+ " adli ogrenci"  + " Bolumunu " + student.getDepartment()+ " olarak degistirdi");
  }
public void studentEmailChange(Student student){
    System.out.println("Adi" + student.getName() +" Soyadi " +student.getLastName() + "olan ogrenci" + student.getEmail() + " olarak degistirdi." );
}
    
            
}
