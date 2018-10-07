package controllers;

import Entity.CompleteProfileEntity;
import akka.stream.impl.io.OutputStreamSourceStage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.srujanika.utils.EncyDecyUtility;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import serviceImpl.ProfileSearchServiceImpl;

import javax.inject.Inject;

import java.util.List;

import static play.mvc.Results.ok;
public class ProfileSearchController extends Controller {
    @Inject
    ProfileSearchServiceImpl profileSearchService;

    @BodyParser.Of(BodyParser.Json.class)
    public Result searchProfile() throws JsonProcessingException {
        JsonNode jsonNode = request().body().asJson();
        ObjectMapper objectMapper = new ObjectMapper();
        String profid = "";
        CompleteProfileEntity completeProfileEntity = objectMapper.treeToValue(jsonNode, CompleteProfileEntity.class);
       profid = EncyDecyUtility.decrypt(request().cookie("uniquekey").value(), "yoursecretkeyofp");
        String profileId = completeProfileEntity.getAtp000();
        System.out.println(profileId);
        CompleteProfileEntity completeProfileEntity1 = profileSearchService.searchProfileById(completeProfileEntity, profileId,profid);
        Gson gson = new Gson();
        String responseString = gson.toJson(completeProfileEntity1);
        System.out.println(responseString+":::::::::::::::::");
        if (responseString != null) {
            return ok(responseString.trim());
        } else {
            return ok("not success");
        }
    }
    @BodyParser.Of(BodyParser.Json.class)
    public Result getprofiles() throws JsonProcessingException{
        JsonNode jsonNode=request().body().asJson();
        ObjectMapper objectMapper=new ObjectMapper();
        CompleteProfileEntity completeProfileEntity=objectMapper.treeToValue(jsonNode,CompleteProfileEntity.class);
        List<CompleteProfileEntity> completeProfileEntity1=profileSearchService.getProfiles(completeProfileEntity);
        Gson gson=new Gson();
        String responseString=gson.toJson(completeProfileEntity1);
        if(responseString!=null) {
            return ok(responseString.trim());
        }
        else {
            return redirect("/assets/public_html/index.html");
        }
    }


    @BodyParser.Of(BodyParser.Json.class)
    public Result getviewprofile() throws JsonProcessingException{
        JsonNode jsonNode=request().body().asJson();
        ObjectMapper objectMapper=new ObjectMapper();
        CompleteProfileEntity completeProfileEntity=objectMapper.treeToValue(jsonNode,CompleteProfileEntity.class);
        List<CompleteProfileEntity> completeProfileEntity1=profileSearchService.getViewProfiles(completeProfileEntity);
        Gson gson=new Gson();
        String responseString=gson.toJson(completeProfileEntity1);
        if(responseString!=null) {
            return ok(responseString.trim());
        }
        else {
            return redirect("/assets/public_html/index.html");
        }
    }

}