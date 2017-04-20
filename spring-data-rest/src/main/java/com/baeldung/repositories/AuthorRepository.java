package com.nklkarthi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nklkarthi.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
