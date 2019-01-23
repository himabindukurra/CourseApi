package com.bindu.springbootstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topics = new ArrayList<> (Arrays.asList(
			new Topic("java","Core Java","fundamentals of core java"),
			new Topic("javaee","Advanced Java","advanced concepts of java"),
			new Topic("db","mysql","configuration of database")
			));
	
	List<Topic> getAllTopics(){
		
		return topics;
	}
	
	Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
