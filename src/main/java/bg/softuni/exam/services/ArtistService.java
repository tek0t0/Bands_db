package bg.softuni.exam.services;

import bg.softuni.exam.models.entities.Artist;
import bg.softuni.exam.models.entities.enums.ArtistNameEnum;

public interface ArtistService {
    void initArtists();

    Artist findByName(ArtistNameEnum artist);
}
