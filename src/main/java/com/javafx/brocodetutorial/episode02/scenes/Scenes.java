package com.javafx.brocodetutorial.episode02.scenes; // The package for this file

import javafx.application.Application; // To setup JavaFX
import javafx.scene.Group; // The group within Scene
import javafx.scene.Scene; // To set up for Scene
import javafx.scene.image.Image; // Use img in a var
import javafx.scene.image.ImageView; // To see the img
import javafx.scene.paint.Color; // To color Scene
import javafx.scene.shape.Circle; // To draw Circle in Scene
import javafx.scene.shape.Line; // To draw Line in Scene
import javafx.scene.shape.Polygon; // To draw Polygon in Scene
import javafx.scene.shape.Rectangle; // To draw Rectangle in Scene
import javafx.scene.text.Font; // To set Text font
import javafx.scene.text.Text; // To set up text
import javafx.stage.Stage; // Setting our Stage

public class Scenes extends Application {
    public static void main(String[] theArgs) throws Exception {
        launch(theArgs); // To call Application JavaFX
    }

    @Override
    public void start(Stage theStage) {
        // Setting our Root Group
        Group root = new Group();

        // Passing our Group (root), Size:W,L, Color
        Scene scene = new Scene(root, 600, 600, Color.ORANGE);

        // Setting text
        Text text = new Text();
        // Setting up the text
        text.setText("WElCOME TO JAVAFX");
        // Text position: X, Y
        text.setX(200);
        text.setY(50);
        // Text properties: Font, Text_Color
        text.setFont(Font.font("Verdana", 20));
        text.setFill(Color.DARKBLUE);
        // Adding the text to our Root Group
        root.getChildren().add(text);

        // Setting a line
        Line line = new Line();
        // Setting line position start: X, Y
        line.setStartX(200);
        line.setStartY(300);
        // Setting line position end: X, Y
        line.setEndX(500);
        line.setEndY(200);
        // Setting line properties: Width, Color, Opacity, Rotation
        line.setStrokeWidth(50);
        line.setStroke(Color.YELLOW);
        line.setOpacity(0.5);
        line.setRotate(45);
        // Adding line to our Root Group
        root.getChildren().add(line);

        // Setting up Rectangle
        Rectangle rectangle = new Rectangle();
        // Setting rectangle position: X, Y
        rectangle.setX(250);
        rectangle.setY(280);
        // Setting rectangle properties: W, H
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        // Setting rectangle properties: Fill, Width, Stroke
        rectangle.setFill(Color.HOTPINK);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.PURPLE);
        // Adding our rectangle to our Root Group
        root.getChildren().add(rectangle);

        // Setting up a Polygon Triangle
        Polygon triangle = new Polygon();
        // Setting up triangle position; Top, Right, Left points
        triangle.getPoints().addAll(555.0, 250.0, 525.0, 350.0, 585.0, 350.0);
        // Setting triangle properties: Color
        triangle.setFill(Color.ROSYBROWN);
        // Adding triangle to our Root Group
        root.getChildren().add(triangle);

        // Setting up a Circle
        Circle circle = new Circle();
        // Setting circle position (Center): X, Y
        circle.setCenterX(320);
        circle.setCenterY(155);
        // Setting circle properties: Radius, Color
        circle.setRadius(50);
        circle.setFill(Color.PALEGOLDENROD);
        // Adding circle to our Root Group
        root.getChildren().add(circle);

        // Setting an img to a Image var
        Image image = new Image(getClass().getResourceAsStream("/episode02/Luffy.png"));
        // Setting that img to an imageView
        ImageView imageView = new ImageView(image);
        // Setting img position: X, Y, Size
        imageView.setX(0);
        imageView.setY(50);
        imageView.autosize();
        // Adding imageView (var image) to our Root Group
        root.getChildren().add(imageView);

        // Setting stage sizeable
        theStage.setResizable(false);
        // Adding scene to our stage
        theStage.setScene(scene);
        // Showing our stage
        theStage.show();
    }
}
