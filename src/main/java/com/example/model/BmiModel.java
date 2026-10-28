package com.example.model;

public class BmiModel {
    private final double weightKg;
    private final double heightCm;

    public BmiModel(double weightKg, double heightCm) {
        this.weightKg = weightKg;
        this.heightCm = heightCm;
    }

    public double calculateBmi() {
        if (heightCm <= 0) return 0;
        double heightMeter = heightCm / 100.0;
        return weightKg / (heightMeter * heightMeter);
    }

    public String getCategory(double bmi) {
        if (bmi < 18.5) return "Kurus (Underweight)";
        else if (bmi < 25.0) return "Normal (Ideal)";
        else if (bmi < 30.0) return "Kelebihan Berat Badan (Overweight)";
        else return "Obesitas (Obese)";
    }
}