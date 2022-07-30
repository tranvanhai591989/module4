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
    private String commitDay;

    public Blog() {
    }

    public Blog(int id, String content, Type type, String commitDay) {
        this.id = id;
        this.content = content;
        this.type = type;
        this.commitDay = commitDay;
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

    public String getCommitDay() {
        return commitDay;
    }

    public void setCommitDay(String commit) {
        this.commitDay = commit;
    }
}
