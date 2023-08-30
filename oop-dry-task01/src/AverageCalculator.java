import java.util.List;

public class AverageCalculator {
    public static double calculateAverage(Student student){
        List<Subject> subjects = student.getSubjects();
        double globalSum = 0;

        for (Subject subject : subjects) {
                globalSum += subject.getScore();
        }
        return globalSum / subjects.size();
    }
}
