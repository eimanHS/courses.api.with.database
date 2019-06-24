package io.javabrains.springbootstarter.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllTopics {

	@Autowired
	private TopicService topicServise;
	
	@RequestMapping("/topic")
	public List<Topic> allTopics() {
		return topicServise.getAllTopics();
	}
	
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicServise.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value = "/topic")
	public void addTopic(@RequestBody Topic topic) {
		topicServise.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value = "/topic/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicServise.deleteTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value = "/topic/{id}")
	public void updateTopic(@RequestBody Topic topic , @PathVariable String id) {
		topicServise.updateTopic(topic , id);
	}
}
