package com.crisdavidpz.restfulapi.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

	@GetMapping("/v1/person")
	public PersonV1 retrievePersonV1() {
		return new PersonV1("David el Gnomo");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 retrievePersonV2() {
		return new PersonV2(new Name("Solecito", "Ramírez"));
	}
}
