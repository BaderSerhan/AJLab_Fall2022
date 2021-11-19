/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session02.extra;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author bader-aul
 */
public class CarPaneWithText extends Pane {

    CarPaneWithText(String playerName) {
        Rectangle body = new Rectangle();
        Circle LeftWheel = new Circle();
        Circle RightWheel = new Circle();

        Text name = new Text(playerName);
        name.setFill(Color.PURPLE);
        name.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 15));
        name.setX(40);
        name.setY(40);

        body.setHeight(50);
        body.setWidth(100);
        body.setFill(Color.TRANSPARENT);
        body.setStroke(Color.BLACK);

        body.setX(20);
        body.setY(20);

        LeftWheel.setFill(new Color(0.8, 0.2, 0.3, 0.5));
        RightWheel.setFill(new Color(0.8, 0.2, 0.3, 0.5));

        LeftWheel.setRadius(10);
        RightWheel.setRadius(10);

        LeftWheel.setCenterX(40);
        LeftWheel.setCenterY(70);

        RightWheel.setCenterX(100);
        RightWheel.setCenterY(70);
        this.getChildren().addAll(name, body, LeftWheel, RightWheel);
    }
}
