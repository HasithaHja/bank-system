package org.example;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.Models.Model;

import java.sql.SQLException;


public class App extends Application {
    @Override
    public void start(Stage stage) throws SQLException {
        Model.getInstance().getViewFactory().showLoginWindow();
    }
}
