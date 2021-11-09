/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2.sec1;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author bader-aul
 */
public class CarPane extends Pane {

    private int bodyWidth = 100;
    private int bodyHeight = 50;
    private int spacing = 20;

    //QUESTION: modify the CarPane class to add text to the center of the rectangle
    CarPane(Color bodyColor) {
        Rectangle body = new Rectangle();

        body.setWidth(bodyWidth);
        body.setHeight(bodyHeight);

        body.setFill(bodyColor);
        body.setStroke(Color.BLACK);

        body.setX(spacing);
        body.setY(spacing);

        Circle leftWheel = new Circle();
        Circle rightWheel = new Circle();

        leftWheel.setRadius(10);
        rightWheel.setRadius(10);

        leftWheel.setCenterX(spacing + 15);
        leftWheel.setCenterY(spacing + bodyHeight);

        //first way is to get the body width (body.getWidth())
        rightWheel.setCenterX(spacing + bodyWidth - 15);
        rightWheel.setCenterY(spacing + bodyHeight);

        this.getChildren().addAll(body, leftWheel, rightWheel);
    }

}
