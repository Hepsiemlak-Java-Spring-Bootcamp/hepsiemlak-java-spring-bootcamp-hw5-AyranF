package emlakburada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import emlakburada.client.UserClient;

@RestController
public class UserController {

	@Autowired
	private UserClient userClient;

	@PostMapping("/users")
	public ResponseEntity<Object> saveUser(@RequestBody Object request) {
		return new ResponseEntity<>(userClient.saveUser(request),HttpStatus.CREATED);
	}

	@GetMapping("/users")
	public ResponseEntity<Object> getAllUser() {
		return new ResponseEntity<Object>(userClient.getAllUsers(), HttpStatus.OK);
	}

}