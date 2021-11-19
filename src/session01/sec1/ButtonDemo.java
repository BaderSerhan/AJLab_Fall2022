/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session01.sec1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author bader-aul
 */
public class ButtonDemo extends Application {

    HBox getButtonsHbox() {
        //ImageView components created by initializing path to image
        //Note that this path is for MacOS machines
        ImageView leftImage = new ImageView("file:///Users/bader-aul/NetBeansProjects/AJLab_Fall2022/left.png");
        ImageView rightImage = new ImageView("file:///Users/bader-aul/NetBeansProjects/AJLab_Fall2022/right.png");

        //Button components containing text and node of type image
        Button btnLeft = new Button("Left", leftImage);
        Button btnRight = new Button("Right", rightImage);

        //changing the content display property of the right button to move the rightImage to the right
        btnRight.setContentDisplay(ContentDisplay.RIGHT);

        //HBox pane created with insets set to 20
        HBox hbox = new HBox(20);
        //children in hbox aligned to center
        hbox.setAlignment(Pos.CENTER);

        //adding children to hbox
        hbox.getChildren().addAll(btnLeft, btnRight);
        return hbox;
    }

    @Override
    public void start(Stage primaryStage) {
        //creating scene with width set to 400 and height set to 150
        //root node is returned from getButtonsHBox function
        Scene scene = new Scene(this.getButtonsHbox(), 400, 150);

        //setting stage properties and showing it
        primaryStage.setTitle("Button Demo");
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
