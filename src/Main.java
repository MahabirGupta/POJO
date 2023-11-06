public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent student = new LPAStudent(i, switch (i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> throw new IllegalStateException("Unexpected value: " + i);
            }, "2 October 2012", "Java Master Class");
            System.out.println(student);
        }
        Student pojoStudent = new Student(6,"Anishkaa","22 July 2015","Angular");
        System.out.println(pojoStudent);

        LPAStudent recordStudent = new LPAStudent(7,"Ashish","25 July 2011","JavaScript");
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + " , Java OCP Exam 829 ");
//        recordStudent.setClassList(recordStudent.classList() + " , Java OCP Exam 829 ");
//        Record class is immutable

        System.out.println(pojoStudent.getStudentName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.studentName() + " is taking " + recordStudent.classList());

    }
}
