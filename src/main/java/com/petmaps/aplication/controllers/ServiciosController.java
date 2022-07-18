package com.petmaps.aplication.controllers;

import com.petmaps.aplication.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ServiciosController {

    @FXML
    private Button btnInicio;

    @FXML
    private Button btnRefugio;

    @FXML
    private Button btnTienda;

    @FXML
    private Button btnVeterinaria;

    @FXML
    void btnInicioOnClickedMouse(MouseEvent event) {
        HelloApplication.setFXML("First-view", "Regreso de ServiSios ");

    }
    @FXML
    void bntVeterinarioOnMOuseClicked(MouseEvent event) {

    }

    @FXML
    void btnRefugioOnMOuseClicked(MouseEvent event) {

    }

    @FXML
    void btnTiendaOnMOuseClicked(MouseEvent event) {

    }

}


