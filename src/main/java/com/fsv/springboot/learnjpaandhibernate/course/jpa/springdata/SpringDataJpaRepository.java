package com.fsv.springboot.learnjpaandhibernate.course.jpa.springdata;

import com.fsv.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author);

    List<Course> findByAuthorAndName(String author, String name);

    List<Course> findByName(String name);
}
