package Teachers_Students;

public class Student extends Person {
    private String batch;

    public Student(String Id, String name, String department, String batch){
        this.Id = Id;
        this.name = name;
        this.department = department;
        this.batch = batch;
    }

    public void show(){
        super.show();
        System.out.println("Batch :"+batch+"\n");
    }
}
