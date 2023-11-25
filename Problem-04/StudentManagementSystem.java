class StudentManagementSystem {
    public Student[] students;
    public int numberOfStudent;

    public StudentManagementSystem(int numOfStudent) {
        students = new Student[numOfStudent];
        this.numberOfStudent = 0;
    }

    public void addStudent(String name, int age, char grade) {
        Student newStudent = new Student(name, age, grade);
        this.students[numberOfStudent++] = newStudent;
    }

    public void allStudents() {
        System.out.println("Students Information:");
        for (Student student : students) {
            if (student != null) {
                System.out.println("Name: " + student.getName());
                System.out.println("ID: " + student.getStudentId());
                System.out.println("Age: " + student.getAge());
                System.out.println("Grade: " + student.getGrade());
                System.out.println("***************************************************");
            }
        }
        System.out.println("----------------------------------------------");
    }


    public void updateGrade(int studentId, char newGrade) {
        for (Student student : students) {
            if (student != null) {
                if (student.getStudentId() == studentId) {
                    student.setGrade(newGrade);
                    System.out.println("Grade Updated for student ID: " + studentId);
                    System.out.println("Grade: " + student.getGrade());
                    return;
                }
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
        System.out.println("=================================================");
    }


}