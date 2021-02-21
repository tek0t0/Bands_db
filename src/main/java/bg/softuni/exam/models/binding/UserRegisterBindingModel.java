package bg.softuni.exam.models.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserRegisterBindingModel {
    private String username;
    private String fullName;
    private String email;
    private String password;
    private String confirmPassword;

    public UserRegisterBindingModel() {
    }


    @NotBlank(message = "Enter username!")
    @Size(min = 3, max = 20, message = "Username length must be between 3 and 20 characters !")
    public String getUsername() {
        return username;
    }

    public UserRegisterBindingModel setUsername(String username) {
        this.username = username;
        return this;
    }


    @NotBlank(message = "Enter name!")
    @Size(min = 3, max = 20, message = "Name length must be between 3 and 20 characters !")
    public String getFullName() {
        return fullName;
    }

    public UserRegisterBindingModel setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    @NotBlank(message = "Enter email!")
    @Email(message = "Enter valid Email!")
    public String getEmail() {
        return email;
    }

    public UserRegisterBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }

    @NotBlank(message = "Enter password!")
    @Size(min = 5, max = 20, message = "Password length must be between 5 and 20 characters !")
    public String getPassword() {
        return password;
    }

    public UserRegisterBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }

    @NotBlank(message = "Enter confirm password!")
    @Size(min = 5, max = 20, message = "Password length must be between 5 and 20 characters !")
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserRegisterBindingModel setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}
