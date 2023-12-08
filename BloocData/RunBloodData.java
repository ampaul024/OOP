package BloocData;

import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        Scanner jp = new Scanner(System.in);

        System.out.print("Enter blood type of patient: ");
        String bType = jp.nextLine();

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rhFact = jp.nextLine();

        if (bType.equals("") || rhFact.equals("")) {
            BloodData bd = new BloodData();
            bd.display();

        } else {
            BloodData bd = new BloodData(bType, rhFact);
            bd.display();
        }
        jp.close();
    }
}
