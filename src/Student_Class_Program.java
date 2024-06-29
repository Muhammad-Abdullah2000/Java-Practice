class Student{
    Student(String nax){                /// ------> Constructor is uesd
        System.out.println("The name is: " + nax);
    }
    public void name(String nam){           ///  ------> Default Method with nam

        System.out.println("The name is: " + nam);
    }
    public void name1(String name1) {               ///  ------>   Default Method with name1
        System.out.println("The name is: " + name1);
    }
    public void name2(String name2) {             //// ------>   Default Method with name2
        System.out.println("The name is: "  + name2);
    }
}
public class Student_Class_Program {
    public static void main(String[] args) {
              Student s = new Student("Fatima"); //// -------> Calling Constuctor with parameters
              s.name("ALi");                  ////   ------> Calling Method by creating object
              s.name1("Ayesha");                ///  ----->  Calling Method by creating object
              s.name2("Asma");                 ///    ----->  Calling Method by creating object

    }
}
