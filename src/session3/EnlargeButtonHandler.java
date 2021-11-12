/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.shape.Circle;

/**
 *
 * @author bader-aul
 */
public class EnlargeButtonHandler implements EventHandler<ActionEvent> {

    private Circle circle;

    public EnlargeButtonHandler(Circle circle) {
        this.circle = circle;

    }

    @Override
    public void handle(ActionEvent event) {
        //TODO: implement my event handling logic
        System.out.println("Button Enlarge has been pressed.");
        this.circle.setRadius(circle.getRadius() + 10);

    }

}
