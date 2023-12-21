import java.util.Scanner;

interface input {
    public void takename();

}

interface select {
    public void choose();

}

interface press {
    public void p();
}

class done implements input, select {

    String name, pr;
    int n;

    Scanner sc = new Scanner(System.in);

    public void takename() {
        System.out.print("Enter Your Name: ");
        name = sc.nextLine();

    }

    public void choose() {
        System.out.print("Press 1 or 2 to select your game mode \n 1.story \n 2. survival ");
        n = sc.nextInt();
    }

    public void p() {
        sc.nextLine();
        System.out.println("Press p to start playing, " + name);
        pr = sc.nextLine();
    }
}

public class Console {

    public static void main(String[] args) {
        done d = new done();
        d.takename();
        d.choose();
        d.p();
    }
}