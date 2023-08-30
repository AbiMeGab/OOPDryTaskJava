public class ReportPrinter {
    public static void printReport(Student student){
        System.out.println("--------------------------------------");
            System.out.println("ID " + student.getId() + " Estudiante: " + student.getName());
            for (Subject subject : student.getSubjects()){
                System.out.println("Nota de " + subject.getName() + " : " + subject.getScore());
            }
            double globalAverage = AverageCalculator.calculateAverage(student);
        System.out.println("Nota promedio: " + globalAverage);
        System.out.println("--------------------------------------");
    }
}
