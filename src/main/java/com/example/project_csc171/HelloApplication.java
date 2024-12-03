package com.example.project_csc171;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

//hhello

public class HelloApplication extends Application {
    // Declare mediaPlayer as a class field to prevent garbage collection
    private MediaPlayer mediaPlayer;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        scene.getRoot().requestFocus();
        stage.setTitle("Ninja Game");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        URL musicURL = getClass().getResource("/music/backtracks.mp3");
        Media background = new Media(musicURL.toExternalForm());
        mediaPlayer = new MediaPlayer(background);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();
    }

    public static void main(String[] args) {
        launch();
    }
}