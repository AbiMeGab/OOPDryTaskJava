import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int id;
    private List<Subject> subjects;
    public Student( int id, String name) {
        this.name = name;
        this.id = id;
        subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
    public void addSubject(Subject subject){
        subjects.add(subject);
    }
}
