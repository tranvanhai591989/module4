package codegym.hai.exercise_blog.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  int idType;
    private String name;



    @OneToMany(mappedBy = "type")
    private Set<Blog> blogs;

    public Type() {
    }

    public Type(int idType, String name,  Set<Blog> blogs) {
        this.idType = idType;
        this.name = name;

        this.blogs = blogs;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Set<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(Set<Blog> blogs) {
        this.blogs = blogs;
    }
}
