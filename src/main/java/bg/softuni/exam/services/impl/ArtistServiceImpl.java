package bg.softuni.exam.services.impl;

import bg.softuni.exam.models.entities.Artist;
import bg.softuni.exam.models.entities.enums.ArtistNameEnum;
import bg.softuni.exam.repositories.ArtistRepo;
import bg.softuni.exam.services.ArtistService;
import org.springframework.stereotype.Service;

@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepo artistRepo;

    public ArtistServiceImpl(ArtistRepo artistRepo) {
        this.artistRepo = artistRepo;
    }

    @Override
    public void initArtists() {
        if(artistRepo.count() == 0){
            ArtistNameEnum[] artistNameEnums = ArtistNameEnum.values();
            for (ArtistNameEnum artistNameEnum : artistNameEnums) {
                Artist artist = new Artist();
                artist.setName(artistNameEnum);
                artistRepo.save(artist);
            }
        }
    }

    @Override
    public Artist findByName(ArtistNameEnum artist) {
        return artistRepo.findByName(artist).orElse(null);
    }
}
