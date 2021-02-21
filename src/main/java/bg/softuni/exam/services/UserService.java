package bg.softuni.exam.services;

import bg.softuni.exam.models.service.UserServiceModel;

public interface UserService {
    boolean registerUser(UserServiceModel userRegServiceModel);

    UserServiceModel findByUsername(String username);
}
