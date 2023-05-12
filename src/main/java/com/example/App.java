package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets; 
import javafx.geometry.Pos;
import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;


import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;


	public static double tip(double billAmt, double percentage) {
		return billAmt * (percentage/100);

	}


    @Override
    public void start(Stage stage) throws IOException {
        // new int variables

        Spinner<Integer> cost = new Spinner<Integer>();
        SpinnerValueFactory<Integer> damageInputValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 9999);
        cost.setValueFactory(damageInputValueFactory);

        Spinner<Integer> percent = new Spinner<Integer>();
        SpinnerValueFactory<Integer> strengthInputValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 9999);
        percent.setValueFactory(strengthInputValueFactory);

        Spinner<Integer> people = new Spinner<Integer>();
        SpinnerValueFactory<Integer> critDamageInputValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 9999);
        people.setValueFactory(critDamageInputValueFactory);


        // new objects
        StackPane layout = new StackPane();
        
        Label label = new Label();  
        Label label1 = new Label(" 1.5$ per person");  
        Label label2 = new Label("     10%");  
        Label label3 = new Label("     1");  
        Label outPutLabel = new Label("hello");
        HBox hbox = new HBox(5);
        VBox vbox = new VBox();
        Text text1 = new Text("cost");
        Text text2 = new Text("percentage");
        Text text3 = new Text("people");     
        Button calculateButton = new Button("Calculate");

        // scene stuff
        stage.setScene(scene);
        stage.show();
        stage.setTitle("CodersLegacy");
        // font
        layout.getChildren().addAll(label);
        Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
        label.setFont(font);
        // vbox & hbox
        vbox.setSpacing(5);
        hbox.setPadding(new Insets(10, 10, 10, 25));
        vbox.setPadding(new Insets(10, 10, 10, 25));
        hbox.getChildren().addAll(label1, cost, label2, percent, label3, people);
        vbox.getChildren().addAll(label, hbox);
        // editable
        cost.setEditable(true);
        percent.setEditable(true);
        people.setEditable(true);
        // size of things
        cost.setPrefSize(75, 25);
        percent.setPrefSize(75, 25);
        people.setPrefSize(75, 25);


        //calculating button work

        calculateButton.setOnAction(action -> {
            //Get Inputs
            double damage = cost.getValue();
            double strength = percent.getValue();
            double critDamage = people.getValue();

            //Results
            double damageOutput = ((damage + 5) * (1 + strength/100));
            double critDamageOutput = ((damage + 5) * (1 + strength/100)) * (1 + critDamage/100);
            String damageOutputString = "" + damageOutput;
            String critDamageOutputString = "" + critDamageOutput;
            //Display
            outPutLabel.setText(damageOutputString);
            outPutLabel.setText(critDamageOutputString);
        });

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
      gridPane.add(cost, 1, 0); 
      gridPane.add(percent, 1, 1); 
      gridPane.add(people, 1, 2); 
      gridPane.add(label, 4, 0); 
      gridPane.add(text2, 0, 1);        
      gridPane.add(text3, 0, 2);      
      gridPane.add(outPutLabel, 3, 0);   

      


      //Styling nodes

      text1.setStyle("-fx-font: normal bold 10px 'sans-serif' "); 
      text2.setStyle("-fx-font: normal bold 10px 'sans-serif' ");  
      text3.setStyle("-fx-font: normal bold 10px 'sans-serif' ");  
      label.setStyle("-fx-font: normal bold 20px 'sans-serif' ");  
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