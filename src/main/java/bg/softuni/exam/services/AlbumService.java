package bg.softuni.exam.services;

import bg.softuni.exam.models.service.AlbumServiceModel;
import bg.softuni.exam.models.views.AlbumViewModel;

import java.util.List;

public interface AlbumService {
    List<AlbumViewModel> findAllAlbums();

    Long getTotalCopiesSold();

    boolean addAlbum(AlbumServiceModel albumServiceModel);

    void deleteById(String id);
}
