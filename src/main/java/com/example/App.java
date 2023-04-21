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
        
        StackPane layout = new StackPane();
        Button plusbutton = new Button("+");
        Button minusbutton = new Button("-");
        Button plusbutton2 = new Button("+");
        Button minusbutton2 = new Button("-");
        Button plusbutton3 = new Button("+");
        Button minusbutton3 = new Button("-");
        Label label4 = new Label(" 1.5$ per person");  
        minusbutton.setPrefSize(20, 20);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("CodersLegacy");
        layout.getChildren().addAll(plusbutton);
        layout.getChildren().addAll(minusbutton);
        layout.getChildren().addAll(label4);
        Text text1 = new Text("cost");
        Text text2 = new Text("percentage");
        Text text3 = new Text("people");
        TextField textField1 = new TextField("     15$");       
        TextField textField2 = new TextField("     10%");   
        TextField textField3 = new TextField("     1");  
    

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
      gridPane.add(minusbutton, 1, 0); 
      gridPane.add(plusbutton, 3, 0); 
      gridPane.add(label4, 4, 0); 
      gridPane.add(text2, 0, 1);       
      gridPane.add(textField2, 1, 1); 
      gridPane.add(minusbutton2, 1, 1); 
      gridPane.add(plusbutton2, 3, 1); 
      gridPane.add(text3, 0, 2);       
      gridPane.add(textField3, 1, 2); 
      gridPane.add(minusbutton3, 1, 2); 
      gridPane.add(plusbutton3, 3, 2); 


      //Styling nodes  
      plusbutton.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      minusbutton.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      plusbutton2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      minusbutton2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      plusbutton3.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
      minusbutton3.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 

      text1.setStyle("-fx-font: normal bold 10px 'sans-serif' "); 
      text2.setStyle("-fx-font: normal bold 10px 'sans-serif' ");  
      text3.setStyle("-fx-font: normal bold 10px 'sans-serif' ");  
      label4.setStyle("-fx-font: normal bold 20px 'sans-serif' ");  
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