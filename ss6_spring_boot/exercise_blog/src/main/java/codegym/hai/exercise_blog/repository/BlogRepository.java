package codegym.hai.exercise_blog.repository;

import codegym.hai.exercise_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    @Modifying
    @Query(value = "select * from blog where content like :name", nativeQuery = true)
    List<Blog> searchByName(@Param("name") String name);

    //    @Modifying
    //    @Query(value = "select * from Blog where id = :id", nativeQuery = true)
    //    Blog findById2(@Param("id") int id);

    @Modifying
    @Query(value = "update  Blog  set content=:content," + " type=:type," + " commit=:commit where  id=:id", nativeQuery = true)
    void update(@Param("content") String content, @Param("type") int type, @Param("commit") String commit, @Param("id") int id);

    Page<Blog> findAll(Pageable pageable);




}
