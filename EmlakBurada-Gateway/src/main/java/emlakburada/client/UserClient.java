package emlakburada.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="Emlakburada-Users",url= "http://localhost:8080/users")
public interface UserClient {
	@PostMapping(value = "")
	Object saveUser(Object userRequest);
	@GetMapping(value = "")
	Object getAllUsers();
}