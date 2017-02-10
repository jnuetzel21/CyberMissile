package helloform;


import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csc190
 */
public class MyForm extends Stage{
    public MyForm(){
        GridPane root = new GridPane();
        //root.getChildren().add(btn);
        Text t1 = new Text("TestForm");
        root.add(t1, 0, 0);
        
        Scene scene = new Scene(root, 300, 250);
        
        this.setTitle("Hello World!");
        this.setScene(scene);
    }
}
