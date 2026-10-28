package com.example.controller;

import com.example.model.BmiModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BmiController {

    @FXML private TextField tfWeight;
    @FXML private TextField tfHeight;
    @FXML private Label lblBmiResult;
    @FXML private Label lblCategoryResult;
    @FXML private Label lblError;

    @FXML
    private void handleCalculate() {
        lblError.setText("");
        try {
            double weight = Double.parseDouble(tfWeight.getText().trim());
            double height = Double.parseDouble(tfHeight.getText().trim());

            if (weight <= 0 || height <= 0) {
                lblError.setText("Nilai harus lebih besar dari 0!");
                return;
            }

            BmiModel model = new BmiModel(weight, height);
            double bmi = model.calculateBmi();
            lblBmiResult.setText(String.format("%.2f", bmi));
            lblCategoryResult.setText(model.getCategory(bmi));
        } catch (NumberFormatException e) {
            lblError.setText("Masukkan angka yang valid!");
        }
    }

    @FXML
    private void handleReset() {
        tfWeight.clear();
        tfHeight.clear();
        lblBmiResult.setText("-");
        lblCategoryResult.setText("-");
        lblError.setText("");
    }
}