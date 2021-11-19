/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session01.sec2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author bader-aul
 */
public class TextFieldDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        //create TextField component
        TextField tf = new TextField();

        //set text style using CSS
        tf.setStyle("-fx-text-fill: green; -fx-border-color: blue");
        //set text font family and size
        tf.setFont(Font.font("Times", 15));
        //set prompt text (placeholder text)
        tf.setPromptText("Enter your message :");

        //create hbox pane and add TextField to it
        HBox hbox = new HBox();
        hbox.getChildren().add(tf);
        //set background color of hbox
        hbox.setBackground(new Background(new BackgroundFill(Color.ROSYBROWN, CornerRadii.EMPTY, Insets.EMPTY)));

        //align hbox children to center
        hbox.setAlignment(Pos.CENTER);
        //set hbox padding to 20
        hbox.setPadding(new Insets(20));

        //create scene with hbox inside, width 200, and height 100
        Scene scene = new Scene(hbox, 200, 100);

        primaryStage.setTitle("TextField Demo");
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
