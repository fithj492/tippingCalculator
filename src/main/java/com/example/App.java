package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        //scene = new Scene(loadFXML("primary"), 640, 480);
        
        StackPane layout = new StackPane();
        Scene scene = new Scene(layout, 640, 480);
        Button plusbutton = new Button("+");
        Button minusbutton = new Button("i tried");
        minusbutton.setPrefSize(500, 20);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("CodersLegacy");
        layout.getChildren().addAll(plusbutton);
        layout.getChildren().addAll(minusbutton);


         

         

         
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();




    }

    

}