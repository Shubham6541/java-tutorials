package com.nklkarthi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nklkarthi.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
