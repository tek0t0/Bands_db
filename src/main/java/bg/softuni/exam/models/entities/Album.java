package bg.softuni.exam.models.entities;


import bg.softuni.exam.models.entities.enums.GenreEnum;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "albums")
public class Album extends BaseEntity{
    private String name;
    private String imgUrl;
    private String description;
    private Long copies;
    private BigDecimal price;
    private LocalDate releaseDate;
    private String producer;
    private GenreEnum genre;
    private Artist artist;
    private UserEntity addedFrom;

    public Album() {
    }


    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public Album setName(String name) {
        this.name = name;
        return this;
    }

    @Column(name = "img_url", nullable = false)
    public String getImgUrl() {
        return imgUrl;
    }

    public Album setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    @Column(name = "description", columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public Album setDescription(String description) {
        this.description = description;
        return this;
    }

    @Column(name = "copies", nullable = false)
    public Long getCopies() {
        return copies;
    }

    public Album setCopies(Long copies) {
        this.copies = copies;
        return this;
    }

    @Column(name = "price", nullable = false)
    public BigDecimal getPrice() {
        return price;
    }

    public Album setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    @Column(name = "released_date", nullable = false)
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Album setReleaseDate(LocalDate releasedDate) {
        this.releaseDate = releasedDate;
        return this;
    }


    public String getProducer() {
        return producer;
    }

    public Album setProducer(String prodicer) {
        this.producer = prodicer;
        return this;
    }

    @Enumerated(EnumType.ORDINAL)
    public GenreEnum getGenre() {
        return genre;
    }

    public Album setGenre(GenreEnum genre) {
        this.genre = genre;
        return this;
    }

    @ManyToOne
    public Artist getArtist() {
        return artist;
    }

    public Album setArtist(Artist artist) {
        this.artist = artist;
        return this;
    }

    @ManyToOne
    public UserEntity getAddedFrom() {
        return addedFrom;
    }

    public Album setAddedFrom(UserEntity addedFrom) {
        this.addedFrom = addedFrom;
        return this;
    }
}
