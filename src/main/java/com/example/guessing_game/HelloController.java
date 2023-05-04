package com.example.guessing_game;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

public class HelloController {

    @FXML
    private TextField nameField;

    @FXML
    private Circle c1;

    @FXML
    private Circle c2;

    @FXML
    private Circle c3;

    @FXML
    private Label attemptsLabel;

    @FXML
    private Label messageLabel;
    private int attempts = 2;
    private int targetNumber;
    private String names;

    @FXML
    void saveName() {
        names = nameField.getText();
        messageLabel.setText("Welcome, " + names + "!");
    }

    @FXML
    void generateNumber() {
        targetNumber = (int)(Math.random()*(3-1+1)+1);
        messageLabel.setText("Your number is generated. Guess the number and select the proper circle!");

    }

    @FXML
    void guessNow() {
        if (attempts == 0) {
            return;
        }

        if (c1.isPressed()) {
            if (targetNumber == 1) {
                System.out.println(names + " you won!");
                HelloApplication.setScreen("win");

            } else {
                attempts--;
                attemptsLabel.setText("Attempts left: " + attempts);
                if (attempts == 0) {
                    System.out.println(names + " you lost!");
                    HelloApplication.setScreen("lose");

                }
            }
        }

        if (c2.isPressed()) {
            if (targetNumber == 2) {
                System.out.println(names + " you won!");
                HelloApplication.setScreen("win");
            } else {
                attempts--;
                attemptsLabel.setText("Attempts: " + attempts);
                if (attempts == 0) {
                    System.out.println(names + " you lost!");
                    HelloApplication.setScreen("lose");
                }
            }
        }

        if (c3.isPressed()) {
            if (targetNumber == 3) {
                System.out.println(names + " you won!");
                HelloApplication.setScreen("win");
            } else {
                attempts--;
                attemptsLabel.setText("Attempts Left: " + attempts);
                if (attempts == 0) {
                    System.out.println(names + " you lost!");
                    HelloApplication.setScreen("lose");
                }
            }
        }
    }

}
