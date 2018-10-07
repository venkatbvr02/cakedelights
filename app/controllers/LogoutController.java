package controllers;

import com.srujanika.utils.EncyDecyUtility;
import play.mvc.Controller;
import play.mvc.Result;

public class LogoutController extends Controller {
    public Result logout()
    {
        String uniquekey= EncyDecyUtility.decrypt(request().cookie("uniquekey").value(),"yoursecretkeyofp");
        response().discardCookie(uniquekey);
        return ok("Logout Succesfully");
    }
}
