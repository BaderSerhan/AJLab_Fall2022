/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2.extra;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author bader-aul
 */
public class CarDemoWithText extends Application {

    @Override
    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane();
        root.setOrientation(Orientation.VERTICAL);

        CarPaneWithText car1 = new CarPaneWithText("Bader");
        root.getChildren().add(car1);

        CarPaneWithText car2 = new CarPaneWithText("Elie");
        root.getChildren().add(car2);

        CarPaneWithText car3 = new CarPaneWithText("Jean Marc");
        root.getChildren().add(car3);

        Scene scene = new Scene(root, 500, 500);

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
