package cat.itacademy.s04.t02.n01.exceptions;

import cat.itacademy.s04.t02.n01.model.FruitDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(FruitNotFoundException.class)
	public ResponseEntity<String> handleFruitNotFoundException(FruitNotFoundException ex){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}
}
