package com.abdullah.tropic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TropicService {

	@Autowired
	private TropicRepository tropicRepository;

//	private List<Tropic> tropics = new ArrayList<>( Arrays.asList(
//			new Tropic("spring", "Spring Framework", "Spring Framework Description"),
//			new Tropic("java", "core java", "java description"),
//			new Tropic("javascript", "javascript", "js descripton")));

	public List<Tropic> getAllTropics() {

//		return tropics;

		List<Tropic> tropics = new ArrayList<>();
		tropicRepository.findAll().forEach(tropics::add);
		return tropics;

	}

	public Tropic getTropic(String id) {

//		return tropics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		Tropic st = null;
		List<Tropic> tropics = new ArrayList<>();
		tropicRepository.findAll().forEach(tropics::add);
		for (int i = 0; i < tropics.size(); i++) {
			Tropic t = tropics.get(i);
			if (t.getId().equals(id)) {
				st = t;
			}
		}
		return st;
	}

	public void addTropic(Tropic tropic) {
//		tropics.add(tropic);

		tropicRepository.save(tropic);
	}

	public void updateTropic(String id, Tropic tropic) {

//		for(int i = 0 ; i<tropics.size() ; i++) {
//			Tropic t = tropics.get(i);
//			if(t.getId().equals(id)) {
//				tropics.set(i, tropic);
//				return;
//			}
//		}
		
		tropicRepository.save(tropic);
	}

	public void deleteTropic(String id) {
//		tropics.removeIf(t -> t.getId().equals(id));
		tropicRepository.deleteById(id);
	}

}
