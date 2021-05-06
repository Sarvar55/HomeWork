
package camphomework1;


public class UserManager  {
     public void StudentInfo(Student  student){
       System.out.println(student.getName() + "Adli ogrenci" + student.getStudentClass()+ "'ci sinifta okuyor" + student.getDepartment() + "'bolumunde okuyor \n");   
   }
     public void add(){
         System.out.println("Yeni eklemeler yaptı  :\n");
     }
     public void update(){
         System.out.println(" Eklemeleri Güncelledi:\n");
     }
    public void delete(){
       System.out.println("Bazı ekelemeleri kaldirdi :\n");
   }
}
