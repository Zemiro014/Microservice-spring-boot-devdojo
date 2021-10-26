package academy.devdojo.youtube.course.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import academy.devdojo.youtube.course.model.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{

}
