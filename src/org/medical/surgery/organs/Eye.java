package org.medical.surgery.organs;

public class Eye extends Organ {

    private String color;
    private boolean isOpen;

    public Eye(String name, String medicalCondition, String color, boolean open) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpen = open;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + this.getColor());
    }

    public void open() {
        this.setOpen(true);
        System.out.println(this.getName() + " opened.");
    }

    public void close() {
        this.setOpen(false);
        System.out.println(this.getName() + " closed.");
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
