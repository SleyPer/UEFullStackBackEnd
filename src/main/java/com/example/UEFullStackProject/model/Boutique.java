package com.example.UEFullStackProject.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Boutique implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;
    private String openingHours;
    private boolean isOnLeave;

    public Boutique() {}

    public Boutique(Long id, String name, String openingHours, boolean isOnLeave) {
        this.id = id;
        this.name = name;
        this.openingHours = openingHours;
        this.isOnLeave = isOnLeave;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public boolean isOnLeave() {
        return isOnLeave;
    }

    public void setOnLeave(boolean onLeave) {
        isOnLeave = onLeave;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Boutique {" +
                "id = " + id +
                ", nom = '" + name + '\'' +
                ", horaires = '" + openingHours + '\'' +
                ", congé = '" + isOnLeave + '\'' +
                "}";
    }
}
