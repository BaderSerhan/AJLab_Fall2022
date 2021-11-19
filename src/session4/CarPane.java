/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session4;

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
    private Rectangle body;
    private Circle leftWheel, rightWheel;

    private int sceneWidth, sceneHeight;

    CarPane(Color bodyColor, int sceneWidth, int sceneHeight) {
        this.sceneWidth = sceneWidth;
        this.sceneHeight = sceneHeight;

        body = new Rectangle();

        body.setWidth(bodyWidth);
        body.setHeight(bodyHeight);

        body.setFill(bodyColor);
        body.setStroke(Color.BLACK);

        body.setX(spacing);
        body.setY(spacing);

        leftWheel = new Circle();
        rightWheel = new Circle();

        leftWheel.setRadius(10);
        rightWheel.setRadius(10);

        leftWheel.setCenterX(spacing + 15);
        leftWheel.setCenterY(spacing + bodyHeight);

        //first way is to get the body width (body.getWidth())
        rightWheel.setCenterX(spacing + bodyWidth - 15);
        rightWheel.setCenterY(spacing + bodyHeight);

        this.getChildren().addAll(body, leftWheel, rightWheel);
    }

    public void moveLeft() {
        if (body.getX() == -bodyWidth) {
            body.setX(sceneWidth);
            leftWheel.setCenterX(sceneWidth + 15);
            rightWheel.setCenterX(sceneWidth + bodyWidth - 15);
        } else {
            body.setX(body.getX() - 10);
            leftWheel.setCenterX(leftWheel.getCenterX() - 10);
            rightWheel.setCenterX(rightWheel.getCenterX() - 10);
        }
    }

    public void moveRight() {
        if (body.getX() == sceneWidth) {
            body.setX(-bodyWidth);
            leftWheel.setCenterX(-bodyWidth + 15);
            rightWheel.setCenterX(-15);
        } else {
            body.setX(body.getX() + 10);
            leftWheel.setCenterX(leftWheel.getCenterX() + 10);
            rightWheel.setCenterX(rightWheel.getCenterX() + 10);
        }
    }

    //similary for y-axis
    public void moveUp() {
        body.setY(body.getY() - 10);
        leftWheel.setCenterY(leftWheel.getCenterY() - 10);
        rightWheel.setCenterY(rightWheel.getCenterY() - 10);
    }

    public void moveDown() {
        body.setY(body.getY() + 10);
        leftWheel.setCenterY(leftWheel.getCenterY() + 10);
        rightWheel.setCenterY(rightWheel.getCenterY() + 10);
    }

}
