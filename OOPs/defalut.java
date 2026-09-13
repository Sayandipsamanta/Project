package OOPs;

public class defalut {

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.sec);
    }
    
}
class Student{
    String name;
    int age;
    char sec;

}