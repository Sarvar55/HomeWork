package camphomework1;

public class Main {
    
    public static void main(String[] args) {
        User user1 = new User();
        user1.setEmail("example1@mail.ru");
        user1.setName("Engin");
        
        Student student1 = new Student();
        student1.setDepartment("Bilgisayar Muhendisligi");
        student1.setName("Server");
        student1.setPassword(12345);
        student1.setEmail("example@mail.ru");
        student1.setStudentClass("A");
        student1.setLastName("Musazade");
        
        Student[] students = {student1};
        for (Student student : students) {
            System.out.println(student.getName());
        }
        
        StudentManager studentManager = new StudentManager();
        studentManager.DepartmanChange(student1);
        
        Instructor instructor = new Instructor();
        instructor.setName("Mehmet");
        instructor.setLesson("Fizik");
        
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.deleteLesson();
        instructorManager.AddLesson(student1, instructor);
        
        UserManager userManager =new UserManager();
        userManager.StudentInfo(student1);
        userManager.add();
        userManager.delete();
        
    }
    
}
