package bg.softuni.exam.models.service;

import bg.softuni.exam.models.entities.enums.ArtistNameEnum;
import bg.softuni.exam.models.entities.enums.GenreEnum;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AlbumServiceModel {
    private String name;
    private String imgUrl;
    private String description;
    private Long copies;
    private BigDecimal price;
    private LocalDate releaseDate;
    private String producer;
    private GenreEnum genre;
    private ArtistNameEnum artist;

    public AlbumServiceModel() {
    }

    public String getName() {
        return name;
    }

    public AlbumServiceModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public AlbumServiceModel setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AlbumServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public Long getCopies() {
        return copies;
    }

    public AlbumServiceModel setCopies(Long copies) {
        this.copies = copies;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public AlbumServiceModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public AlbumServiceModel setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public String getProducer() {
        return producer;
    }

    public AlbumServiceModel setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public GenreEnum getGenre() {
        return genre;
    }

    public AlbumServiceModel setGenre(GenreEnum genre) {
        this.genre = genre;
        return this;
    }

    public ArtistNameEnum getArtist() {
        return artist;
    }

    public AlbumServiceModel setArtist(ArtistNameEnum artist) {
        this.artist = artist;
        return this;
    }
}
