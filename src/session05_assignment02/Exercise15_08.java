package session05_assignment02;

//import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise15_08 extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Rectangle rectangle = new Rectangle(40, 40, 20, 30);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);

        Circle circle = new Circle();
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);

        Text text = new Text();
        pane.getChildren().addAll(circle, rectangle, text);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Exercise15_08"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        pane.setOnMouseClicked(e -> {
            //TODO
            circle.setCenterX(e.getX());
            circle.setCenterY(e.getY());
            circle.setRadius(30);

            text.setX(e.getX() + circle.getRadius());
            text.setY(e.getY() - circle.getRadius());

            //1st point
            boolean first = circle.contains(rectangle.getX(), rectangle.getY());
            //2nd point
            boolean second = circle.contains(rectangle.getX() + rectangle.getWidth(), rectangle.getY());
            //3rd point
            boolean third = circle.contains(rectangle.getX() + rectangle.getWidth(), rectangle.getY() + rectangle.getHeight());
            //4th point
            boolean fourth = circle.contains(rectangle.getX(), rectangle.getY() + rectangle.getHeight());

            if (first && second && third && fourth) {
                text.setText("Circle contains rectangle");

            } else if (circle.intersects(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight())) { //intersects
                text.setText("Circle intersects rectangle");

            } else {
                text.setText("Circle is outside the rectangle");
            }
        });

    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
