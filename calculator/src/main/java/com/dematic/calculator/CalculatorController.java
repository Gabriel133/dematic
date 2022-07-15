package com.dematic.calculator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculatorController {
	
	private Calculator calculator;
	
	@RequestMapping(value="/calculator", method=RequestMethod.POST)
	public ResponseEntity<String> calculator(@RequestBody CalculatorRequestBody req){
		
		switch (req.getOperationId()) {
			case "Plus":
				calculator = new Plus(req.getFirstVal(), req.getSecondVal());
				break;
			case "Minus":
				calculator = new Minus(req.getFirstVal(), req.getSecondVal());
				break;
			case "Divide":
				calculator = new Divide(req.getFirstVal(), req.getSecondVal());
				break;
			case "Multiplication":
				calculator = new Multiplication(req.getFirstVal(), req.getSecondVal());
				break;
			default:
				break;
		}
		
		return new ResponseEntity<>("Output: " + calculator.result(), HttpStatus.OK);
		
	}
	
}
