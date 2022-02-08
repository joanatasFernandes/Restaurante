package com.example.restaurantescodetech;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
    public class LoginController {

        @FXML
        TextField txtLogin;
        @FXML
        PasswordField txtSenha;
        @FXML
        public void entrar() {
            String login = txtLogin.getText();
            String senha = txtSenha.getText();
            if (login.equals("admin") && senha.equals("123")) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Login realizado com sucesso.");
                alert.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Login ou senha inválidos.");
                alert.show();
            }
        }
    }
