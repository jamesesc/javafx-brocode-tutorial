package com.javafx.brocodetutorial.episode01.stages; // The package for this file

import javafx.application.Application; // To setup javaFX
import javafx.scene.Group; // Grouping for Scene
import javafx.scene.Scene; // Setting the Scene
import javafx.scene.image.Image; // Allowing Image
import javafx.scene.input.KeyCombination; // Allowing KeyComb
import javafx.scene.paint.Color; // Scene color
import javafx.stage.Stage; // Setting the Stage

public class Stages extends Application {
    public static void main(String[] theArgs) {
        // Calling our start method from Application
        launch(theArgs);
    }

    // Method from our Parent Class (Application), Overriding it
    @Override
    public void start(Stage theStage) {
        // Stage stage = new stage(); ~ Setup another stage

        // Setting a group name root
        Group root = new Group();
        // Passing through our group (root) in our Scene; Making Scene blue
        Scene scene = new Scene(root, Color.LIGHTBLUE);
        // scene.setFill(Color.LIGHTBLUE; Other way to set Scene color

        // Initializing an image to an Image var: Getting it from our resources file
        Image icon = new Image(getClass().getResourceAsStream("/episode01/Zoro-Smiling.jpg"));
        // Setting that image as our Stage icon
        theStage.getIcons().add(icon);

        // Stage methods: Chang size (w,l), Allowed resizing, Allowed FullScreen
        theStage.setWidth(200);
        theStage.setHeight(300);
        theStage.setResizable(false);
        theStage.setFullScreen(true);

        // Stage methods for exit: Exit Hint; Exit Combo Key
        theStage.setFullScreenExitHint("Press ESC to exit");
        theStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        // Passing our Scene to our stage
        theStage.setScene(scene);
        // Showing our stage
        theStage.show();
    }

}