package codegym.hai.exercise_blog.repository;

import codegym.hai.exercise_blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Transactional
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    @Modifying
    @Query(value = "select * from Blog where content like  name=:name", nativeQuery = true)
    List<Blog> searchByName(@Param("name") String name);

    @Modifying
    @Query(value = "select * from Blog where id = :id", nativeQuery = true)
    Blog findById2(@Param("id") Integer id);

    @Modifying
    @Query(value = "update  Blog  set content=:content," + "set type=:type," + "set commit=:commit where  id=:id", nativeQuery = true)
    void update(@Param("content") String content, @Param("type") String type, @Param("commit") Date commit, @Param("id") int id);
}
