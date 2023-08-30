import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(GradedCourses.gradedCourses(1,"Gery",67.0,70.0,69.0,80));
        students.add(GradedCourses.gradedCourses(2,"Joel",80.0,85.0,85.0,82));
        students.add(GradedCourses.gradedCourses(3,"Carmen",90.5,65.5,65.5,85));
        students.add(GradedCourses.gradedCourses(4,"Lia",75.3,75.3,75.3,70));
        students.add(GradedCourses.gradedCourses(5,"Phill",70.0,80.0,80.0,90));

        for (Student student : students){
            ReportPrinter.printReport(student);
        }
    }
}