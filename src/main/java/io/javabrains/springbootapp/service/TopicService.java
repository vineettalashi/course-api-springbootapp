package io.javabrains.springbootapp.service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import io.javabrains.springbootapp.pojos.Topic;

@Service
public class TopicService {
	
	List<Topic> topics = new LinkedList<>(Arrays.asList(
			new Topic("spring","Topic Id 1","Topic Description 1"),
			new Topic("java","Topic Id 2","Topic Description 2"),
			new Topic("dotnet","Topic Id 3","Topic Description 3"),
			new Topic("Selenium","Topic Id 4","Topic Description 4")				
			));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(topic->topic.getId().equals(id)).collect(Collectors.toList()).get(0);
	}

	public void addTopic(Topic newTopic) {
		topics.add(newTopic);
	}
	
	public void updateTopic(String id,Topic newTopic) {
		//To be implemented
	}
	

}
