package io.javabrains.springbootapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootapp.pojos.Topic;
import io.javabrains.springbootapp.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topic->topics.add(topic));
	 // topicRepository.findAll().forEach(topics::add); //method reference
		return topics;
	}

	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}

	public void addTopic(Topic newTopic) {
		topicRepository.save(newTopic);
	}
	
	public void updateTopic(String id,Topic newTopic) {
		topicRepository.save(newTopic);
	}

	public void deleteTopic(String id) {
		//topics.removeIf(topic->topic.getId().equals(id));
		topicRepository.deleteById(id);
	}
}
