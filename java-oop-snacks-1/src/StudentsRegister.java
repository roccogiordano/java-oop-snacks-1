// Class Definition

public class StudentsRegister {

    // Instance Variables Declaration

    private Object[] enrolledStudents;

    private int maxStudents = 25;

    private int currentStudents = 0;

    //


    // StudentsRegister Methods

    public StudentsRegister() {

        this.enrolledStudents = new Object[this.maxStudents];

    }

    public void addStudent(Object Student) {

        this.enrolledStudents[this.currentStudents] = Student;

        this.currentStudents++;

    }

    public void getEnrolledStudents() {

        for (int i = 0; i < this.currentStudents; i++ ) {

            System.out.println(enrolledStudents[i]);

        };

    }

    //

}

//