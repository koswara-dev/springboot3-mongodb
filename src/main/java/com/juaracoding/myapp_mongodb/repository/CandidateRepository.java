package com.juaracoding.myapp_mongodb.repository;

import com.juaracoding.myapp_mongodb.models.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends MongoRepository<Candidate, String> {
}
