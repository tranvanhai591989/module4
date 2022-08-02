package codezip.code_zip.repository;

import codezip.code_zip.model.Zipcode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
public interface ZipcodeRepository extends JpaRepository<Zipcode, Long> {
}
