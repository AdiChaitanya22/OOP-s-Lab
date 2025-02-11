public class University {
    static String universityName = "UPES";

    String studentName;

    public University(String studentName) {
        this.studentName = studentName;
    }

    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    public void displayStudentName() {
        System.out.println("Student Name: " + studentName);
    }

    public static void main(String[] args) {
        
        University student1 = new University("Ayushman");
        University student2 = new University("Kartik");
        University student3 = new University("Divyanshu");

        University.displayUniversityName();

        student1.displayStudentName();
        student2.displayStudentName();
        student3.displayStudentName();

        University.universityName = "University Of Petroleum And Energy Studies";

        University.displayUniversityName();

        student1.displayStudentName();
        student2.displayStudentName();
        student3.displayStudentName();
    }
}
