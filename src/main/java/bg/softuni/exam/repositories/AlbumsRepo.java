package bg.softuni.exam.repositories;

import bg.softuni.exam.models.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumsRepo extends JpaRepository<Album, String> {
    @Query("select SUM(a.copies) from Album a")
    Long getTotalCopiesSold();


    @Query("select a from Album a order by a.copies desc")
    List<Album> findAllByNumberOfCopies();

}
