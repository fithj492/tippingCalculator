package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets; 
import javafx.geometry.Pos;
import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.scene.control.Label;
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
        Button plusbutton = new Button("+");
        Button minusbutton = new Button("-");
        Label label1 = new Label("hello");  
        minusbutton.setPrefSize(20, 20);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("CodersLegacy");
        layout.getChildren().addAll(plusbutton);
        layout.getChildren().addAll(minusbutton);
        layout.getChildren().addAll(label1);
        Text text1 = new Text("");
        Text text2 = new Text("");
        Text text3 = new Text("");
        TextField textField1 = new TextField();       
        TextField textField2 = new TextField();   
        TextField textField3 = new TextField();  
    

        //Creating a Grid Pane 
      GridPane gridPane = new GridPane();    

      //Setting size for the pane 
      gridPane.setMinSize(400, 200); 

      //Setting the padding  
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 

      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(10); 
      gridPane.setHgap(10);       

      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER); 

      //Arranging all the nodes in the grid 
      gridPane.add(text1, 0, 0); 
      gridPane.add(textField1, 1, 0); 
      gridPane.add(text2, 0, 1);       
      gridPane.add(textField2, 1, 1); 
      gridPane.add(text3, 1, 2);       
      gridPane.add(textField3, 1, 2); 
      gridPane.add(minusbutton, 0, 2); 
      gridPane.add(plusbutton, 2, 2); 
      gridPane.add(label1, 3, 0); 

      //Styling nodes  
      plusbutton.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      minusbutton.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 

      text1.setStyle("-fx-font: normal bold 20px 'sans-serif' "); 
      text2.setStyle("-fx-font: normal bold 20px 'sans-serif' ");  
      text3.setStyle("-fx-font: normal bold 20px 'sans-serif' ");  
      label1.setStyle("-fx-font: normal bold 20px 'sans-serif' ");  
      gridPane.setStyle("-fx-background-color: #999999;"); 

      //Creating a scene object 
      Scene scene = new Scene(gridPane); 

      stage.setTitle("CSS Example");
         
      stage.setScene(scene);
         
      stage.show();
         
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