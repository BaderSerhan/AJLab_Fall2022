/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

/**
 *
 * @author bader-aul
 */
public class ButtonsHandler implements EventHandler<ActionEvent> {

    private Circle circle;
    private Button enlarge, shrink;

    public ButtonsHandler(Circle circle, Button enlarge, Button shrink) {
        this.circle = circle;
        this.enlarge = enlarge;
        this.shrink = shrink;

    }

    @Override
    public void handle(ActionEvent event) {
        //TODO: implement my event handling logic

        //casting an object into a button to access its properties
        Button myBtn = (Button) event.getSource();

        //checking if the source is a certain type of control
        if (event.getSource() instanceof TextField) {
            System.out.println("A TextField triggered the handler.");
        }

        // comparing the button text => not recommended since text can change
//        if (myBtn.getText().equals("Enlarge")) {
//            System.out.println("Button Enlarge has been pressed.");
//            this.circle.setRadius(circle.getRadius() + 10);
//        }
//
//        if (myBtn.getText().equals("Shrink")) {
//            System.out.println("Button Shrink has been pressed.");
//            this.circle.setRadius(circle.getRadius() - 10);
//        }
        //better approach, to compare the button objects themselves
        if (event.getSource().equals(enlarge)) {
            System.out.println("Button Enlarge has been pressed.");
            this.circle.setRadius(circle.getRadius() + 10);
        }

        if (event.getSource().equals(shrink)) {
            System.out.println("Button Shrink has been pressed.");
            this.circle.setRadius(circle.getRadius() - 10);
        }
    }

}
