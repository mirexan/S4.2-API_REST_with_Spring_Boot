package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.exceptions.FruitNotFoundException;
import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.model.FruitDTO;
import cat.itacademy.s04.t02.n01.repository.FruitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService{
private final FruitRepository fruitRepository;

public FruitServiceImpl(FruitRepository fruitRepository){
	this.fruitRepository = fruitRepository;
}
	public FruitDTO fruitToFruitDTO(Fruit fruit){
		return new FruitDTO(
				fruit.getId(),
				fruit.getName(),
				fruit.getWeightInKilos()
		);
	}
	@Override
	public FruitDTO addFruit(FruitDTO newFruitDTO) {
		Fruit newFruit = new Fruit(
			null,
			newFruitDTO.name(),
			newFruitDTO.weightInKilos());
		Fruit savedNewFruit = fruitRepository.save(newFruit);
		return fruitToFruitDTO(savedNewFruit);
	}
	public FruitDTO getFruitById(long id) {
	Fruit foundFruit = fruitRepository.findById(id)
			.orElseThrow(()-> new FruitNotFoundException("Fruit not found with id : " + id));
	return fruitToFruitDTO(foundFruit);
	}
	public List<FruitDTO> getAllFruits() {
	return null;
	}
	public FruitDTO updateFruitById(long id, FruitDTO newFruitDTO) {
	return null;
	}
	public void deleteFruitById(long id){
	}
}
