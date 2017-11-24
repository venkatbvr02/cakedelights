package controllers;

import Entity.EditProfileEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.srujanika.utils.PropertiesUtil;
import org.apache.commons.io.FileUtils;
import play.api.libs.json.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import serviceImpl.EditProfileServiceImpl;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;

public class EditProfileController extends Controller {
    @Inject
    EditProfileEntity editProfileEntity;
    @Inject
    EditProfileServiceImpl editProfileService;
   @BodyParser.Of(BodyParser.Json.class)
    public Result srv003()
    {
        System.out.println(" coming to here ;;;;;;;");
        JsonNode jsonNode;
        jsonNode=request().body().asJson();

        ObjectMapper jsonObjectMapper = new ObjectMapper();
        try {
            EditProfileEntity editProfileEntity=jsonObjectMapper.treeToValue(jsonNode,EditProfileEntity.class);
            System.out.println(editProfileEntity.getAt022()+" ::::::::::::: "+editProfileEntity.getAt013());
            editProfileService.editProfileDetails(editProfileEntity);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("::::::::::::::: :::"+jsonNode.get("height"));
        System.out.println("::::::::::::::: :::"+jsonNode.asText());
        response().setHeader("Access-Control-Allow-Origin", "*");
      return ok("Values Inserted");
    }

    public Result uploadimage(){
        System.out.println("coming here to upload file :::::::::::");
        Http.MultipartFormData<File> body= request().body().asMultipartFormData();

        String result=editProfileService.uploadProFile(body);

        return ok(result);


    }

}
