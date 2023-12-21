package RunBloodData;

import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Blood Type Of Patient: ");
        String a1 = sc.nextLine();

        System.out.print("Enter The Rhesus Factor (+ or -): ");
        String a2 = sc.nextLine();

        if (a1.equals("") && a2.equals("")) {
            BloodData b1 = new BloodData();
            b1.display();

        } else {

            BloodData b1 = new BloodData();
            b1.setBloodType(a1);
            b1.setRhFactor(a2);

            System.out.println(b1.getBloodType() + b1.getRhFactor() + " is added to the blood bank. ");
        }
    }

}
