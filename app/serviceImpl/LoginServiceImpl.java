package serviceImpl;

import DaoImpl.LoginDaoImpl;
import Entity.LoginEntity;
import Entity.RegistrationdetailsEntity;
import service.LoginService;

import javax.inject.Inject;

public class LoginServiceImpl implements LoginService {
    @Inject
    LoginDaoImpl loginDao;
    @Override
    public String checkLoginDetails(LoginEntity loginEntity) {
   return loginDao.checkLoginDetails(loginEntity);
   //return res;
       // return res;
    }
}
