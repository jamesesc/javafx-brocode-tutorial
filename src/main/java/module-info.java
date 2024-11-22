module com.javafx.brocodetutorial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafx.brocodetutorial to javafx.fxml;
    exports com.javafx.brocodetutorial;
}