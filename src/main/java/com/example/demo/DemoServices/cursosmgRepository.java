package com.example.demo.DemoServices;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface cursosmgRepository extends MongoRepository<cursosmgRepository, Serializable> {
}
