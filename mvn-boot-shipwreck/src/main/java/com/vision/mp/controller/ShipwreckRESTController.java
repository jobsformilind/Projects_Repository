package com.vision.mp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vision.mp.model.Shipwreck;

@RestController
@RequestMapping("api/v1")
public class ShipwreckRESTController {

	@RequestMapping(value = "/shipwrecks", method = RequestMethod.GET)
	public List<Shipwreck> shipwrecks() {
		return ShipwreckStub.list();
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
	public Shipwreck get(@PathVariable Long id) {
		return ShipwreckStub.get(id);
	}

	@RequestMapping(value = "/shipwrecks", method = RequestMethod.POST)
	public Shipwreck add(@RequestBody Shipwreck wreck) {
		return ShipwreckStub.create(wreck);
	}

	@RequestMapping(value = "/shipwrecks/{id}", method = RequestMethod.PUT)
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck wreck) {
		return ShipwreckStub.update(id, wreck);
	}

	@RequestMapping(value = "/shipwrecks/{id}", method = RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable Long id) {
		return ShipwreckStub.delete(id);
	}

	@RequestMapping(value = "/shipwrecks/{id}/print", method = RequestMethod.GET)
	public void print(@PathVariable Long id) {
		Shipwreck wreck = ShipwreckStub.get(id);
		System.out.println(wreck);
	}
}
