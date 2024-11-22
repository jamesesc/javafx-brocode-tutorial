package com.javafx.brocodetutorial.episode01.stages;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Stages extends Application {
    public static void main(String[] theArgs) {
        launch(theArgs);
    }

    @Override
    public void start(Stage theStage) {

        Group root = new Group();
        Scene scene = new Scene(root, Color.LIGHTBLUE);
        scene.setFill(Color.LIGHTBLUE);

        Image icon = new Image(getClass().getResourceAsStream("/episode01/Zoro-Smiling.jpg"));
        theStage.getIcons().add(icon);

        theStage.setWidth(200);
        theStage.setHeight(300);
        theStage.setResizable(false);

        theStage.setFullScreen(true);
        
        theStage.setFullScreenExitHint("Press ESC to exit");
        theStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));


        theStage.setScene(scene);

        theStage.show();
    }

}
