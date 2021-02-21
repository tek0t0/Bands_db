package bg.softuni.exam.services.impl;

import bg.softuni.exam.models.entities.Album;
import bg.softuni.exam.models.service.AlbumServiceModel;
import bg.softuni.exam.models.views.AlbumViewModel;
import bg.softuni.exam.repositories.AlbumsRepo;
import bg.softuni.exam.services.AlbumService;
import bg.softuni.exam.services.ArtistService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlbumServiceImpl implements AlbumService {

    private final AlbumsRepo albumsRepo;
    private final ModelMapper modelMapper;
    private final ArtistService artistService;

    public AlbumServiceImpl(AlbumsRepo albumsRepo, ModelMapper modelMapper, ArtistService artistService) {
        this.albumsRepo = albumsRepo;
        this.modelMapper = modelMapper;
        this.artistService = artistService;
    }

    @Override
    public List<AlbumViewModel> findAllAlbums() {
        return albumsRepo
                .findAllByNumberOfCopies()
                .stream()
                .map(album -> {
                    AlbumViewModel albumViewModel = modelMapper.map(album, AlbumViewModel.class);
                    albumViewModel.setArtist(album.getArtist().getName());
                    return albumViewModel;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Long getTotalCopiesSold() {
        return albumsRepo.getTotalCopiesSold();
    }

    @Override
    public boolean addAlbum(AlbumServiceModel albumServiceModel) {
        Album album = modelMapper.map(albumServiceModel, Album.class);
        album.setArtist(artistService.findByName(albumServiceModel.getArtist()));
        try {
            albumsRepo.save(album);
        } catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public void deleteById(String id) {
        albumsRepo.deleteById(id);

    }
}
