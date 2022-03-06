package emlakburada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import emlakburada.client.AdvertClient;

@RestController
public class AdvertController {

	@Autowired
	private AdvertClient advertClient;

	@PostMapping(value = "/adverts")
	public ResponseEntity<Object> createAdvert(@RequestBody Object advertRequest) throws Exception {
		return new ResponseEntity<>(advertClient.saveAdvert(advertRequest), HttpStatus.OK);
	}

	@GetMapping(value = "/adverts")
	public ResponseEntity<Object> getAllAdvert() throws Exception {
		return new ResponseEntity<>(advertClient.getAllAdverts(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/adverts/{advertNo}")
	public ResponseEntity<Object> getAdvertByAdvertId(@PathVariable(required = false) int advertNo) {
		return new ResponseEntity<>(advertClient.getAdvertByAdvertId(advertNo), HttpStatus.OK);
	}
}