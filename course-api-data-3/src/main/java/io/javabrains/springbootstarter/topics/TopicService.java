package io.javabrains.springbootstarter.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(x -> topics.add(x));
		return topics;
	}
	
	public Topic getTopic(String id) {
		return  topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);		
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);			
	}

	public void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
	}
	
}
