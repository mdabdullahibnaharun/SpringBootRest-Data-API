package com.abdullah.tropic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class TropicController {

	@Autowired
	private TropicService tropicService;

	@RequestMapping("/tropics")
	public List<Tropic> getAllTropics() {
		return tropicService.getAllTropics();
	}
	
	@RequestMapping("/tropics/{id}")
	public Tropic getTropic(@PathVariable String id) {
		return tropicService.getTropic(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST , value = "/tropics")
	public void addTropic(@RequestBody Tropic tropic) {
		tropicService.addTropic(tropic);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/tropics/{id}")
	public void updateTropic(@RequestBody Tropic tropic,@PathVariable String id) {
		tropicService.updateTropic(id,tropic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/tropics/{id}")
	public void updateTropic(@PathVariable String id) {
		tropicService.deleteTropic(id);
	}

}
