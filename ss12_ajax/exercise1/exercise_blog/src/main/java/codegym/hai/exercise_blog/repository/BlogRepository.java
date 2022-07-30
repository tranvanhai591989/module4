package codegym.hai.exercise_blog.repository;

import codegym.hai.exercise_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    @Query(value = "select * from blog where content like :name", nativeQuery = true)
    Page<Blog> searchByName(@Param("name") String name, Pageable pageable);

    @Modifying
    @Query(value = "update  Blog  set content=:content, id_type=:type, commit=:commit where  id=:id", nativeQuery = true)
    void update(@Param("content") String content, @Param("type") int type, @Param("commit") String commit, @Param("id") int id);

    Page<Blog> findAll(Pageable pageable);

}
