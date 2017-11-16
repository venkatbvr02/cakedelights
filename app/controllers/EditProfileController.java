package controllers;

import Entity.EditProfileEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import play.api.libs.json.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import serviceImpl.EditProfileServiceImpl;

import javax.inject.Inject;

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


        // jsonNode.findValues("datas");
      //  EditProfileEntity editProfileEntity=new EditProfileEntity()();
        //editProfileEntity.setMaritalStatus(jsonNode.get(maritalstatus));

        System.out.println("::::::::::::::: :::"+jsonNode.get("height"));
        System.out.println("::::::::::::::: :::"+jsonNode.asText());
        response().setHeader("Access-Control-Allow-Origin", "*");
//        editProfileService.editProfileDetails(editProfileEntity);

      //  System.out.println(jsonNode.asText());
       // editProfileService.editProfileDetails(editProfileEntity);
//        editProfileEntity.setMaritalStatus("Never Married");
//        editProfileEntity.setHeight(5.5);
//        editProfileEntity.setFamilyStatus("Middle class");
//        editProfileEntity.setFamilyType("joint");
//        editProfileEntity.setFamilyValues("liberal");
//        editProfileEntity.setAnyDisability("Noraml");
//        editProfileEntity.setCaste("OC");
//        editProfileEntity.setSubCaste("Kamma");
//        editProfileEntity.setGothram("chinthpella");
//        editProfileEntity.setDosham("NO");
//        editProfileEntity.setHigherEducation("MCA");
//        editProfileEntity.setEmployedIn("SRUJANIKA");
//        editProfileEntity.setOccupation("SOFTWARE ENGINEER");
//        editProfileEntity.setIncome(20000);
//        editProfileEntity.setAboutMe("I am currently working for srujanika technologies");
//        editProfileService.editProfileDetails(editProfileEntity);
      return ok("Values Inserted");
    }

}
