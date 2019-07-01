package com.stackroute.postIdea.repository;

import com.stackroute.postIdea.domain.Idea;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IdeaRepository extends MongoRepository<Idea,String> {
    @Override
    boolean existsById(String s);
}
