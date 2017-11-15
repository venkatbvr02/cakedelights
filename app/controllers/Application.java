package controllers;

import Entity.LoginEntity;
import Entity.RegistrationdetailsEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    //return redirect("/views/html/index");
    }
    @BodyParser.Of(BodyParser.Json.class)
    public Result register() {
        JsonNode jsonNode = request().body().asJson();
        ObjectMapper jsonObjectMapper = new ObjectMapper();
        try {
            String reultPassword="";
           //reultPassword=PasswordHashing.getSaltedHash(jsonObjectMapper.acceptJsonFormatVisitor(registrationdetailsEntity.getPassword()););
            RegistrationdetailsEntity registrationdetailsEntity = jsonObjectMapper.treeToValue(jsonNode, RegistrationdetailsEntity.class);

           // reultPassword=PasswordHashing.getSaltedHash(jsonNode.get(registrationdetailsEntity.ge);
            reultPassword=PasswordHashing.getSaltedHash(registrationdetailsEntity.getPassword());
            registrationdetailsEntity.setPassword(reultPassword);
            registerService.saveRegistrationDetails(registrationdetailsEntity);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return ok(":registration unsucessful");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ok(":registration unsucessful");

        }
        return ok(":registration sucess");
    }

//        try{
//            String reultPassword="";
//            reultPassword=PasswordHashing.getSaltedHash("venugopal");
//            //registrationdetailsEntity.setId(1);
//            registrationdetailsEntity.setUsername("venkat");
//            //String passwordforhash="Bhadra02"
//            //PasswordHashing.getSaltedHash( passwordforhash);
//
//            registrationdetailsEntity.setPassword(reultPassword);
//            registrationdetailsEntity.setEmail("bhadra@gmail.com");
//            registrationdetailsEntity.setAge(new java.sql.Date(1992-10-06));
//            registrationdetailsEntity.setSex("male");
//            registrationdetailsEntity.setSubject("working for Srujanika");
//            //request().body().
//            registerService.saveRegistrationDetails(registrationdetailsEntity);
////
//        }
//catch (Exception e)
//{
//    e.printStackTrace();
//}
//        return ok(" Done");
//    }
////
@BodyParser.Of(BodyParser.Json.class)
public Result login() {
        String result=null;

    JsonNode jsonNode = request().body().asJson();
    ObjectMapper objectMapper = new ObjectMapper();
    try {
        LoginEntity loginEntity = objectMapper.treeToValue(jsonNode, LoginEntity.class);
        // RegistrationdetailsEntity registrationdetailsEntity = objectMapper.treeToValue(jsonNode, RegistrationdetailsEntity.class);
        result=loginService.checkLoginDetails(loginEntity);
    } catch (JsonProcessingException e) {
        e.printStackTrace();
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return ok(result);
}


}
