package com.technicalAssessment.MatchOdds.service;

import com.technicalAssessment.MatchOdds.model.MatchOdds;
import com.technicalAssessment.MatchOdds.repository.MatchOddsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchOddsService {

    @Autowired
    private MatchOddsRepository matchOddsRepository;

    public List<MatchOdds> getAllMatchOdds() {
        return matchOddsRepository.findAll();
    }

    public List<MatchOdds> getOddsByMatchId(Long matchId) {
        return matchOddsRepository.findByMatchId(matchId);
    }

    public MatchOdds saveMatchOdds(MatchOdds matchOdds) {
        return matchOddsRepository.save(matchOdds);
    }

    public void deleteMatchOdds(Long id) {
        if (!matchOddsRepository.existsById(id)) {
            throw new RuntimeException("MatchOdds with ID " + id + " does not exist");
        }
        matchOddsRepository.deleteById(id);
    }
}
