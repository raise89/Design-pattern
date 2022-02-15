package Teacher_Students_Update;

public class Student extends Person {
    private int semesterNo, batchNo;



    public Student(String name,String department,int semesterNo,int batchNo){
        this.name = name;
        this.department = department;
        this.semesterNo = semesterNo;
        this.batchNo = batchNo;
    }

    Id sti = new Id(semesterNo,batchNo);

    public void show(){
        System.out.println("student information");
        sti.generateId();
        super.show();
        System.out.println("Batch :"+ batchNo +"\n");
    }
}
