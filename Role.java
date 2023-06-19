public abstract class Role {
    private String teachers;
    private String nonAcademic;
    private String course;
    private String student;

    public Role(String teachers, String nonAcademic, String course, String student) {
        this.teachers = teachers;
        this.nonAcademic = nonAcademic;
        this.course = course;
        this.student = student;


        System.out.println(this.teachers + " Teaches course to student\n");
        System.out.println(this.student + " takes course from teachers\n");
        System.out.println(this.nonAcademic + " as the name implies they helps in some school jobs like security and cleaning");
    }

    public Role(){}

    public String getTeachers() {
        return teachers;
    }

    public void setTeachers(String teachers) {
        this.teachers = teachers;
    }

    public String getNonAcademic() {
        return nonAcademic;
    }

    public void setNonAcademic(String nonAcademic) {
        this.nonAcademic = nonAcademic;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }
}
