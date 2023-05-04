module com.example.guessing_game {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guessing_game to javafx.fxml;
    exports com.example.guessing_game;
}