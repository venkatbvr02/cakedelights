package controllers;

import Entity.CompleteProfileEntity;
import com.google.gson.Gson;
import com.srujanika.utils.EncyDecyUtility;
import play.api.mvc.Controller;
import play.mvc.Result;
import service.ViewedProfileService;
import serviceImpl.ViewedProfileServiceImpl;

import javax.inject.Inject;
import java.util.List;

public class ViewedProfileController extends play.mvc.Controller {
    @Inject
    ViewedProfileServiceImpl viewedProfileService;
    public Result getViewedProfiles()
    {
        String profid= EncyDecyUtility.decrypt(request().cookie("uniquekey").value(),"yoursecretkeyofp");
        List<CompleteProfileEntity> completeProfileEntity=viewedProfileService.getViewedprofiles(profid);
        Gson gson=new Gson();
        String responseString=gson.toJson(completeProfileEntity);
        if(responseString.trim()!=null)
        {
            return ok(responseString);
        }
        else {
            return ok("No Results Found");
        }
    }
    public Result getclikedonmeprofiles()
    {
        String profid=EncyDecyUtility.decrypt(request().cookie("uniquekey").value(),"yoursecretkeyofp");
        System.out.println("::::::::::::::::::::"+profid);
        List<CompleteProfileEntity> completeProfileEntityList=viewedProfileService.getClickedonmeprofiles(profid);
        Gson gson=new Gson();
        String responsestring=gson.toJson(completeProfileEntityList);
        if (responsestring!=null) {
            return ok(responsestring);
        }
        else {
            return ok("No one Viewed Your Profile");
        }
    }

}
