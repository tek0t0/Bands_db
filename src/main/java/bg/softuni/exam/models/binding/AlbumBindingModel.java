package bg.softuni.exam.models.binding;

import bg.softuni.exam.models.entities.enums.ArtistNameEnum;
import bg.softuni.exam.models.entities.enums.GenreEnum;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class AlbumBindingModel {
    private String name;
    private String imgUrl;
    private String description;
    private Long copies;
    private BigDecimal price;
    private LocalDate releaseDate;
    private String producer;
    private GenreEnum genre;
    private ArtistNameEnum artist;

    public AlbumBindingModel() {
    }

    @NotBlank(message = "Enter Album name!")
    @Size(min = 3, max = 20, message = "Password length must be between 3 and 20 characters !")
    public String getName() {
        return name;
    }

    public AlbumBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    @NotBlank(message = "Enter URL")
    @Size(min = 5,  message = "URL length must be more then 4 symbols!")
    public String getImgUrl() {
        return imgUrl;
    }

    public AlbumBindingModel setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    @NotBlank(message = "Enter description!")
    @Size(min = 5, max = 20, message = "Description length must be more then 4 symbols!")
    public String getDescription() {
        return description;
    }

    public AlbumBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }


    @Min(value = 10, message = "Album copies must be more than 10")
    public Long getCopies() {
        return copies;
    }

    public AlbumBindingModel setCopies(Long copies) {
        this.copies = copies;
        return this;
    }

    @DecimalMin(value = "0", message = "Price must be positive number!")
    public BigDecimal getPrice() {
        return price;
    }

    public AlbumBindingModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent(message = "The date can not be in the future!")
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public AlbumBindingModel setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }


    public String getProducer() {
        return producer;
    }

    public AlbumBindingModel setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    @NotNull(message = "Select genre!")
    public GenreEnum getGenre() {
        return genre;
    }

    public AlbumBindingModel setGenre(GenreEnum genre) {
        this.genre = genre;
        return this;
    }

    @NotNull(message = "Select Artist!")
    public ArtistNameEnum getArtist() {
        return artist;
    }

    public AlbumBindingModel setArtist(ArtistNameEnum artist) {
        this.artist = artist;
        return this;
    }
}
