package serviceImpl;

import DaoImpl.RegisterDaoImpl;
import Entity.RegistrationdetailsEntity;
//import com.srujanika.bo.RegisterBo;
//import com.srujanika.daoImpl.RegisterDaoImpl;
//import com.srujanika.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.RegisterService;

import javax.inject.Inject;

@Service
public class RegisterServiceImpl implements RegisterService {


    @com.google.inject.Inject
  private RegisterDaoImpl registerDao;

//  @com.google.inject.Inject



    @Override
    public void saveRegistrationDetails(RegistrationdetailsEntity registrationdetailsEntity) {
        registerDao.saveRegisterationDetails(registrationdetailsEntity);
//        return null;
    }
}
