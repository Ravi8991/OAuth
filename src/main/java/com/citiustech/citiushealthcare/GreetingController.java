package com.citiustech.citiushealthcare;

import java.security.Principal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greetgoogle")
    public  ResponseEntity<String> greet() {
        return new ResponseEntity<String>("Hello To Google login World ##!!!",HttpStatus.OK);
        
    }
    @GetMapping("/greetokta")
    public  ResponseEntity<String> greeto() {
        return new ResponseEntity<String>("Hello To Okta login World ##!!!",HttpStatus.OK);
        
    }
    @GetMapping("/greetgithub")
    public  ResponseEntity<String> greetg() {
        return new ResponseEntity<String>("Hello To Git Hub login World ##!!!",HttpStatus.OK);
        
    }
	/*
	 * @GetMapping("/greetoauth") public ResponseEntity<String> greetoA() { return
	 * new ResponseEntity<String>("Hello To OAuth login World ##!!!",HttpStatus.OK);
	 * 
	 * }
	 */
}