package Teachers_Students;

public class Teacher extends Person {
    private String designation;

    public Teacher(String Id, String name, String department, String designation){
        this.Id = Id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public void show(){
        super.show();
        System.out.println("Designation :"+designation+"\n");
    }
}
