package io.javabrains.springbootstarter.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.topics.Topic;

@RestController
public class AllCoursws {

	@Autowired
	private CourseService corseServise;
	
	@RequestMapping("/topic/{topicId}/course")
	public List<Course> allCourses(@PathVariable String topicId) {
		return corseServise.getAllCourses(topicId);
	}
	
	@RequestMapping("/topic/{topicid}/course/{id}")
	public Course getCourse(@PathVariable String id) {
		return corseServise.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value = "/topic/{topicid}/course")
	public void addCourse(@RequestBody Course course , @PathVariable String topicid) {
		course.setTopic(new Topic(topicid, "",""));
		corseServise.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value = "/topic/{topicId}/course/{id}")
	public void deleteCourse(@PathVariable String id) {
		corseServise.deleteCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value = "/topic/{topicId}/course/{id}")
	public void updateCourse(@RequestBody Course course , @PathVariable String id , @PathVariable String topicId) {
		course.setTopic(new Topic(topicId, "",""));
		corseServise.updateCourse(course);
	}
}
