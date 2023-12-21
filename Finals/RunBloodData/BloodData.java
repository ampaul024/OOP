package RunBloodData;

public class BloodData {

    private String Btype;
    private String rhFact;

    public BloodData() {
        Btype = "O";
        rhFact = "+";
    }

    public void setBloodType(String Btype) {
        this.Btype = Btype;
    }

    public void setRhFactor(String rhFact) {
        this.rhFact = rhFact;

    }

    public String getBloodType() {
        return Btype;

    }

    public String getRhFactor() {
        return rhFact;

    }

    void display() {
        System.out.println(Btype + rhFact + " is added to the blood bank. ");
    }

}