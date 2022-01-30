package com.josk.course.db.repository;

import com.josk.course.db.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByPublished(boolean published);
    List<Course> findByTitle(String title);
}
