package com.petmaps.aplication.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MapsController {

    @FXML
    private Button btnSalir;

    @FXML
    void btnSalirrOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }

}
