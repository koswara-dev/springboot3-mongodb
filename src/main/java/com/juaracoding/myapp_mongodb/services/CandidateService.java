package com.juaracoding.myapp_mongodb.services;

import com.juaracoding.myapp_mongodb.models.Candidate;
import com.juaracoding.myapp_mongodb.repository.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    public List<Candidate> getAllCandidates(){
        return candidateRepository.findAll();
    }

    public Optional<Candidate> getCandidateById(String id){
        return candidateRepository.findById(id);
    }

    public Candidate saveCandidate(Candidate candidate){
        return candidateRepository.save(candidate);
    }

    public void deleteCandidate(String id){
        candidateRepository.deleteById(id);
    }

}
