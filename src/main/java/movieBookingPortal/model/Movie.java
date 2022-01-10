package movieBookingPortal.model;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "movie_caption")
    private String movieCaption;

    @Column(name = "img_src")
    private String imgSrc;

    @Column(name = "price")
    private int price;



    public Movie() {

    }

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

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", movieCaption='" + movieCaption + '\'' +
                ", imgSrc='" + imgSrc + '\'' +
                ", price=" + price +
                '}';
    }


}
