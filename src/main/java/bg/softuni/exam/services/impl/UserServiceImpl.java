package bg.softuni.exam.services.impl;

import bg.softuni.exam.models.entities.UserEntity;
import bg.softuni.exam.models.service.UserServiceModel;
import bg.softuni.exam.repositories.UserRepo;
import bg.softuni.exam.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepo userRepo, ModelMapper modelMapper) {
        this.userRepo = userRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public boolean registerUser(UserServiceModel userRegServiceModel) {
        try {
            userRepo.save(modelMapper.map(userRegServiceModel, UserEntity.class));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public UserServiceModel findByUsername(String username) {
        return userRepo.findByUsername(username)
                .map(u -> modelMapper.map(u, UserServiceModel.class))
                .orElse(null);
    }
}
