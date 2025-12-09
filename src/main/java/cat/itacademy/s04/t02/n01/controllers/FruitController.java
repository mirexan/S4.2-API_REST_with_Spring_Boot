package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.model.FruitDTO;
import cat.itacademy.s04.t02.n01.services.FruitService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitController {
	private final FruitService fruitService;

	public FruitController(FruitService newFruitService){
		this.fruitService = newFruitService;
	}

	@PostMapping
	public ResponseEntity<FruitDTO> createFruit(@Valid @RequestBody FruitDTO newFruitDTO){
		FruitDTO savedFruit = fruitService.addFruit(newFruitDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedFruit);
	}
	@GetMapping
	public ResponseEntity<List<FruitDTO>> getAllFruits(){
		return ResponseEntity.status(HttpStatus.OK).body(fruitService.getAllFruits());
	}
	@PutMapping
	public ResponseEntity<FruitDTO> updateFruit( @Valid @RequestBody FruitDTO newFruitDTO){
		return null;
	}
}
