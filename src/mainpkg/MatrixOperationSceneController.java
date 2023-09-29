/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class MatrixOperationSceneController implements Initializable {

    Matrix m1 = new Matrix();
    @FXML
    private TextField rowTextField;
    @FXML
    private TextField colTextField;
    @FXML
    private Label outputLabel;

    public void initialize(URL url, ResourceBundle rb) {
        m1.setMatrix(10, 10);
        m1.showMatrix();
    }    
    
    @FXML
    private void generateAndShowButtonOnClick(ActionEvent event) {
        int r, c;
        r = Integer.parseInt(rowTextField.getText());
        c = Integer.parseInt(colTextField.getText());
        m1.setMatrix(r, c);
        outputLabel.setText(m1.toString());
    }
    
}
