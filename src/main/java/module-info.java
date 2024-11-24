module com.javafx.brocodetutorial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafx.brocodetutorial.episode01.stages to javafx.fxml;
    exports com.javafx.brocodetutorial.episode01.stages;
}