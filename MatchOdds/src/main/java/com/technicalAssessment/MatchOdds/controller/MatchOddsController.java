package com.technicalAssessment.MatchOdds.controller;

import com.technicalAssessment.MatchOdds.model.MatchOdds;
import com.technicalAssessment.MatchOdds.repository.MatchOddsRepository;
import com.technicalAssessment.MatchOdds.service.MatchOddsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/match-odds")
public class MatchOddsController {

    @Autowired
    private MatchOddsService matchOddsService;
    @Autowired
    private MatchOddsRepository matchOddsRepository;

    @GetMapping
    public ResponseEntity<List<MatchOdds>> getAllMatchOdds() {
        return ResponseEntity.ok(matchOddsService.getAllMatchOdds());
    }

    @GetMapping("/match/{matchId}")
    public ResponseEntity<List<MatchOdds>> getOddsByMatchId(@PathVariable Long matchId) {
        return ResponseEntity.ok(matchOddsService.getOddsByMatchId(matchId));
    }

    @PostMapping
    public ResponseEntity<MatchOdds> createMatchOdds(@RequestBody MatchOdds matchOdds) {
        MatchOdds savedOdds = matchOddsService.saveMatchOdds(matchOdds);
        return ResponseEntity.ok(savedOdds);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MatchOdds> updateMatchOdds(@PathVariable Long id, @RequestBody MatchOdds matchOdds) {
        if (!matchOddsRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        matchOdds.setId(id);
        MatchOdds updatedOdds = matchOddsService.saveMatchOdds(matchOdds);
        return ResponseEntity.ok(updatedOdds);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMatchOdds(@PathVariable Long id) {
        matchOddsService.deleteMatchOdds(id);
        return ResponseEntity.noContent().build();
    }
}
