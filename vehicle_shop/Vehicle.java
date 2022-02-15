package vehicle_shop;

public class Vehicle extends Engine{
    protected String company, model, color, breakType;

    public void show(){
        System.out.println("company :"+company+"\nmodel :"+model+"\ncolor :"+color+"breakType :"+breakType+"\nCC :"+CC+"\nmileage :"+mileage);
    }
}
