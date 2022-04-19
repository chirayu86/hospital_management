import java.util.*;
public class HMS {
    public static void main(String[] args) {
        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the type of user");
        int choice = sc.nextInt();
        //login switch case
        while(true) {
            if (choice == 1) {
                //admin functions
                Admin admin = new Admin();
                System.out.println("enter admin password");
                String password = sc.next();
                if (admin.checkPassword(password)) {
                    System.out.println("login successful");
                } else {
                    System.exit(0);
                }

                System.out.println("enter your choice 1 : add doctor");
                System.out.println("2 : show doctor");
                while (true) {
                    int choice2 = sc.nextInt();
                    if (choice2 == 1) {
                        System.out.println("enter 1 to add doctor");
                        boolean getDoctor = sc.nextBoolean();
                        while (getDoctor) {
                            doctors.add(admin.addDoctor());
                            getDoctor = sc.nextBoolean();
                        }
                    } else if (choice2 == 2) {
                        for (Doctor doc : doctors) {
                            doc.showInfo();

                        }
                    }
                }
            }

        }
    }
}


