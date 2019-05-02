package com.rdmstudios.scsnetflix.repositories;

import com.rdmstudios.scsnetflix.domain.Fortune;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface FortuneRepository extends CrudRepository<Fortune, Long> {

}
