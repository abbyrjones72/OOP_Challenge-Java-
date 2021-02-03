package org.medical.surgery.organs;

public class Heart extends Organ {

    private int rate;

    public Heart(String name, String medicalCondition, int rate) {
        super(name, medicalCondition);
        this.rate = rate;
    }

    // TODO: add getters and setters correctly.
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart rate: " + this.getRate());
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
