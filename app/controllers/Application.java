package controllers;

import Entity.LoginEntity;
import Entity.RegistrationdetailsEntity;
import com.srujanika.utils.PasswordHashing;
import play.mvc.*;

import java.lang.*;

import serviceImpl.LoginServiceImpl;
import serviceImpl.RegisterServiceImpl;
import views.html.*;

import javax.inject.Inject;

public class Application extends Controller {
    @Inject
    RegistrationdetailsEntity registrationdetailsEntity;
    @Inject
    RegisterServiceImpl registerService;
    @Inject
    PasswordHashing passwordHashing;
    @Inject
    LoginEntity loginEntity;
    @Inject
    LoginServiceImpl loginService;

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result register()
    {
        try{
            String reultPassword="";
            reultPassword=PasswordHashing.getSaltedHash("venugopal");
            registrationdetailsEntity.setId(1);
            registrationdetailsEntity.setUsername("VENU");
            //String passwordforhash="Bhadra02"
            //PasswordHashing.getSaltedHash( passwordforhash);

            registrationdetailsEntity.setPassword(reultPassword);
            registrationdetailsEntity.setEmail("bhadra@gmail.com");
            registrationdetailsEntity.setAge(new java.sql.Date(1992-10-06));
            registrationdetailsEntity.setSex("male");
            registrationdetailsEntity.setSubject("working for Srujanika");
            //request().body().
            registerService.saveRegistrationDetails(registrationdetailsEntity);

        }
catch (Exception e)
{
    e.printStackTrace();
}
        return ok(" Done");
    }
//
public Result login()
{
    try {

        loginEntity.setUsername("VENU");
        //String reultPassword = "";
       // reultPassword = PasswordHashing.getSaltedHash("venugopal");
        loginEntity.setPassword("venugopal");
        loginService.checkLoginDetails(loginEntity);    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return ok("result");
}


}
