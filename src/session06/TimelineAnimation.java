/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session06;

import javafx.animation.KeyFrame;
import javafx.animation.ParallelTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author bader-aul
 */
public class TimelineAnimation extends Application {

    int index = 1;

    @Override
    public void start(Stage primaryStage) {
        ImageView backgroundImage = new ImageView("File:images/bg.jpg"); //File path on macOS => change to appropriate path for Windows machines

        //set first image to display of the animated series
        ImageView animatedImage = new ImageView("File:images/" + (index) + ".png");
        animatedImage.setFitHeight(500);
        animatedImage.setPreserveRatio(true);

        //Timeline
        Timeline animation = new Timeline();
        EventHandler<ActionEvent> eh = new EventHandler() {
            @Override
            public void handle(Event event) {
                if (index == 9) {
                    index = 1;
                    //or index = index / 9;
                }
                index++;
                animatedImage.setImage(new Image("File:images/" + (index) + ".png"));
            }
        };

        KeyFrame kf = new KeyFrame(Duration.millis(100), eh);

//        Timeline animation = new Timeline(kf);
        animation.getKeyFrames().add(kf);
        animation.setCycleCount(Timeline.INDEFINITE);
//        animation.play();

        TranslateTransition tt = new TranslateTransition();
        tt.setNode(animatedImage);
        tt.setCycleCount(Timeline.INDEFINITE);
        tt.setFromX(-400);
        tt.setToX(800);
        tt.setDuration(Duration.millis(5000));
//        tt.play();

        ParallelTransition pt = new ParallelTransition(animation, tt);
        pt.play();

//create a stack pane to show two images on top of each other (animatedImage on top of backgroundImage)
        StackPane root = new StackPane();
        root.getChildren().addAll(backgroundImage, animatedImage);
        root.setAlignment(Pos.BOTTOM_LEFT);

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("Animation Demo");
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
