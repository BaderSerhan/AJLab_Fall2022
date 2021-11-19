/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session02.sec2;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author bader-aul
 */
public class CarDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        FlowPane root = new FlowPane(Orientation.VERTICAL);

        CarPane car = new CarPane(Color.RED);
        CarPane car1 = new CarPane(Color.BLUE);
        CarPane car2 = new CarPane(Color.GREEN);

        //or I can add as much cars as I want using a for loop
        root.getChildren().addAll(car, car1, car2);

        Scene scene = new Scene(root, 500, 250);

        primaryStage.setTitle("Car Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
