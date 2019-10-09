package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}
	@RequestMapping("/Doctor/{docNbr}")
	@ResponseBody
	public Object returnDoctor(@PathVariable int docNbr ){
		Doctor doctor = new Doctor("Hulk", docNbr);
			if(docNbr < 1 || docNbr > 13){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de récupérer l'incarnation " + docNbr);
		}
			else if(docNbr >= 1 && docNbr <= 8){
				throw new ResponseStatusException(HttpStatus.SEE_OTHER, "Choose another one");
		}
		else{
			if(docNbr == 9){
				doctor.setName("Christopher Eccleston");
			}
			if(docNbr == 10){
				doctor.setName("David Tennant");
			}
			if(docNbr == 11){
				doctor.setName("Matt Smith");
			}
			if(docNbr == 12){
				doctor.setName("Peter Capaldi");
			}
			if(docNbr == 13){
				doctor.setName("Jodie Whittaker");
			}
		return doctor;
		}
	}
}
