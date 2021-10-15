public class Student {
    private int id;
    private  String first_name;
    private String gpa;
    private String gender;
    private String email;

    public Student(int id, String first_name, String gpa, String gender, String email) {
        this.id = id;
        this.first_name = first_name;
        this.gpa = gpa;
        this.gender = gender;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", gpa='" + gpa + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}'+"\n";
    }
}
