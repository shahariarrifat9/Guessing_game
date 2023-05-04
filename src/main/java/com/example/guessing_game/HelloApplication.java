package com.example.guessing_game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class HelloApplication extends Application {

    private static HashMap<String, AnchorPane> screens = new HashMap<>();
    private static Scene mainScene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        loadScreens();

        mainScene = new Scene(screens.get("game"));

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void setScreen(String screenName) {
        mainScene.setRoot(screens.get(screenName));
    }

    private void loadScreens() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
        screens.put("game", loader.load());

        loader = new FXMLLoader(getClass().getResource("win.fxml"));
        screens.put("win", loader.load());

        loader = new FXMLLoader(getClass().getResource("lose.fxml"));
        screens.put("lose", loader.load());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
