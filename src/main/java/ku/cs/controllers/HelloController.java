package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onProfileMeButtonClick() {
        try {
            FXRouter.goTo("nisit");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    protected void onProductButtonClick() {
        try {
            FXRouter.goTo("product");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}