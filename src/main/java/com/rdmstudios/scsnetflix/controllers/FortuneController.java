package com.rdmstudios.scsnetflix.controllers;

import com.rdmstudios.scsnetflix.domain.Fortune;
import com.rdmstudios.scsnetflix.repositories.FortuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class FortuneController {

    @Autowired
    FortuneRepository fortuneRepository;

    @GetMapping("/fortunes")
    public Iterable<Fortune> fortunes() {
        return fortuneRepository.findAll();
    }

    @GetMapping("/fortunes/{id}")
    public Optional<Fortune> fortuneById(@PathVariable Long id) {
        return fortuneRepository.findById(id);
    }
}
