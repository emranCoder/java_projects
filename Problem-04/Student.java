class Student {
    private static int genId = 200;
    private final int studentId;
    private int age;
    private Character grade;
    private String name;

    // Constructor
    public Student(String name, int age, char grade) {
        this.studentId = genId++;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
