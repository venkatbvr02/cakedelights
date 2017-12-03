package controllers;

import Entity.CompleteProfileEntity;
import Entity.EditCompleteProfileEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.srujanika.utils.EncyDecyUtility;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import serviceImpl.EditCompleteProfileServiceImpl;

import javax.inject.Inject;
import java.util.List;

public class EditCompleteProfileController extends Controller {
    @Inject
    EditCompleteProfileServiceImpl editCompleteProfileService;


    public Result srv005()
    {
        String profid= EncyDecyUtility.decrypt(request().cookie("uniquekey").value(),"yoursecretkeyofp");
       EditCompleteProfileEntity editCompleteProfileEntity=   editCompleteProfileService.getcompletedetails(profid);
       // EditCompleteProfileEntity editCompleteProfileEntity1=editCompleteProfileEntity.getAtp000();
       // editCompleteProfileEntity=list.get(0);
        //System.out.println(editCompleteProfileEntity.toString());
        Gson gson=new Gson();
        String responseJsonString=gson.toJson(editCompleteProfileEntity);
       // System.out.println("::::::::::::::::::::::::;   "+responseJsonString);
        return ok(responseJsonString.trim());

    }
    @BodyParser.Of(BodyParser.Json.class)
    public Result editcomplete()
    {
        JsonNode jsonNode=request().body().asJson();
        ObjectMapper objectMapper=new ObjectMapper();
        try {

            EditCompleteProfileEntity editCompleteProfileEntity = objectMapper.treeToValue(jsonNode, EditCompleteProfileEntity.class);
            System.out.println(editCompleteProfileEntity.getAt008()+":::::::::::::;;;;;;");
            String profid=EncyDecyUtility.decrypt(request().cookie("uniquekey").value(),"yoursecretkeyofp");
            //editCompleteProfileEntity.setAtp000(profid);
            editCompleteProfileService.saveeditdetails(editCompleteProfileEntity,profid);

        }
        catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }

        return ok("You have Edited Successfully");
    }

}
