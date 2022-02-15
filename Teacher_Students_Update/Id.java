package Teacher_Students_Update;

import java.util.Random;


public class Id {
    private final int semesterNo, batchNo;

    public Id(int semesterNo, int batchNo){
        this.semesterNo = semesterNo;
        this.batchNo = batchNo;
    }

    Random rand = new Random();
    int upperbound = 998;
    int int_random = rand.nextInt(1+upperbound);

    public void generateId(){
        System.out.println("Id :"+semesterNo+"-"+batchNo+"-"+int_random);
    }
}
