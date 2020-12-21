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
	
	@GetMapping(value = "/person/param", params = "version=1")
	public PersonV1 retrievePersonV1withParam() {
		return new PersonV1("David el Gnomo");
	}
	
	@GetMapping(value = "/person/param", params = "version=2")
	public PersonV2 retrievePersonV2withParam() {
		return new PersonV2(new Name("Solecito", "Ramírez"));
	}
	
	@GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
	public PersonV1 retrievePersonV1withHeader() {
		return new PersonV1("David el Gnomo");
	}
	
	@GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
	public PersonV2 retrievePersonV2withHeader() {
		return new PersonV2(new Name("Solecito", "Ramírez"));
	}
	
	@GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v1+json")
	public PersonV1 retrievePersonV1withProduces() {
		return new PersonV1("David el Gnomo");
	}
	
	@GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v2+json")
	public PersonV2 retrievePersonV2withProduces() {
		return new PersonV2(new Name("Solecito", "Ramírez"));
	}
}
