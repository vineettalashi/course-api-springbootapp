package io.javabrains.springbootapp.repository;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.springbootapp.pojos.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{
		
}
