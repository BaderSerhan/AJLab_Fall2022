/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2.sec1;

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

        CarPane car1 = new CarPane(Color.RED);
        CarPane car2 = new CarPane(Color.GREEN);
        CarPane car3 = new CarPane(Color.BLUE);

        root.getChildren().addAll(car1, car2, car3);

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
