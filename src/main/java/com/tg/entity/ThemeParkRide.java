package com.tg.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@ToString
@NoArgsConstructor
public class ThemeParkRide {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    private int thrillFactor;
    private int speedFactor;

    public ThemeParkRide(String name, String description, int thrillFactor, int speedFactor) {
        this.name = name;
        this.description = description;
        this.thrillFactor = thrillFactor;
        this.speedFactor = speedFactor;
    }

}
