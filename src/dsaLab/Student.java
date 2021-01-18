package dsaLab;

public class Student {
    String studentsName;
    private String universityName;
    private String nameOfStream;
    private int yourId;
    private int marks;
    public Student(String studentsName, int yourID, int marks) {
        this.studentsName = studentsName;
        this.yourId = yourId;
        this.marks = marks;
    }

    public Student(String universityName, String nameOfStream, int yourId, int marks, String studentsName) {
        this.universityName = universityName;
        this.nameOfStream = nameOfStream;
        this.yourId = yourId;
        this.marks = marks;
        this.studentsName = studentsName;
    }

    public Student(int yourId, int marks, String studentsName) {
        this.yourId = yourId;
        this.marks = marks;
        this.studentsName = studentsName;
        this.nameOfStream = "b.tech";
        this.universityName = "GLA";
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getNameOfStream() {
        return nameOfStream;
    }

    public void setNameOfStream(String nameOfStream) {
        this.nameOfStream = nameOfStream;
    }

    public long getYourId() {
        return yourId;
    }

    public void setYourId(int yourId) {
        this.yourId = yourId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getStudentsName() {
        return studentsName;
    }

    public void setStudentsName(String studentsName) {
        this.studentsName = studentsName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentsName='" + studentsName + '\'' +
                ", universityName='" + universityName + '\'' +
                ", nameOfStream='" + nameOfStream + '\'' +
                ", yourId=" + yourId +
                ", marks=" + marks +
                '}';
    }
}
