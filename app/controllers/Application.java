package controllers;

import Entity.LoginEntity;
import Entity.RegistrationdetailsEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.srujanika.utils.EncyDecyUtility;
import com.srujanika.utils.PasswordHashing;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import serviceImpl.LoginServiceImpl;
import serviceImpl.RegisterServiceImpl;
import javax.inject.Inject;

import static play.libs.Scala.Option;

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
        String uniqueKey=null;
        try {
            String reultPassword="";
           //reultPassword=PasswordHashing.getSaltedHash(jsonObjectMapper.acceptJsonFormatVisitor(registrationdetailsEntity.getPassword()););
            RegistrationdetailsEntity registrationdetailsEntity = jsonObjectMapper.treeToValue(jsonNode, RegistrationdetailsEntity.class);

           // reultPassword=PasswordHashing.getSaltedHash(jsonNode.get(registrationdetailsEntity.ge);
            //reultPassword=EncyDecyUtility.getEncrypetedValue("")
            reultPassword=PasswordHashing.getSaltedHash(registrationdetailsEntity.getAt002());
            registrationdetailsEntity.setAt002(reultPassword);
            //String value=registrationdetailsEntity.getAt003();
           // String key="emailaddressmask";
            String emailId= EncyDecyUtility.getEncrypetedValue(registrationdetailsEntity.getAt003(),"emailaddressmask");
            System.out.println(";;;;;;;;;;"+emailId);
            registrationdetailsEntity.setAt003(emailId);
//            registerService.saveRegistrationDetails(registrationdetailsEntity);
            uniqueKey= registerService.saveRegistrationDetails(registrationdetailsEntity);
            System.out.println(" :::::::::::::::::::::::::::::; "+uniqueKey);
           response().setCookie(Http.Cookie.builder("uniquekey", uniqueKey).build());

        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return ok(":registration unsucessful");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ok(":registration unsucessful");

        }
       // session("profileId",registrationdetailsEntity.getAtp000());
        return ok(":registration success");
    }


@BodyParser.Of(BodyParser.Json.class)
public Result srv002() {
        String result=null;

    JsonNode jsonNode = request().body().asJson();
    ObjectMapper objectMapper = new ObjectMapper();
    try {
        LoginEntity loginEntity = objectMapper.treeToValue(jsonNode, LoginEntity.class);

        result=loginService.checkLoginDetails(loginEntity);
        if(!result.equalsIgnoreCase("failure")){
            response().setCookie(Http.Cookie.builder("uniquekey",result).build());

        }

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
