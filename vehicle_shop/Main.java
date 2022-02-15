package vehicle_shop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("company : ");
            String company = sc.nextLine();

            System.out.print("model : ");
            String model = sc.nextLine();

            System.out.print("color : ");
            String color = sc.nextLine();

            System.out.print("breakType : ");
            String breakType = sc.nextLine();

            System.out.print("CC : ");
            int CC = sc.nextInt();

            System.out.print("mileage : ");
            int mileage = sc.nextInt();

            System.out.print("numberOfSeat : ");
            int numberOfSeat = sc.nextInt();

            System.out.print("numberOfDoors : ");
            int numberOfDoors = sc.nextInt();

            if(numberOfSeat > 0 || numberOfDoors > 0){
                System.out.println("\n******car Info*******");
                Car car1 = new Car(company, model, color, breakType, CC, mileage, numberOfSeat, numberOfDoors);
                car1.show();
            }else {
                System.out.println("\n******bike Info*******");
                Bike bike1 = new Bike(company, model, color, breakType, CC, mileage);
                bike1.show();
            }

            // Stop loop
            System.out.print("2.Exit : ");
            int cs = sc.nextInt();
            if (cs == 2){
                break;
            }
        }

    }
}
