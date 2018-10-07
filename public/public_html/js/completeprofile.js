/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var completeprofile={};
$body = $("body");
function completeRegistration() {
    //alert("coming here");
    //alert(JSON.stringify(completeprofile));
    if( dovalidation()) {
      //  $body.addClass("loading");
     // alert(JSON.stringify(completeprofile));
        $.ajax({
            url: baseurl+"/srv004",
            method: "POST",
            contentType: 'application/json',
            //dataType: "json",
            data: JSON.stringify(completeprofile),

            crossDomain: true,
            success: function (data) {
                //alert(data);
                // $body.removeClass("loading");
                if(data=="profile success") {
                    window.location.href = baseurl + "/assets/public_html/add_profilepic.html";
                }
                else if(data=="profile Unsuccessfull")
                {
                    window.location.href = baseurl + "/assets/public_html/complete_profile.html";
                }
                else {
                    window.location.href = baseurl + "/assets/public_html/complete_profile.html";
                }
            }
        });
    }

}
function setHeader(xhr) {

    xhr.setRequestHeader('Access-Control-Allow-Origin: *');

}

//sessionStorage.getItem()
function dovalidation() {
    //for marital status
    var maritalstatus = getRadioValue("maritalstatus");
    if (maritalstatus == null || maritalstatus == "") {
        showAlert("validation error", "Marital status should not empty");
        return false;
    } else {
        completeprofile["at007"] = maritalstatus;
    }
    //for marital status
    var anydisability  = getRadioValue("anydisability");
    if (anydisability == null || anydisability == "") {
        showAlert("validation error", "disability  should not empty");
        return false;
    } else {
        completeprofile["at012"] = anydisability;
    }
    //for height
    var height=getDropdownValue("height");
    if(height == null||height == "")
    {
        showAlert("validation error","height shouldn't be empty");
        return false;
    }else {
        completeprofile["at008"]=height;
    }
    // for caste
    var caste=getTextValue("caste");
    if(caste==null||caste=="")
    {
        showAlert("validation error","caste shouldn't be empty");
        return false;
    }else {
        completeprofile["at013"]=caste;
    }
    //for Subcaste
    var subcaste=getTextValue("subcaste");
    if(subcaste==null||subcaste=="")
    {
        showAlert("validation error","sub caste shouldn't be empty");
        return false;
    }else {
        completeprofile["at014"]=subcaste;
    }
    //for gothram
    var gothram=getTextValue("gothram");
    if(gothram==null||gothram=="")
    {
        showAlert("validation error","gothram shouldn't be empty");
        return false;
    }else {
        completeprofile["at015"]=gothram;
    }
    //for dosham
    var dosham=getTextValue("dosham");
    if(dosham==null||dosham=="")
    {
        showAlert("validation error","gothram shouldn't be empty");
        return false;
    }else {
        completeprofile["at016"]=dosham;
    }
    //for higher education
    var highesteducation=getTextValue("highereducation");
    if(highesteducation==null||highesteducation=="")
    {
        showAlert("validation error","highesteducation shouldn't be empty");
        return false;
    }else {
        completeprofile["at017"]=highesteducation;
    }
    //for employed in
    var employedIn=getTextValue("employedIn");
    if(employedIn==null||employedIn=="")
    {
        showAlert("validation error","employed In shouldn't be empty");
        return false;
    }else {
        completeprofile["at018"]=employedIn;
    }
    //for occupation
    var occupation=getTextValue("occupation");
    if(occupation==null||occupation=="")
    {
        showAlert("validation error","occupation shouldn't be empty");
        return false;
    }else {
        completeprofile["at019"]=occupation;
    }

    //for income
    var income=getTextValue("income");
    if(income==null||income=="")
    {
        showAlert("validation error","income shouldn't be empty");
        return false;
    }else {
        completeprofile["at020"]=income;
    }
    //for about me
    var aboutme=getTextValue("aboutme");
    if(aboutme==null||aboutme=="")
    {
        showAlert("validation error","aboutme shouldn't be empty");
        return false;
    }else {
        completeprofile["at022"]=aboutme;
    }

    //for family status
    var familystatus = getRadioValue("familystatus");
    if (familystatus == null || familystatus == "") {
        showAlert("validation error", "Family status should not empty");
        return false;
    } else {
        completeprofile["at009"] = familystatus;
    }

    //for family type
    var familyType = getRadioValue("familytype");
    if (familyType == null || familyType == "") {
        showAlert("validation error", "Family type should not empty");
        return false;
    } else {
        completeprofile["at010"] = familyType;
    }

    var familyValues = getRadioValue("familyvalues");
    if (familyValues == null || familyValues == "") {
        showAlert("validation error", "Family values should not empty");
        return false;
    } else {
        completeprofile["at011"] = familyValues;
    }
    //employed in
    var employedIn = getRadioValue("employedIn");
    if (employedIn == null || employedIn == "") {
        showAlert("validation error", "Employed In should not empty");
        return false;
    } else {
        completeprofile["at018"] = employedIn;
    }
    //for currency type
    var incomecurrencytype = getRadioValue("incomecurrencytype");
    if (incomecurrencytype == null || incomecurrencytype == "") {
        showAlert("validation error", "Income per month/year  should not empty");
        return false;
    } else {
        completeprofile["at021"] = incomecurrencytype;
    }

    //for bodytype
    var bodytype = getRadioValue("bodytype");
    if (bodytype == null || bodytype == "") {
        showAlert("validation error", "body type  should not empty");
        return false;
    } else {
        completeprofile["at023"] = bodytype;
    }
    //for weight
    var weight=getDropdownValue("weight");
    if(weight==null||weight=="")
    {
        showAlert("Validation Error","Weight should not be empty");
        return false;
    }
    else {
        completeprofile["at024"]=weight;

    }
    var educationInDetail=getTextValue("educationInDetail");
    if(educationInDetail==null||educationInDetail=="")
    {
        showAlert("Validation Error","Education in details should not be empty");
        return false;
    }
    else {
        completeprofile["at025"]=educationInDetail;
    }
    var occupationInDetail=getTextValue("occupationInDetail");
    if(occupationInDetail==null||occupationInDetail=="")
    {
        showAlert("Validation Error","occupation in detail should not be empty");
        return false;
    }
    else
    {
        completeprofile["at026"]=occupationInDetail;
    }
    var eatingHabbit=getRadioValue("eatingHabbit");
    if(eatingHabbit==null||eatingHabbit=="")
    {
        showAlert("Validation Error","eating habbit should not be empty");
        return false;
    }
    else {
        completeprofile["at027"] = eatingHabbit;
    }
    var drinkingHabbit=getRadioValue("drinkingHabbit");
    if(drinkingHabbit==null||drinkingHabbit=="")
    {
        showAlert("Validation error","Drinking Habbit should not be empty");
        return false;
    }
    else {
        completeprofile["at028"]=drinkingHabbit;
    }
    var smokingHabbit=getRadioValue("smokingHabbit");
    if(smokingHabbit==null||smokingHabbit=="")
    {
        showAlert("Validation Error","Smoking Habbit should not be empty");
        return false;
    }
    else {
        completeprofile["at029"]=smokingHabbit;
    }
    var star=getDropdownValue("star");
    if(star==null||star=="")
    {
        showAlert("Validation Error","star should not be empty");
        return false;
    }
    else {
        completeprofile["at030"]=star;
    }
    var raasi=getTextValue("raasi");
    if(raasi==null||raasi=="")
    {
        showAlert("Validation Error","raasi should not be empty");
        return false;
    }
    else {
        completeprofile["at031"]=raasi;
    }

    // var hours=getDropdownValue("hours");
    // if(hours==null||hours=="")
    // {
    //     showAlert("Validation Error","hours should not be empty");
    //     return false;
    // }
    // else {
    //     completeprofile["at032"]=hours;
    // }
    // var minutes=getDropdownValue("minutes");
    // if(minutes==null||minutes=="")
    // {
    //     showAlert("Validation Error","minutes should not be empty");
    //     return false;
    // }
    // else {
    //     completeprofile["at033"]=minutes;
    // }
    // var ampm=getDropdownValue("ampm");
    // if(ampm==null||ampm=="")
    // {
    //     showAlert("Validation Error","ampm should not be empty");
    //     return false;
    // }
    // else {
    //     completeprofile["at034"]=ampm;
    // }

    //for time of birth
    var timeofbirth=getTextValue("time");
    if(timeofbirth==null||timeofbirth=="")
    {
        showAlert("Validation Error","Time of birth should not be empty");
        return false;
    }
    else
    {
        completeprofile["at032"]=timeofbirth;
    }
    var country=getDropdownValue("country");
    if(country==null||country=="")
    {
        showAlert("Validation Error","country should not be empty");
        return false;
    }
    else {
        completeprofile["at035"]=country;
    }
    var state=getDropdownValue("state");
    if(state==null||state=="")
    {
        showAlert("Validation Error","state should not be empty");
        return false;
    }
    else {
        completeprofile["at036"]=state;
    }
    var city=getDropdownValue("city");
    if(city==null||city=="")
    {
        showAlert("Validation Error","city should not be empty");
        return false;
    }
    else {
        completeprofile["at037"]=city;
    }

    var fatherstatus=getDropdownValue("fatherstatus");
    if(fatherstatus==null||fatherstatus=="")
    {
        showAlert("Validation Error","fatherstatus should not be empty");
        return false;
    }
    else {
        completeprofile["at038"]=fatherstatus;
    }
    var motherstatus=getDropdownValue("motherstatus");
    if(motherstatus==null||motherstatus=="")
    {
        showAlert("Validation Error","motherstatus should not be empty");
        return false;
    }
    else {
        completeprofile["at039"]=motherstatus;
    }
    var religion=getDropdownValue("religion");
    if(religion==null||religion=="")
    {
        showAlert("Validation error","Religion Should not be Empty");
        return false;
    }
    else {
        completeprofile["at048"]=religion;
    }
    var mothertongue=getDropdownValue("mothertongue");
    if(mothertongue==null||mothertongue=="")
    {
        showAlert("Validation error","Mother tongue should not be Empty");
        return false;
    }
    else {
        completeprofile["at049"]=mothertongue;
    }
    var noofbrothers=getDropdownValue("noofbrothers");
    if(noofbrothers==null||noofbrothers=="")
    {
        showAlert("Validation Error","noofbrothers should not be empty");
        return false;
    }
    else {
        completeprofile["at040"]=noofbrothers;
    }
    var noofbrothersmarried=getDropdownValue("noofbrothersmarried");
    if(noofbrothersmarried==null||noofbrothersmarried=="")
    {
        showAlert("Validation Error","noofbrothersmarried should not be empty");
        return false;
    }
    else {
        completeprofile["at041"]=noofbrothersmarried;
    }
    var noofsisters=getDropdownValue("noofsisters");
    if(noofsisters==null||noofsisters=="")
    {
        showAlert("Validation Error","noofsisters should not be empty");
        return false;
    }
    else {
        completeprofile["at042"]=noofsisters;
    }
    var noofsistersmarried=getDropdownValue("noofsistersmarried");
    if(noofsistersmarried==null||noofsistersmarried=="")
    {
        showAlert("Validation Error","noofsistersmarried should not be empty");
        return false;
    }
    else {
        completeprofile["at043"]=noofsistersmarried;
    }
    var familylocation = getRadioValue("familylocation");
    if (familylocation == null || familylocation == "") {
        showAlert("validation error", "familylocation  should not empty");
        return false;
    } else {
        completeprofile["at044"] = familylocation;
    }
    var countrycode=getDropdownValue("countrycode");
    if(countrycode==null||countrycode=="")
    {
        showAlert("Validation Error","countrycode should not be empty");
        return false;
    }
    else {
        completeprofile["at045"]=countrycode;
    }
    var mobilenumber=getTextValue("mobilenumber");
    if(mobilenumber==null||mobilenumber=="")
    {
        showAlert("Validation Error","mobilenumber should not be empty");
        return false;
    }
    else {
        completeprofile["at046"]=mobilenumber;
    }
    var ancestralorigin=getTextValue("ancestralorigin");
    if(ancestralorigin==null||ancestralorigin=="")
    {
        showAlert("Validation Error","ancestralorigin should not be empty");
        return false;
    }
    else {
        completeprofile["at047"]=ancestralorigin;
    }
    return true;
}


