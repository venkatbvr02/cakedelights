package Dao;

import Entity.LoginEntity;
import Entity.RegistrationdetailsEntity;

public interface LoginDao {
    String checkLoginDetails(LoginEntity loginEntity);
}
