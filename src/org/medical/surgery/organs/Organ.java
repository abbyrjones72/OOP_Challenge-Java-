package org.medical.surgery.organs;

public class Organ {

    private String organName;
    private String medicalCondition;

    public Organ(String name, String medicalCondition) {
        this.organName = name;
        this.medicalCondition = medicalCondition;
    }

    public String getName() {
        return organName;
    }

    public void setName(String name) {
        this.organName = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }
}
