package controllers;

import Entity.CompleteProfileEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.asynchttpclient.Request;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import serviceImpl.CompleteProfileServiceImpl;

import javax.inject.Inject;

public class CompleteProfileController extends Controller {
    @Inject
    CompleteProfileServiceImpl completeProfileService;
    @BodyParser.Of(BodyParser.Json.class)
    public Result srv004()
    {
        JsonNode jsonNode=request().body().asJson();
        //System.out.println("coming here ;;;;;;; "+jsonNode.get("bodytype"));
        ObjectMapper objectMapper=new ObjectMapper();
        try
        {
            CompleteProfileEntity completeProfileEntity=objectMapper.treeToValue(jsonNode,CompleteProfileEntity.class);
            System.out.println(completeProfileEntity.getAt035()+":::::::::::"+completeProfileEntity.getAt036());
            completeProfileService.saveCompleteProfileDetails(completeProfileEntity);
            //System.out.println(completeProfileService.toString());
        }
        catch (JsonProcessingException e)
        {
            e.printStackTrace();
            return ok("profile Unsuccessfull");
        }
        return ok("profile success");
    }

}
