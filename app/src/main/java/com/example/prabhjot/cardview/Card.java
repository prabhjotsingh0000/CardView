package com.example.prabhjot.cardview;

public class Card {

    private String disease;
    private String numberOfDoses;
    private String drugStrength;
    private String dosage;
    private String frequency;
    private String route;
    private String duration;
    private String instructions;
    private boolean isSingleDose;

    public Card(String disease,String numberOfDoses, String drugStrength,String dosage, String frequency,String route,String duration,String instructions, boolean isSingleDose)

    {
        this.disease=disease;
        this.numberOfDoses=numberOfDoses;
        this.drugStrength=drugStrength;
        this.dosage=dosage;
        this.frequency=frequency;
        this.route=route;
        this.duration=duration;
        this.instructions=instructions;
        this.isSingleDose=isSingleDose;
    }

    public String getDisease() {
        return disease;
    }

    public String getNumberOfDoses() {
        return numberOfDoses;
    }

    public String getDrugStrength() {
        return drugStrength;
    }

    public String getDosage() {
        return dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getRoute() {
        return route;
    }

    public String getDuration() {
        return duration;
    }

    public String getInstructions() {
        return instructions;
    }

    public boolean getIsSingleDose()
    {
        return isSingleDose;
    }
}
