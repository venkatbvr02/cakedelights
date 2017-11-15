/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var edit_profile={};
function completeRegsistration() {
    // alert(JSON.stringify(edit_profile));
   if( dovalidation()) {
       alert(JSON.stringify(edit_profile));
       $.ajax({
           url: baseurl+"/edit",
           method: "POST",
           contentType: 'application/json',
           //dataType: "json",
           data: JSON.stringify(edit_profile),
           crossDomain: true,
           success: function (data) {
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
        edit_profile["maritalStatus"] = maritalstatus;
    }
    //for marital status
    var anydisability  = getRadioValue("anydisability");
    if (anydisability == null || anydisability == "") {
        showAlert("validation error", "disability  should not empty");
        return false;
    } else {
        edit_profile["anydisability"] = anydisability;
    }
    //for height
    var height=getTextValue("height");
    if(height == null||height == "")
    {
        showAlert("validation error","height shouldn't be empty");
        return false;
    }else {
        edit_profile["height"]=height;
    }
    // for caste
    var caste=getTextValue("caste");
    if(caste==null||caste=="")
    {
        showAlert("validation error","caste shouldn't be empty");
        return false;
    }else {
        edit_profile["caste"]=caste;
    }
    //for Subcaste
    var subcaste=getTextValue("subcaste");
    if(subcaste==null||subcaste=="")
    {
        showAlert("validation error","sub caste shouldn't be empty");
        return false;
    }else {
        edit_profile["subCaste"]=subcaste;
    }
    //for gothram
    var gothram=getTextValue("gothram");
    if(gothram==null||gothram=="")
    {
        showAlert("validation error","gothram shouldn't be empty");
        return false;
    }else {
        edit_profile["gothram"]=gothram;
    }
    //for dosham
    var dosham=getTextValue("dosham");
    if(dosham==null||dosham=="")
    {
        showAlert("validation error","gothram shouldn't be empty");
        return false;
    }else {
        edit_profile["dosham"]=dosham;
    }
    //for higher education
    var highesteducation=getTextValue("highesteducation");
    if(highesteducation==null||highesteducation=="")
    {
        showAlert("validation error","highesteducation shouldn't be empty");
        return false;
    }else {
        edit_profile["higherEducation"]=highesteducation;
    }
    //for employed in
    var employedIn=getTextValue("employedIn");
    if(employedIn==null||employedIn=="")
    {
        showAlert("validation error","employed In shouldn't be empty");
        return false;
    }else {
        edit_profile["employedIn"]=employedIn;
    }
    //for occupation
    var occupation=getTextValue("occupation");
    if(occupation==null||occupation=="")
    {
        showAlert("validation error","occupation shouldn't be empty");
        return false;
    }else {
        edit_profile["occupation"]=occupation;
    }

    //for income
    var income=getTextValue("income");
    if(income==null||income=="")
    {
        showAlert("validation error","income shouldn't be empty");
        return false;
    }else {
        edit_profile["income"]=income;
    }
    //for about me
    var aboutme=getTextValue("aboutme");
    if(aboutme==null||aboutme=="")
    {
        showAlert("validation error","aboutme shouldn't be empty");
        return false;
    }else {
        edit_profile["aboutMe"]=aboutme;
    }

    //for family status
    var familystatus = getRadioValue("familystatus");
    if (familystatus == null || familystatus == "") {
        showAlert("validation error", "Family status should not empty");
        return false;
    } else {
        edit_profile["familyStatus"] = familystatus;
    }

    //for family type
    var familyType = getRadioValue("familytype");
    if (familyType == null || familyType == "") {
        showAlert("validation error", "Family type should not empty");
        return false;
    } else {
        edit_profile["familyType"] = familyType;
    }

    var familyValues = getRadioValue("familyvalues");
    if (familyValues == null || familyValues == "") {
        showAlert("validation error", "Family values should not empty");
        return false;
    } else {
        edit_profile["familyValues"] = familyValues;
    }
    //employed in
    var employedIn = getRadioValue("employedIn");
    if (employedIn == null || employedIn == "") {
        showAlert("validation error", "Employed In should not empty");
        return false;
    } else {
        edit_profile["employedIn"] = employedIn;
    }
    //for currency type
    var incomecurrencytype = getRadioValue("incomecurrencytype");
    if (incomecurrencytype == null || incomecurrencytype == "") {
        showAlert("validation error", "Income per month/year  should not empty");
        return false;
    } else {
        edit_profile["incomecurrencytype"] = incomecurrencytype;
    }

    //for text field validation
//alert(edit_profile.toString()+" ");
//    var
    return true;
}
function showAlert(modaltitle, modalbody) {

    $('#modalbody').empty();
    $('#modaltitle').empty();
    $('#modaltitle').append(modaltitle);
    $('#modalbody').append(modalbody);
    $('#myModal').modal('show');

    return;
}

function dataclose() {
    $('#modalbody').empty();
    $('#modaltitle').empty();
}
function gettextValue(fieldName) {
    var _result;
    try {
        _result = $(fieldName).val();
    } catch (e) {
    }
    return _result;
}
