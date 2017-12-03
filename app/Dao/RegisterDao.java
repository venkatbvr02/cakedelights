package Dao;


import Entity.RegistrationdetailsEntity;
//import com.srujanika.bo.RegisterBo;
//import com.srujanika.daoImpl.RegisterDaoImpl;

public interface RegisterDao {
    String saveRegisterationDetails(RegistrationdetailsEntity registrationdetailsEntity) throws Exception;


}
