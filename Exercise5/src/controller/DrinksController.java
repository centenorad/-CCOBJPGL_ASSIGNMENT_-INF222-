package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class DrinksController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    icetea icetea = new icetea();
    lemon lemon = new lemon();
    calamansi calamansi = new calamansi();
    orange orange = new orange();
    mango mango = new mango();
    

    public void initialize() {

        icetea.setColor("Dark Brown");
        icetea.setTaste("Sweet");

        lemon.setColor("Yellow");
        lemon.setTaste("Sour");

        calamansi.setColor("Yellowish");
        calamansi.setTaste("Sour");

        orange.setColor("Orange");
        orange.setTaste("Very Sweet");

        mango.setColor("Yellow");
        mango.setTaste("Very Sweet");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Icetea are " + icetea.getColor() + " and " + icetea.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Lemon are " + lemon.getColor() + " and " + lemon.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Calamansi are " + calamansi.getColor() + " and " + calamansi.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Orange are " + orange.getColor() + " and " + orange.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Mango are " + mango.getColor() + " and " + mango.getTaste());
        }
        
        alert.showAndWait();

    }
}