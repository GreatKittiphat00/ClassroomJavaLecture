package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.Nisit;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class NisitController {
    @FXML
    private Label studentIdLabel;
    @FXML
    private Label nameLabel;
    @FXML
    private Label nicknameLabel;

    @FXML
    public void initialize() {
        Nisit nisit = new Nisit("6510405342", "Kittiphat Ninsap", "Great");
        showNisit(nisit);
    }

    private void showNisit(Nisit nisit) {
        studentIdLabel.setText(nisit.getStudentId());
        nameLabel.setText(nisit.getName());
        nicknameLabel.setText(nisit.getNickname());
    }

    @FXML
    public void onBackButtonClick() {
        try {
            FXRouter.goTo("hello");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

