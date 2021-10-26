package academy.devdojo.youtube.course.endpoint.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import academy.devdojo.youtube.course.model.Course;
import academy.devdojo.youtube.course.repositories.CourseRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	private static final Logger LOGGER = Logger.getLogger( CourseService.class.getName() );
	
	public Iterable<Course> list (Pageable pageable){
		LOGGER.info("Listing All courses");
		return courseRepository.findAll(pageable);
	}
}
