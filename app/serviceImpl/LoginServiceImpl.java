package serviceImpl;

import DaoImpl.LoginDaoImpl;
import Entity.LoginEntity;
import service.LoginService;

import javax.inject.Inject;

public class LoginServiceImpl implements LoginService {
    @Inject
    LoginDaoImpl loginDao;
    @Override
    public void checkLoginDetails(LoginEntity loginEntity) {
   loginDao.checkLoginDetails(loginEntity);
   //return res;
       // return res;
    }
}
