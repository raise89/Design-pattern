package Teachers_Students;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("1. Teacher\n2. Student\n3. Exit & Print");
            int cs = sc.nextInt();
            if (cs == 1) {
                String id = sc.nextLine();
                String name = sc.nextLine();
                String department = sc.nextLine();
                String designation = sc.nextLine();
                // Initialize obj
                Teacher tr1 = new Teacher(id, name, department, designation);
                // Show
                tr1.show();
            } else if (cs == 2) {
                String id = sc.nextLine();
                String name = sc.nextLine();
                String department = sc.nextLine();
                String batch = sc.nextLine();
                // Initialize obj
                Student st1 = new Student(id, name, department, batch);
                // Show
                st1.show();
            } else {
                System.out.println("Stop Execute");
                break;
            }
        }


    }
}
