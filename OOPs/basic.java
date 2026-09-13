package OOPs;

public class basic {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Sayandip";
        s1.age = 22;
        s1.roll_no = 30;
        s1.college = "PIT";

        s2.name = "Sayak";
        s2.age = 21;
        s2.roll_no = 26;
        s2.college = "PIET"; 

        s1.markAttendence();
        s2.markAttendence();

        s1.print();
        s2.print();

    }
}

class Student{
    String name;
    int age;
    int roll_no;
    String college;

    void markAttendence(){
        System.out.println("Attendence marked by "+ name);
    }

    void print(){
        System.out.println(name + " ," + age + " ," + roll_no + " ," + college);
    }
}
