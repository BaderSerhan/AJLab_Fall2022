/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session01.sec1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author bader-aul
 */
public class TextFieldDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        TextField tf = new TextField();
        tf.setStyle("-fx-text-fill:green; -fx-border-color:blue;");
        tf.setPrefColumnCount(15);
        tf.setPromptText("Enter your message: ");

        HBox hbox1 = new HBox();
        hbox1.setAlignment(Pos.CENTER);
        hbox1.getChildren().add(tf);
        hbox1.setBackground(new Background(new BackgroundFill(Color.ROSYBROWN, CornerRadii.EMPTY, Insets.EMPTY)));

        //place hbox1 which includes the text field
        //and hbox2 which includes the buttons
        //inside the vbox
        ButtonDemo btnClass = new ButtonDemo();

        HBox hbox2 = btnClass.getButtonsHbox();

        VBox vbox = new VBox(hbox1, hbox2);
        Scene scene = new Scene(vbox, 400, 150);

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
