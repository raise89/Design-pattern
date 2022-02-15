package Teacher_Students_Update.Main;

import Teacher_Students_Update.Teacher;
import Teacher_Students_Update.Student;

public class Main {
    public static void main(String[] args) {

        Teacher tr1 = new Teacher(5465,"aren","swe","proffesor");
        Student st1 = new Student("evan","swe",201,35);

        tr1.show();
        st1.show();

    }
}
