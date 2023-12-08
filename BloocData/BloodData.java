package BloocData;

public class BloodData {

    static String bType = "O, A, B, AB";
    static String rhFact = "+,-";

    public BloodData() {
        bType = "O";
        rhFact = "+";
    }

    public BloodData(String bt, String rh) {
        bType = bt;
        rhFact = rh;
    }

    public void display() {
        System.out.println(bType + rhFact + " is added to the blood bank.");
    }
}
