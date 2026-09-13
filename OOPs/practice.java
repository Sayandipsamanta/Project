package OOPs;

public class practice {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Sayan";
        s1.age = 22;
        s1.roll_no = 30;
        s1.college = "PIT";

        s2.name = "Dip";
        s2.age = 22;
        s2.roll_no = 3;
        s2.college = "PIET";

        s1.present();
        s2.present();

        s1.print();
        s2.print();
        
    }
}

class Student{
    String name;
    int age;
    int roll_no;
    String college;

    void present(){
        System.out.println("Markes as present .");
    }

    void print(){
        System.out.println(name+age+roll_no+college);
    }
}