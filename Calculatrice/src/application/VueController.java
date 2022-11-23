package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.*;

public class VueController {

	@FXML
	private Text result;
	
	private String lastNumber = "";
		
	private String number = "";
	
	private String lastOperateur = "";
	
	@FXML
	void addition(ActionEvent event) {
		this.lastOperateur = "+";
		this.lastNumber = this.number;
		this.number = "";
	}
	
	@FXML
	void soustraction(ActionEvent event) {
		this.lastOperateur = "-";
		this.lastNumber = this.number;
		this.number = "";
	}
	
	@FXML
	void divison(ActionEvent event) {
		this.lastOperateur = "/";
		this.lastNumber = this.number;
		this.number = "";
	}
	
	@FXML
	void multiplication(ActionEvent event) {
		this.lastOperateur = "*";
		this.lastNumber = this.number;
		this.number = "";
	}
    
    @FXML
    void btn0Clic(ActionEvent event) {
    	ajoutNbr("0");
    }
    
    @FXML
    void btn1Clic(ActionEvent event) {
    	ajoutNbr("1");
    }
    
    @FXML
    void btn2Clic(ActionEvent event) {
    	ajoutNbr("2");
    }
    
    @FXML
    void btn3Clic(ActionEvent event) {
    	ajoutNbr("3");
    }
    
    @FXML
    void btn4Clic(ActionEvent event) {
    	ajoutNbr("4");
    }
    
    @FXML
    void btn5Clic(ActionEvent event) {
    	ajoutNbr("5");
    }
    
    @FXML
    void btn6Clic(ActionEvent event) {
    	ajoutNbr("6");
    }
    
    @FXML
    void btn7Clic(ActionEvent event) {
    	ajoutNbr("7");
    }
    
    @FXML
    void btn8Clic(ActionEvent event) {
    	ajoutNbr("8");
    }
    
    @FXML
    void btn9Clic(ActionEvent event) {
    	ajoutNbr("9");
    }
    
    @FXML
    void equal(ActionEvent event) {
    	switch(this.lastOperateur){
		case "+" :
			add();
			break;
		case "/":
			divide();
			break;
		case "*":
			multiplication();
			break;
		case "-":
			minus();
			break;
		default:
			break;
    	}
    	result.setText(this.lastNumber);
    	this.number = this.lastNumber;
    }
    
    @FXML
    void reset(ActionEvent event) {
    	this.number = "";
    	this.lastNumber = "";
    	this.lastOperateur = "";
    	majResult();
    }
    
    void ajoutNbr(String number) {
    	this.number += number;
    	majResult();
    }
    
    
    void add() {
		this.lastNumber = String.valueOf(Float.parseFloat(this.lastNumber) + Float.parseFloat(this.number));
		this.number = "";
    }
    
    void minus(){
    	this.lastNumber = String.valueOf(Float.parseFloat(this.lastNumber) - Float.parseFloat(this.number));
		this.number = "";
    }
    
    void divide() {
		this.lastNumber = String.valueOf(Float.parseFloat(this.lastNumber) / Float.parseFloat(this.number));
		this.number = "";
    }
    
    void multiplication() {
		this.lastNumber = String.valueOf(Float.parseFloat(this.lastNumber) * Float.parseFloat(this.number));
		this.number = "";
    }
  
    void majResult() {
    	result.setText(this.number);
    }
}
