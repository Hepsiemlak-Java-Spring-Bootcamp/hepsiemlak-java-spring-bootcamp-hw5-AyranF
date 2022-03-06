package emlakburada.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="Emlakburada-Adverts",url= "http://localhost:8080/adverts")
public interface AdvertClient {
	@PostMapping
	Object saveAdvert(Object advertRequest);
	@GetMapping
	Object getAllAdverts();
	@GetMapping(value = "/{advertno}")
	Object getAdvertByAdvertId(@PathVariable("advertno") int advertno);
}