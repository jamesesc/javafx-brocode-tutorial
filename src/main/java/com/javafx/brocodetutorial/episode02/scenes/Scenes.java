package com.javafx.brocodetutorial.episode02.scenes;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Scenes extends Application {
    public static void main(String[] theArgs) throws Exception {
        launch(theArgs);
    }


    @Override
    public void start(Stage theStage) {
        Group root = new Group();

        Scene scene = new Scene(root, 600, 600, Color.ORANGE);

        Text text = new Text();
        
        text.setText("WElCOME TO JAVAFX");
        
        text.setX(200);
        text.setY(50);

        text.setFont(Font.font("Verdana", 20));
        text.setFill(Color.DARKBLUE);

        root.getChildren().add(text);


        Line line = new Line();

        line.setStartX(200);
        line.setStartY(300);

        line.setEndX(500);
        line.setEndY(200);

        line.setStrokeWidth(50);

        line.setStroke(Color.YELLOW);

        line.setOpacity(0.5);

        line.setRotate(45);

        root.getChildren().add(line);

        Rectangle rectangle = new Rectangle();

        rectangle.setX(250);
        rectangle.setY(280);

        rectangle.setWidth(100);
        rectangle.setHeight(100);

        rectangle.setFill(Color.HOTPINK);

        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.PURPLE);

        root.getChildren().add(rectangle);

        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(555.0, 250.0, 525.0, 350.0, 585.0, 350.0);

        triangle.setFill(Color.ROSYBROWN);
        root.getChildren().add(triangle);

        Circle circle = new Circle();
        circle.setCenterX(320);
        circle.setCenterY(155);

        circle.setRadius(50);

        circle.setFill(Color.PALEGOLDENROD);
        root.getChildren().add(circle);

        Image image = new Image(getClass().getResourceAsStream("/episode02/Luffy.png"));


        ImageView imageView = new ImageView(image);
        imageView.setX(0);
        imageView.setY(50);
        imageView.autosize();
        root.getChildren().add(imageView);

        theStage.setResizable(false);
        theStage.setScene(scene);
        theStage.show();

    }
}
