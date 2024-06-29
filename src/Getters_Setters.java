class studentf {
    private String name;
    private int rollNumber;

    public String getname() {      ///  ------> The method that returns the setName method
        return name;
    }

    public void setName(String n) {    /// ------>  The argument passed in this method where it is assinged to private String name
        name = n;
    }
    public int getRollNumber(){         //// ---->  The method thst returns the setRollNumber
        return rollNumber;
    }
    public void setRollNumber(int r){  /// ---> The argument passed in this method where it is assinged to private int RollNumber
        rollNumber = r;
    }

}
public class Getters_Setters {
    public static void main(String[] args) {
        studentf s = new studentf();
        s.setName("Abdullah");
        System.out.println("The name is: " + s.getname());
        s.setRollNumber(52);
        System.out.println("And the rollNumber is: " + s.getRollNumber());

    }
}
