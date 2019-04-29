package com.rdmstudios.scsnetflix;

import com.rdmstudios.scsnetflix.domain.Fortune;
import com.rdmstudios.scsnetflix.repositories.FortuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FortuneCmdRunner implements CommandLineRunner {

    @Autowired
    FortuneRepository fortuneRepository;

    @Override
    public void run(String... args) throws Exception {
        fortuneRepository.save(new Fortune("You're going to rock it"));
        fortuneRepository.save(new Fortune("Someone is looking up to you. Don't let them down"));
        fortuneRepository.save(new Fortune("Run!!!"));
        fortuneRepository.save(new Fortune("If you eat something and nobody sees you eat it, it has no calories"));
    }
}
