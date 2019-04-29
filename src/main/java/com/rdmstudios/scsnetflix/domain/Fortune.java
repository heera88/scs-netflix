package com.rdmstudios.scsnetflix.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fortunes")
public class Fortune {

    @Id
    @GeneratedValue
    private Long id;

    private String text;

    protected Fortune() {}

    public Fortune(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Long getId() {
        return id;
    }
}
