package academy.devdojo.youtube.course.endpoint.controller;

import academy.devdojo.youtube.core.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academy.devdojo.youtube.course.endpoint.service.CourseService;


@RestController
@RequestMapping("/v1/admin/courses")
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Iterable<Course>> list (Pageable pageable){
		return new ResponseEntity<>(courseService.list(pageable), HttpStatus.OK);
	}
}
