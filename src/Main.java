public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Student student = new Student(i, switch (i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> throw new IllegalStateException("Unexpected value: " + i);
            }, "2 October 2012", "Java Master Class");
            System.out.println(student);
        }
    }
}
