package Teachers_Students;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.print("Id : ");
            String id = sc.nextLine();

            System.out.print("Name : ");
            String name = sc.nextLine();

            System.out.print("Department : ");
            String department = sc.nextLine();

            System.out.print("Designation : ");
            String designation = sc.nextLine();

            System.out.print("Batch : ");
            String batch = sc.nextLine();

            if(designation != ""){
                System.out.println("Teacher Info");
                // Initialize obj
                Teacher tr1 = new Teacher(id, name, department, designation);
                // Show
                tr1.show();
            }else {
                System.out.println("Student Info");
                // Initialize obj
                Student st1 = new Student(id, name, department, batch);
                // Show
                st1.show();
            }

            // Stop loop
            System.out.print("1. Continue  2.Exit : ");
            int cs = sc.nextInt();
            if (cs == 1){
                continue;
            }else {
                break;
            }
        }


    }
}
