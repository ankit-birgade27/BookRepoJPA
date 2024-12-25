package com.tka.BookmangementJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.BookmangementJpa.enitity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Long>{

	void findByName(String name);

}
