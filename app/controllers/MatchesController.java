package controllers;

import Entity.CompleteProfileEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.srujanika.utils.EncyDecyUtility;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import serviceImpl.MatchesServiceImpl;

import javax.inject.Inject;
import java.util.List;

public class MatchesController extends Controller {
   @Inject
    MatchesServiceImpl matchesService;

    public Result matchprofiles()
    {
        String profid= EncyDecyUtility.decrypt(request().cookie("uniquekey").value(),"yoursecretkeyofp");
        System.out.println(profid+":::::::::::::::::::::::::::::");
        List<CompleteProfileEntity> completeProfileEntity=matchesService.getMatchedProfiles(profid);
        Gson gson=new Gson();
        String responseString=gson.toJson(completeProfileEntity);
        if(responseString.trim()!=null)
        {
            return ok(responseString);
        }
        return ok("No Matches Found");
    }
    @BodyParser.Of(BodyParser.Json.class)
    public Result matchbyid() throws JsonProcessingException
    {
        String profid= EncyDecyUtility.decrypt(request().cookie("uniquekey").value(),"yoursecretkeyofp");
        JsonNode jsonNode=request().body().asJson();
        ObjectMapper objectMapper=new ObjectMapper();
        CompleteProfileEntity completeProfileEntity=objectMapper.treeToValue(jsonNode,CompleteProfileEntity.class);
       int id= Integer.parseInt(completeProfileEntity.getAtp000());
       List<CompleteProfileEntity> list=matchesService.getProfilesbypageId(profid,id);
        Gson gson=new Gson();
        String responseString=gson.toJson(list);
        if (responseString!=null)
        {
            return ok(responseString);
        }
       // System.out.println(id+"::::::::::::::::::::");
     return ok("No matches found");
    }
}
