package bg.softuni.exam.repositories;

import bg.softuni.exam.models.entities.Artist;
import bg.softuni.exam.models.entities.enums.ArtistNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtistRepo extends JpaRepository<Artist, String> {
        Optional<Artist>findByName(ArtistNameEnum name);
}
