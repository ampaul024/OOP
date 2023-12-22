package College;

public class Exam {
    String message;

    public Exam() {
        message = "GOOD LUCK!";
    }

    public static void main(String[] args) {
        Exam Ex = new Exam();
        System.out.println(Exam.message);
    }

}
