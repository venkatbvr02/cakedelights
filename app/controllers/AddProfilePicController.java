package controllers;

import Entity.AddprofilePic;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import serviceImpl.AddProfilePicServiceImpl;

import javax.inject.Inject;
import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

public class AddProfilePicController extends Controller {
    @Inject
    AddProfilePicServiceImpl addProfilePicService;
    @BodyParser.Of(BodyParser.Json.class)
    public Result srv006()
    {

        JsonNode jsonNode=request().body().asJson();
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            AddprofilePic addprofilePic = objectMapper.treeToValue(jsonNode, AddprofilePic.class);
            addProfilePicService.saveProfilePicDetails(addprofilePic);
        }
        catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }

        return ok( "profie pic saved");
    }

}
