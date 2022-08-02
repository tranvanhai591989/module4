package codezip.code_zip.repository;

import codezip.code_zip.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
