/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var edit_profile={};
$body=$("body");
function completeRegsistration() {
    // alert(JSON.stringify(edit_profile));
   if( dovalidation()) {
       // alert(JSON.stringify(edit_profile));
       $body.addClass("loading");
       $.ajax({
           url: baseurl+"/srv003",
           method: "POST",
           contentType: 'application/json',
           //dataType: "json",
           data: JSON.stringify(edit_profile),
           crossDomain: true,
           success: function (data) {
               $body.removeClass("loading");
               alert(data);
               window.location = baseurl+"/assets/public_html/add_profilepic.html";
           }
       });
   }

}
function setHeader(xhr) {
    xhr.setRequestHeader('Access-Control-Allow-Origin: *');
}


function dovalidation() {
    //for marital status
    var maritalstatus = getRadioValue("maritalstatus");
    if (maritalstatus == null || maritalstatus == "") {
        showAlert("validation error", "Marital status should not empty");
        return false;
    } else {
        edit_profile["at007"] = maritalstatus;
    }
    //for marital status
    var anydisability  = getRadioValue("anydisability");
    if (anydisability == null || anydisability == "") {
        showAlert("validation error", "disability  should not empty");
        return false;
    } else {
        edit_profile["at012"] = anydisability;
    }
    //for height
    var height=getDropdownValue("height");
    if(height == null||height == "")
    {
        showAlert("validation error","height shouldn't be empty");
        return false;
    }else {
        edit_profile["at008"]=height;
    }
    // for caste
    var caste=getTextValue("caste");
    if(caste==null||caste=="")
    {
        showAlert("validation error","caste shouldn't be empty");
        return false;
    }else {
        edit_profile["at013"]=caste;
    }
    //for Subcaste
    var subcaste=getTextValue("subcaste");
    if(subcaste==null||subcaste=="")
    {
        showAlert("validation error","sub caste shouldn't be empty");
        return false;
    }else {
        edit_profile["at014"]=subcaste;
    }
    //for gothram
    var gothram=getTextValue("gothram");
    if(gothram==null||gothram=="")
    {
        showAlert("validation error","gothram shouldn't be empty");
        return false;
    }else {
        edit_profile["at015"]=gothram;
    }
    //for dosham
    var dosham=getTextValue("dosham");
    if(dosham==null||dosham=="")
    {
        showAlert("validation error","gothram shouldn't be empty");
        return false;
    }else {
        edit_profile["at016"]=dosham;
    }
    //for higher education
    var highesteducation=getTextValue("highesteducation");
    if(highesteducation==null||highesteducation=="")
    {
        showAlert("validation error","highesteducation shouldn't be empty");
        return false;
    }else {
        edit_profile["at017"]=highesteducation;
    }
    //for employed in
    var employedIn=getTextValue("employedIn");
    if(employedIn==null||employedIn=="")
    {
        showAlert("validation error","employed In shouldn't be empty");
        return false;
    }else {
        edit_profile["at018"]=employedIn;
    }
    //for occupation
    var occupation=getTextValue("occupation");
    if(occupation==null||occupation=="")
    {
        showAlert("validation error","occupation shouldn't be empty");
        return false;
    }else {
        edit_profile["at019"]=occupation;
    }

    //for income
    var income=getTextValue("income");
    if(income==null||income=="")
    {
        showAlert("validation error","income shouldn't be empty");
        return false;
    }else {
        edit_profile["at020"]=income;
    }
    //for about me
    var aboutme=getTextValue("aboutme");
    if(aboutme==null||aboutme=="")
    {
        showAlert("validation error","aboutme shouldn't be empty");
        return false;
    }else {
        edit_profile["at022"]=aboutme;
    }

    //for family status
    var familystatus = getRadioValue("familystatus");
    if (familystatus == null || familystatus == "") {
        showAlert("validation error", "Family status should not empty");
        return false;
    } else {
        edit_profile["at009"] = familystatus;
    }

    //for family type
    var familyType = getRadioValue("familytype");
    if (familyType == null || familyType == "") {
        showAlert("validation error", "Family type should not empty");
        return false;
    } else {
        edit_profile["at010"] = familyType;
    }

    var familyValues = getRadioValue("familyvalues");
    if (familyValues == null || familyValues == "") {
        showAlert("validation error", "Family values should not empty");
        return false;
    } else {
        edit_profile["at011"] = familyValues;
    }
    //employed in
    var employedIn = getRadioValue("employedIn");
    if (employedIn == null || employedIn == "") {
        showAlert("validation error", "Employed In should not empty");
        return false;
    } else {
        edit_profile["at018"] = employedIn;
    }
    //for currency type
    var incomecurrencytype = getRadioValue("incomecurrencytype");
    if (incomecurrencytype == null || incomecurrencytype == "") {
        showAlert("validation error", "Income per month/year  should not empty");
        return false;
    } else {
        edit_profile["at021"] = incomecurrencytype;
    }

    //for text field validation
//alert(edit_profile.toString()+" ");
//    var
    return true;
}

function gettextValue(fieldName) {
    var _result;
    try {
        _result = $(fieldName).val();
    } catch (e) {
    }
    return _result;
}
