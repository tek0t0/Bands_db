package bg.softuni.exam.models.views;

import bg.softuni.exam.models.entities.enums.ArtistNameEnum;
import bg.softuni.exam.models.entities.enums.GenreEnum;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AlbumViewModel {
    private String id;
    private String name;
    private String imgUrl;
    private Long copies;
    private BigDecimal price;
    private LocalDate releaseDate;
    private GenreEnum genre;
    private ArtistNameEnum artist;

    public AlbumViewModel() {
    }

    public String getId() {
        return id;
    }

    public AlbumViewModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AlbumViewModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public AlbumViewModel setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public Long getCopies() {
        return copies;
    }

    public AlbumViewModel setCopies(Long copies) {
        this.copies = copies;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public AlbumViewModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public AlbumViewModel setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public GenreEnum getGenre() {
        return genre;
    }

    public AlbumViewModel setGenre(GenreEnum genre) {
        this.genre = genre;
        return this;
    }

    public ArtistNameEnum getArtist() {
        return artist;
    }

    public AlbumViewModel setArtist(ArtistNameEnum artist) {
        this.artist = artist;
        return this;
    }
}
