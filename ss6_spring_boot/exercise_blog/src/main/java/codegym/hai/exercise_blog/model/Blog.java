package codegym.hai.exercise_blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Blog {
    @Id
    @GeneratedValue
    private int id;
    private  String content;
    private  String type;
    @Column(name = "commit", columnDefinition = "DATE")
    private String commit;

    public Blog() {
    }

    public Blog(int id, String content, String type, String commit) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }
}
