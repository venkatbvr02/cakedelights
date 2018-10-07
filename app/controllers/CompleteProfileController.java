package controllers;

import Entity.CompleteProfileEntity;
import Entity.RegistrationdetailsEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.ResultSetMetaData;
//import com.mysql.jdbc.Statement;
import com.srujanika.utils.EncyDecyUtility;
import com.srujanika.utils.HibernateUtils;
import org.asynchttpclient.Request;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import serviceImpl.CompleteProfileServiceImpl;

import javax.inject.Inject;
import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;

public class CompleteProfileController extends Controller {
    @Inject
    CompleteProfileServiceImpl completeProfileService;
    @BodyParser.Of(BodyParser.Json.class)
    public Result srv004()
    {
        System.out.println(":::::::::::::::::::::::: "+request().cookie("uniquekey").value());
        JsonNode jsonNode=request().body().asJson();
        //System.out.println("coming here ;;;;;;; "+jsonNode.get("bodytype"));
        ObjectMapper objectMapper=new ObjectMapper();
        String profId="";
        //java.sql.Connection connection=null;


        try {
            CompleteProfileEntity completeProfileEntity = objectMapper.treeToValue(jsonNode, CompleteProfileEntity.class);
            System.out.println(completeProfileEntity.getAt035() + ":::::::::::" + completeProfileEntity.getAt036());
            profId=EncyDecyUtility.decrypt(request().cookie("uniquekey").value(),"yoursecretkeyofp");
            System.out.println(":::::::::profileId is"+profId);
            completeProfileEntity.setAtp000(profId);
            String mobileno=completeProfileEntity.getAt046();
            String mobid= EncyDecyUtility.getEncrypetedValue(mobileno,"yourmobilenumber");
            completeProfileEntity.setAt046(mobid);
                completeProfileService.saveCompleteProfileDetails(completeProfileEntity);
                //System.out.println(completeProfileService.toString());

        }
        catch (JsonProcessingException e)
        {
            e.printStackTrace();
            return ok("profile Unsuccessfull");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ok("profile Unsuccessfull");
        }
        return ok("profile success");
    }
    public Result uploadimage() {
        System.out.println("coming here to upload file :::::::::::");
       // response().
        Http.MultipartFormData<File> body = request().body().asMultipartFormData();
        String profid=EncyDecyUtility.decrypt(request().cookie("uniquekey").value(),"yoursecretkeyofp");
        String result = completeProfileService.uploadProFile(body,profid);

        return ok(result);


    }

    }
