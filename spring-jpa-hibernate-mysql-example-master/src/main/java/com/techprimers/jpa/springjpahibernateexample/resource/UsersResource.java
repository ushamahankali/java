package com.techprimers.jpa.springjpahibernateexample.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.jpa.springjpahibernateexample.model.Users;
import com.techprimers.jpa.springjpahibernateexample.repository.UsersRepository;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

	@Autowired
	UsersRepository usersRepository;

	@GetMapping("/all")
	public List<Users> getAll() {
		return usersRepository.findAll();
	}

	@GetMapping("/id/{id}")
	public Users getId(@PathVariable("id") final Integer id) {
		return usersRepository.findOne(id);
	}

	@GetMapping("/{name}")
	public List<Users> getUser(@PathVariable("name") final String name) {

		return usersRepository.findByName(name);
		/*
		 * Optional<List<Users>> ListOptional = usersRepository.findByName(name);
		 *
		 * List<Users> users = ListOptional.orElseThrow(() -> new
		 * RuntimeException("no users found"));
		 *
		 * // .orElse(new ArrayList<>()); if (ListOptional.isPresent()) {
		 * ListOptional.get(); }
		 *
		 * return users;
		 */
	}

	@GetMapping("/update/{id}/{name}")
	public Users update(@PathVariable("id") final Integer id, @PathVariable("name") final String name) {

		Users users = getId(id);
		users.setName(name);

		return usersRepository.save(users);
	}

}
