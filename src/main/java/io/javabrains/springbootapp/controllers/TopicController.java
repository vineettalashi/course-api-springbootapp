package io.javabrains.springbootapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootapp.pojos.Topic;
import io.javabrains.springbootapp.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService;
	
	//@RequestMapping("/topics")
	@GetMapping(value="/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
				
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable("id") String id) {
		return topicService.getTopic(id);
				
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic newTopic) {
		topicService.addTopic(newTopic);				
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic updatedTopic,@PathVariable("id") String id) {
		topicService.updateTopic(id,updatedTopic);				
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable("id") String id) {
		topicService.deleteTopic(id);				
	}
}
