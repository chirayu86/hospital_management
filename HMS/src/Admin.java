import java.util.*;
class Admin {
    private String password = "123456#";

    public Doctor addDoctor() {
        String nAme,dOcId,dept,spec;
     Scanner input = new Scanner(System.in);
        System.out.println("enter name of doctor");
     nAme = input.nextLine();
        System.out.println("enter id");

     dOcId = input.nextLine();
        System.out.println("enter department");
     dept = input.nextLine();
        System.out.println("enter specialization");
     spec = input.nextLine();

     Doctor doctor = new Doctor(nAme,dOcId,dept,spec);
     return doctor;
    }
    public boolean checkPassword(String pass)
    {if(pass.equals(password)) {return true;}
    else {return false;}
    }
}
