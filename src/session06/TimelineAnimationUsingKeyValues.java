package session06;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

//Thanks to Fadi Tawbi!
public class TimelineAnimationUsingKeyValues extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();
        Image[] images = new Image[]{
            new Image("File:images/1.png"),
            new Image("File:images/2.png"),
            new Image("File:images/3.png"),
            new Image("File:images/4.png"),
            new Image("File:images/5.png"),
            new Image("File:images/6.png"),
            new Image("File:images/7.png"),
            new Image("File:images/8.png"),
            new Image("File:images/9.png")
        };

        ImageView imv = new ImageView(images[0]);
        imv.setFitHeight(300);
        imv.setPreserveRatio(true);

        Background bg = new Background(new BackgroundImage(
                new Image("File:images/bg.jpg"),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
                new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true)));

        root.getChildren().add(imv);
        imv.setX(50);
        imv.setY(300);

        Timeline animation = new Timeline();
        animation.setCycleCount(Timeline.INDEFINITE);

        KeyValue kv1 = new KeyValue(imv.imageProperty(), images[1]);
        KeyValue kv2 = new KeyValue(imv.imageProperty(), images[2]);
        KeyValue kv3 = new KeyValue(imv.imageProperty(), images[3]);
        KeyValue kv4 = new KeyValue(imv.imageProperty(), images[4]);
        KeyValue kv5 = new KeyValue(imv.imageProperty(), images[5]);
        KeyValue kv6 = new KeyValue(imv.imageProperty(), images[6]);
        KeyValue kv7 = new KeyValue(imv.imageProperty(), images[7]);
        KeyValue kv8 = new KeyValue(imv.imageProperty(), images[8]);

        KeyFrame kf1 = new KeyFrame(Duration.millis(100), kv1);
        KeyFrame kf2 = new KeyFrame(Duration.millis(200), kv2);
        KeyFrame kf3 = new KeyFrame(Duration.millis(300), kv3);
        KeyFrame kf4 = new KeyFrame(Duration.millis(400), kv4);
        KeyFrame kf5 = new KeyFrame(Duration.millis(500), kv5);
        KeyFrame kf6 = new KeyFrame(Duration.millis(600), kv6);
        KeyFrame kf7 = new KeyFrame(Duration.millis(700), kv7);
        KeyFrame kf8 = new KeyFrame(Duration.millis(800), kv8);

        animation.getKeyFrames().addAll(kf1, kf2, kf3, kf4, kf5, kf6, kf7, kf8);

        animation.play();
        root.setBackground(bg);

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("Dog Animation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
