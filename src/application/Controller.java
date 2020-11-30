package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

		private double var1,var2;
		private String operator="";
		private String display="";
		
	 @FXML 
	 private Button btn_one;
	 @FXML 
	 private Button btn_two;
	 @FXML 
	 private Button btn_three;
	 @FXML 
	 private Button btn_four;
	 @FXML 
	 private Button btn_five;
	 @FXML 
	 private Button btn_six;
	 @FXML 
	 private Button btn_seven;
	 @FXML 
	 private Button btn_eight;
	 @FXML 
	 private Button btn_nine;
	 @FXML 
	 private Button btn_zero;
	
	 	@FXML
	    public void initialize() {
	 		view.setEditable(false);
	    }
	 
	 @FXML
	 private TextField view;
	 
	public void addition() {
		operator="+";
		var1=Double.parseDouble(display);
		display="";
	}
	
	public void subtraction() {
		operator="-";
		var1=Double.parseDouble(display);
		display="";
	}
	public void multiply() {
		operator="*";
		var1=Double.parseDouble(display);
		display="";
	}
	public void divide() {
		operator="/";
		var1=Double.parseDouble(display);
		display="";
	}
	
	
	public void equals() {
		double result = 0;
		var2=Double.parseDouble(display);
		
		if(operator.equals("+")) {
			result = var1 + var2;
		}
		else if(operator.equals("-")) {
			result = var1 - var2;
		}
		else if(operator.equals("*")) {
			result = var1 * var2;
		}
		else if(operator.equals("/")) {
			result = var1 / var2;
		}
		view.setText(Double.toString(result));
		}
		
		
		
		
	
	 
	public void pressOne(){
		
		display+=btn_one.getText();
		view.setText(display);
	}
	
	public void pressTwo(){
		
		display+=btn_two.getText();
		view.setText(display);
	}
	
	public void pressThree() {
		display+=btn_three.getText();
		view.setText(display);
	}
	
	public void pressFour(){
		display+=btn_four.getText();
		view.setText(display);
	}
	public void pressFive(){
		display+=btn_five.getText();
		view.setText(display);
	}
	public void pressSix(){
		display+=btn_six.getText();
		view.setText(display);
	}
	public void pressSeven(){
		display+=btn_seven.getText();
		view.setText(display);
	}
	public void pressEight(){
		display+=btn_eight.getText();
		view.setText(display);
	}
	public void pressNine(){
		display+=btn_nine.getText();
		view.setText(display);
	}
	public void pressZero(){
		display+=btn_zero.getText();
		view.setText(display);
	}
	public void clear() {
		display="";
		view.setText(display);

	}
}
