package camphomework1;


public class StudentManager extends UserManager{
  public void DepartmanChange(Student student){
      System.out.println(student.getName()+ " adli ogrenci"  + " Bolumunu " + student.getDepartment()+ " olarak degistirdi \n");
  }
public void studentEmailChange(Student student){
    System.out.println("Adi" + student.getName() +" Soyadi " +student.getLastName() + "olan ogrenci" + student.getEmail() + " olarak degistirdi. \n" );
}

    @Override
    public void add() {
        System.out.println("Derse  basladi :\n");
    }

    @Override
    public void delete() {
        super.delete();
        System.out.println("Dersden Ayrildi: \n");
    }
    

 
}
