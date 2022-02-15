package vehicle_shop;

public class Car extends Vehicle {
    protected int numberOfSeat, numberOfDoors;
    public Car(String company,String model,String color,String breakType,int CC,int mileage,int numberOfSeat,int numberOfDoors){
        this.company = company;
        this.model = model;
        this.color = color;
        this.breakType = breakType;
        this.CC = CC;
        this.mileage = mileage;
        this.numberOfSeat = numberOfSeat;
        this.numberOfDoors = numberOfDoors;
    }
    public void show(){
        super.show();
        System.out.println("numberOfSeat :"+numberOfSeat+"\nnumberOfDoors :"+numberOfDoors);
    }
}
