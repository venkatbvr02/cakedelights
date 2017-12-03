package controllers;

//import Entity.CompleteProfileEntity;
import Entity.SearchEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.srujanika.utils.EncyDecyUtility;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import service.SearchService;

public class SearchController extends Controller {
    SearchService searchService;
   @BodyParser.Of(BodyParser.Json.class)
    public Result search()
    {
        JsonNode jsonNode=request().body().asJson();
        ObjectMapper objectMapper=new ObjectMapper();
        try
        {
           SearchEntity searchEntity =objectMapper.treeToValue(jsonNode,SearchEntity.class);
            System.out.println(searchEntity.getAt005()+"::::::::::::::::::::::::::::::"+searchEntity.getAt007()+":::::::");
           // String profid= EncyDecyUtility.decrypt(request().cookie("uniquekey").value(),"yourprofileidofp");
           searchService.searchDetails(searchEntity);

        }
        catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }

        return ok("Search results");
    }
}
