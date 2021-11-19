/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session04;

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

    private int sceneWidth = 500, sceneHeight = 250;

    @Override
    public void start(Stage primaryStage) {

        FlowPane root = new FlowPane(Orientation.VERTICAL);

        CarPane car1 = new CarPane(Color.RED, sceneWidth, sceneHeight);
        CarPane car2 = new CarPane(Color.GREEN, sceneWidth, sceneHeight);
        CarPane car3 = new CarPane(Color.BLUE, sceneWidth, sceneHeight);

        root.getChildren().addAll(car1, car2, car3);

        Scene scene = new Scene(root, sceneWidth, sceneHeight);

        root.requestFocus();
        root.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN:
                    car1.moveDown();
                    break;
                case UP:
                    car1.moveUp();
                    break;
                case LEFT:
                    car1.moveLeft();
                    break;
                case RIGHT:
                    car1.moveRight();
                    break;
                default:
                    System.out.println(e.getCode() + " was pressed.");
            }
        });

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
