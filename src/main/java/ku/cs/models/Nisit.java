package ku.cs.models;

public class Nisit {
    private String studentId;
    private String name;
    private String nickname;

    public Nisit(String studentId, String name, String nickname) {
        this.studentId = studentId;
        this.name = name;
        this.nickname = nickname;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

}
