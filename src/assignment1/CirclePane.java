/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author bader-aul
 */
public class CirclePane extends StackPane {

    Circle circle;

    public CirclePane() {
        circle = new Circle(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        getChildren().add(circle);
    }

    public void enlarge() {
        this.circle.setRadius(this.circle.getRadius() * 1.1);
    }

    public void shrink() {
        this.circle.setRadius(this.circle.getRadius() * 0.9);
    }

}
