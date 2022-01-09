package movieBookingPortal.model;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "movie_name")
    String movieName;

    @Column(name = "movie_caption")
    String movieCaption;

    @Column(name = "price")
    private int price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieCaption() {
        return movieCaption;
    }

    public void setMovieCaption(String movieCaption) {
        this.movieCaption = movieCaption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", movieCaption='" + movieCaption + '\'' +
                ", price=" + price +
                '}';
    }
}
