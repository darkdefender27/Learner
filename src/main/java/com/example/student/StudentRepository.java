package com.example.student;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by shubhamutwal on 11/09/16.
 */
public interface StudentRepository extends MongoRepository<Student, String> {
}
