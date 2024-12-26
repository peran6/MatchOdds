package com.technicalAssessment.MatchOdds.service;

import com.technicalAssessment.MatchOdds.model.Match;
import com.technicalAssessment.MatchOdds.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    public Match saveMatch(Match match) {
        return matchRepository.save(match);
    }

    public Match getMatchById(Long id) {
        return matchRepository.findById(id).orElseThrow(() -> new RuntimeException("Match not found"));
    }

    public void deleteMatch(Long id) {
        if (!matchRepository.existsById(id)) {
            throw new RuntimeException("Match with ID " + id + " does not exist");
        }
        matchRepository.deleteById(id);
    }
}
