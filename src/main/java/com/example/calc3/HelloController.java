package com.example.calc3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Text output;
    private int num1 = 0;
    private int num2 = 0;

    private boolean start = true;

    private String oper = "";
    private Model model = new Model();

    @FXML
    private void num(ActionEvent event){
        if(start){
            output.setText("");
            start=false;
        }
        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText()+value);
    }
    @FXML
    private void op(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if(!"=".equals(value)){
            if(!oper.isEmpty()) return;
            oper = value;
            num1 = Integer.parseInt(output.getText());
            output.setText("");
        }
        else {
            if(oper.isEmpty()) return;
            output.setText(String.valueOf(model.calc(num1,Integer.parseInt(output.getText()),oper)));
            oper = "";
            start = true;
        }
    }

}