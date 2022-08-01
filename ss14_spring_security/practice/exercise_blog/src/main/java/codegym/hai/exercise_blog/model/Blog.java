package codegym.hai.exercise_blog.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String content;
    @ManyToOne
    @JoinColumn(name = "idType")
    private Type type;

    @Column(columnDefinition = "DATE")
    private String commit;

    public Blog() {
    }

    public Blog(int id, String content, Type type, String commit) {
        this.id = id;
        this.content = content;
        this.type = type;
        this.commit = commit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }
}
