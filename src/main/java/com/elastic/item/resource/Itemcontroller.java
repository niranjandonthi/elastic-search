package com.elastic.item.resource;
import org.springframework.web.bind.annotation.RestController;
import com.elastic.item.model.Items;
import com.elastic.item.repository.ItemsRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class Itemcontroller {
	@Autowired
	ItemsRepository repository;
	@GetMapping(value="/items")
	public List<Items> searchAll(){
		List<Items> usersList = new ArrayList<>();
        Iterable<Items> userses = repository.findAll();
        userses.forEach(usersList::add);
         return usersList;
}

	@GetMapping("/items/id/{id}")
	public Optional<Items> findbyid(@PathVariable Integer id) {
	return repository.findById(id);
}
	@DeleteMapping("/items/id/{id}")
	public void deleteItem(@PathVariable Integer id) {
		repository.deleteById(id);
	}
	@PostMapping("/items")
	public Items addStudent(@RequestBody Items item ){
		return repository.save(item);
	}
}
