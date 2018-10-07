package controllers;

//import Entity.CompleteProfileEntity;
import Entity.CompleteProfileEntity;
import Entity.SearchEntity;
import Entity.SearchEntitys;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.srujanika.utils.EncyDecyUtility;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import service.SearchService;
import serviceImpl.SearchServiceImpl;

import javax.inject.Inject;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SearchController extends Controller {
    @Inject
    SearchServiceImpl searchService;
   @BodyParser.Of(BodyParser.Json.class)
    public Result search() throws JsonProcessingException,IOException
    {
        JsonNode jsonNode=request().body().asJson();
        ObjectMapper objectMapper=new ObjectMapper();
           SearchEntity searchEntity =objectMapper.treeToValue(jsonNode,SearchEntity.class);
        List<SearchEntitys> results= searchService.searchDetails(searchEntity);
            Gson gson=new Gson();
            String jsonResponseString=gson.toJson(results);
            if (jsonResponseString!=null)
            {
                return ok(jsonResponseString.trim());
            }
            else
            {
             return redirect("/assets/public_html/complete_profile.html");
            }
    }
    public Result getfeaturedprofiles()
    {
        String profid=EncyDecyUtility.decrypt(request().cookie("uniquekey").value(),"yoursecretkeyofp");
        List<SearchEntitys> searchEntitysList=searchService.getfeaturedprofiles(profid);
        Gson gson=new Gson();
        String responsestring=gson.toJson(searchEntitysList);
        if (responsestring!=null)
        {
            return ok(responsestring);
        }
        else {
            return ok(responsestring);
        }
    }
}
