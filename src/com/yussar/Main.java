package com.yussar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/main_layout.fxml"));
        primaryStage.setTitle("Hello Java FX");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

}
