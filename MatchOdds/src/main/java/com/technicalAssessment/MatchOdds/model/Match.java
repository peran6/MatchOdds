package com.technicalAssessment.MatchOdds.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private LocalDate matchDate;
    private LocalTime matchTime;
    private String teamA;
    private String teamB;
    @Enumerated(EnumType.ORDINAL)
    private Sport sport;

    public enum Sport {
        FOOTBALL,
        BASKETBALL
    }
}
