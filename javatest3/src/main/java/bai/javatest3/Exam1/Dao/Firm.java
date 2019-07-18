package bai.javatest3.Exam1.Dao;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "firm")
public class Firm implements Serializable {

    @Id
    @GeneratedValue
    private Integer film_id;
    @Column
    private Integer language_id;
    @Column
    private String description;
    @Column
    private String title;
    //用于暂时存储language_id的值，之后在转成int
    private String count_id;

    public Firm(){
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String toString() {
        return "Firm{" +
                "film_id=" + film_id +
                ", language_id=" + language_id +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getCount_id() {
        return count_id;
    }

    public void setCount_id(String count_id) {
        this.count_id = count_id;
    }
}
