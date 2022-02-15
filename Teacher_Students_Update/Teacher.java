package Teacher_Students_Update;

public class Teacher extends Person {
    private String designation;
    private int id;
    public Teacher(int id, String name, String department, String designation){
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public void show(){
        System.out.println("teacher information");
        System.out.println("Id :"+id);
        super.show();
        System.out.println("Designation :"+designation+"\n");
    }
}
