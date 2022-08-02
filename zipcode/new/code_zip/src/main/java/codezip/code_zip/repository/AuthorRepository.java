package codezip.code_zip.repository;


import codezip.code_zip.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
