package org.medical.surgery.charts;

import org.medical.surgery.patients.Patient;

public class Chart {
    private String name;
    private int age;

    // TODO: this cannot be right. Fix this.
    public Chart(Patient patient) {
        setName(patient.getName());
        setAge(patient.getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Chart{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
