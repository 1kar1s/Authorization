package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private TextField login_fiend;

    @FXML
    private PasswordField password_fieid;

    @FXML
    private Button signUpButton;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private TextField signUpCountry;

    @FXML
    private TextField signUpLastName;

    @FXML
    private TextField signUpName;

    @FXML
    void initilize() {
        signUpButton.setOnAction(actionEvent -> {
            singUpNewUser();
        });
    }

    private void singUpNewUser() {
        DatabaseHandlen dbHandler = new DatabaseHandlen();

        String firstName = signUpName.getText();
        String lastName = signUpLastName.getText();
        String userName = login_fiend.getText();
        String password = password_fieid.getText();
        String location = signUpCountry.getText();
        String gender = "";
        if (signUpCheckBoxMale.isSelected())
            gender = "Мужской";
        else
            gender = "Женский";

        User user = new User(firstName, lastName, userName, password, location, gender);

        dbHandler.signUpUser(user);
    }

}
