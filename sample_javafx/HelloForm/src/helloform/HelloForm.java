/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloform;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author csc190
 */
class NumberedButton extends Button{
    int id;
    NumberedButton(int id){
        this.id = id;
        this.setText("Button " + this.id);
        int localid = id;
        this.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.out.println("Button " + localid + " clicked!");
            }
        });
    }
}
public class HelloForm extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World 2!");
                MyForm f1 = new MyForm();
                f1.show();
            }
        });
        
        GridPane root = new GridPane();
        //root.getChildren().add(btn);
        root.add(new NumberedButton(1), 0, 0);
        root.add(new NumberedButton(2), 0, 1);
        root.add(btn, 0, 2);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //Scene scene2 = new Scene(root, 600, 250);
        //primaryStage.setScene(scene2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
