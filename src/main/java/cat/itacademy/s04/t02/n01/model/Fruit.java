package cat.itacademy.s04.t02.n01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Fruit{
		@Id
		@GeneratedValue
		Long id;
		String name;
		int weightInKilos;

	public Fruit(Long id,String name, int weightInKilos) {
		this.id = id;
		this.name = name;
		this.weightInKilos = weightInKilos;
	}

}
