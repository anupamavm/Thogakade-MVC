package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerFormController {
    public TableView tblCustomer;

    public void saveButtonOnAction(ActionEvent actionEvent) {
    }

    public void reloadButtonOnAction(ActionEvent actionEvent) {
    }

    public void updateButtonOnAction(ActionEvent actionEvent) {
    }

    public void backButtonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) tblCustomer.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Dashboard.fxml"))));

            stage.setTitle("Dashboard Form");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void updateBtnOnAction(ActionEvent actionEvent) {
    }

    public void saveBtnOnAction(ActionEvent actionEvent) {
    }

    public void reloadBtnOnAction(ActionEvent actionEvent) {
    }
}
