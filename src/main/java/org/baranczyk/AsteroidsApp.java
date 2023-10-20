package org.baranczyk;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class AsteroidsApp extends Application {

    @Override
    public void start(Stage stage) {
        var pane = new Pane();
        pane.setPrefSize(600,400);



        var scene = new Scene(pane);
        stage.setTitle("Asteroids");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}