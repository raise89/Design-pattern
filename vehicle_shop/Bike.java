package vehicle_shop;

public class Bike extends Vehicle {
    protected String breakType;
    public Bike(String company,String model,String color,String breakType,int CC,int mileage){
        this.company = company;
        this.model = model;
        this.color = color;
        this.breakType = breakType;
        this.CC = CC;
        this.mileage = mileage;
    }
    public void show(){
        super.show();
        System.out.println("breakType :"+breakType);
    }
}
