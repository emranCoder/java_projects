public class Main {
    public static void main(String[] args) {
        StudentManagementSystem ugs = new StudentManagementSystem(100);
        //Add Student
        ugs.addStudent("MD.Emran Alam", 20, 'A');
        ugs.addStudent("Lark Dose", 21, 'B');
        ugs.addStudent("Number Doak", 22, 'C');

        // Show Student Details
        ugs.allStudents();

        // Attempt for update student grade
        ugs.updateGrade(1, 'B');

        // Displaying updated info
        ugs.allStudents();
    }
}