package session03;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        StackPane pane = new StackPane();
        Circle circle = new Circle(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);

        // Hold two buttons in an HBox
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("+");
        Button btShrink = new Button("-");
        hBox.getChildren().add(btEnlarge);
        hBox.getChildren().add(btShrink);

        BorderPane bp = new BorderPane();
        bp.setCenter(pane);
        bp.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        //instead of using two handlers
//        btEnlarge.setOnAction(new EnlargeButtonHandler(circle));
//        btShrink.setOnAction(new ShrinkButtonHandler(circle));
//
        //use one handler for both
        ButtonsHandler myHandler = new ButtonsHandler(circle, btEnlarge, btShrink);

        btEnlarge.setOnAction(myHandler);
        btShrink.setOnAction(myHandler);

        //Event Handling Implementation
        // Create a scene and place it in the stage
        Scene scene = new Scene(bp, 500, 500);
        primaryStage.setTitle("ControlCircle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
