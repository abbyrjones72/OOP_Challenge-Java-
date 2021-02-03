package org.medical.surgery.organs;

public class Stomach extends Organ {

    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    @Override
    public void getDetails() {
        super.getDetails();

        if(this.isEmpty()) {
            System.out.println("Stomach is empty. Feed me, Seymour!");
        } else {
            System.out.println("Stomach is full.");
        }
    }

    public void digest() {
        System.out.println("Digesting is beginning...");
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
