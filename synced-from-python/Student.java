public class Student {
    private String grade;
    private String name;
    private String student_id;

    public Student(String name, String student_id, String grade) {
        this.name = name;
        this.student_id = student_id;
        this.grade = grade;
    }

    public String get_name() {
        return this.name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_student_id() {
        return this.student_id;
    }

    public void set_student_id(String student_id) {
        this.student_id = student_id;
    }

    public String get_grade() {
        return this.grade;
    }

    public void set_grade(String grade) {
        this.grade = grade;
    }

    public void print_info() {
        System.out.println("Student: " + this.name + ", ID: " + this.student_id + ", Grade: " + this.grade);
    }

    public boolean is_passing() {
        if (this.grade >= 60) {
            return true;
        }
        return false;
    }

}
