/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2.sec2;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author bader-aul
 */
public class CarPane extends Pane {

    private int height = 50;
    private int width = 100;
    private int spacing = 20;

    CarPane(Color bodyColor) {
        Rectangle body = new Rectangle(); //or new Rectangle(20,20,100,50)
        body.setHeight(height);
        body.setWidth(width);

        body.setFill(bodyColor); //gotten from constructor
        body.setStroke(Color.BLACK);
//        body.setStyle("-fx-border-color:red");

        body.setX(spacing);
        body.setY(spacing);

        Circle leftWheel = new Circle();
        Circle rightWheel = new Circle();

        leftWheel.setRadius(10);
        rightWheel.setRadius(10);

        leftWheel.setCenterX(spacing + 15);
        leftWheel.setCenterY(height + spacing);

        rightWheel.setCenterX(spacing + width - 15);
        rightWheel.setCenterY(height + spacing);

        //adding one node at a time
        this.getChildren().add(body);
        this.getChildren().add(leftWheel);
        this.getChildren().add(rightWheel);

        //or adding all children together
//        root.getChildren().addAll(body, leftWheel, rightWheel);
    }
}
