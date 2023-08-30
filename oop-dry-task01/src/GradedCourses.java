public class GradedCourses {
    public static Student gradedCourses(int studentID, String studentName, double... scores){
        Student students = new Student(studentID, studentName);
        students.addSubject((new Subject("Ciencia", scores[0])));
        students.addSubject((new Subject("Matemáticas", scores[1])));
        students.addSubject((new Subject("Inglés", scores[2])));
        students.addSubject((new Subject("Programación", scores[3])));
        return students;
    }
}
