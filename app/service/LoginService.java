package service;

import Entity.LoginEntity;
import Entity.RegistrationdetailsEntity;

public interface LoginService {
    String checkLoginDetails(LoginEntity loginEntity);
}
