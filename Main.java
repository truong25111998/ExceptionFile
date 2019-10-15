package filemanager;

import java.util.List;



public class Main {
    public static void main(String[] args) {
        ManagerRD m = new ManagerRD();
//        FileManager fileManager = new FileManager("C:\\Users\\Admin\\Desktop\\nguon");
//        fileManager.checkSomeMethod();
        Student s1 = new Student("Linh", 20, 8.5f);
        s1.getName();
        s1.getAge();
        s1.getDiem();
        m.saveStudent(s1, "student.txt");
        Student s2 = new Student("Nam", 19, 7.5f);
        s2.getName();
        s2.getAge();
        s2.getDiem();
        m.saveStudent(s1, "student.txt");
        m.saveStudent(s2, "studen.txt");
        ManagerRD managerRD = new ManagerRD();
        List<Student> ss = managerRD.readAllStudent("studen.txt");
        System.out.println(ss.size());
    }
}
