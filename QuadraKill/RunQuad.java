package QuadraKill;

import java.util.Scanner;

public class RunQuad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Square a1 = new Square();
        Rectangle a2 = new Rectangle();
        Parallelogram a3 = new Parallelogram();
        Rhombus a4 = new Rhombus();
        Trapezoid a5 = new Trapezoid();

        System.out.println("Select From The Following:");
        System.out.println("R - Rectangle");
        System.out.println("S - Square");
        System.out.println("P - Parallelogram");
        System.out.println("H - Rhombus");
        System.out.println("T - Trapezoid");
        String b1 = sc.nextLine();

        if (b1.equalsIgnoreCase("R")) {
            System.out.println("A Rectangle!");
            a2.showDescription();
        }

        if (b1.equalsIgnoreCase("S")) {
            System.out.println("A Square!");
            a1.showDescription();
        }

        if (b1.equalsIgnoreCase("P")) {
            System.out.println("A Parallelogram!");
            a3.showDescription();

        }

        if (b1.equalsIgnoreCase("H")) {
            System.out.println("A Rhombus!");
            a4.showDescription();

        }

        if (b1.equalsIgnoreCase("T")) {
            System.out.println("A Trapezoid!");
            a5.showDescription();
        }

    }

}
