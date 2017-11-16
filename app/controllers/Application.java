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
      // return ok(index.render("Your new application is ready."));
        return redirect("/assets/public_html/index.html");
    }
    @BodyParser.Of(BodyParser.Json.class)
    public Result srv001() {
        JsonNode jsonNode = request().body().asJson();
        ObjectMapper jsonObjectMapper = new ObjectMapper();
        try {
            String reultPassword="";
           //reultPassword=PasswordHashing.getSaltedHash(jsonObjectMapper.acceptJsonFormatVisitor(registrationdetailsEntity.getPassword()););
            RegistrationdetailsEntity registrationdetailsEntity = jsonObjectMapper.treeToValue(jsonNode, RegistrationdetailsEntity.class);

           // reultPassword=PasswordHashing.getSaltedHash(jsonNode.get(registrationdetailsEntity.ge);
            reultPassword=PasswordHashing.getSaltedHash(registrationdetailsEntity.getAt002());
            registrationdetailsEntity.setAt002(reultPassword);
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


@BodyParser.Of(BodyParser.Json.class)
public Result srv002() {
        String result=null;

    JsonNode jsonNode = request().body().asJson();
    ObjectMapper objectMapper = new ObjectMapper();
    try {
        LoginEntity loginEntity = objectMapper.treeToValue(jsonNode, LoginEntity.class);
        result=loginService.checkLoginDetails(loginEntity);
        }
    catch (JsonProcessingException e)
    {
        e.printStackTrace();
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return ok(result);
}


}
