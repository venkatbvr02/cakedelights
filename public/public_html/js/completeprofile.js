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
        $body.addClass("loading");
      alert(JSON.stringify(completeprofile));
        $.ajax({
            url: baseurl+"/srv004",
            method: "POST",
            contentType: 'application/json',
            //dataType: "json",
            data: JSON.stringify(completeprofile),
            crossDomain: true,
            success: function (data) {
                alert("Registration Success");
                $body.removeClass("loading");

                window.location = baseurl+"/assets/public_html/index.html";
            }
        });
    }

}
function setHeader(xhr) {
    xhr.setRequestHeader('Access-Control-Allow-Origin: *');
}


function dovalidation() {
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

    var hours=getDropdownValue("hours");
    if(hours==null||hours=="")
    {
        showAlert("Validation Error","hours should not be empty");
        return false;
    }
    else {
        completeprofile["at032"]=hours;
    }
    var minutes=getDropdownValue("minutes");
    if(minutes==null||minutes=="")
    {
        showAlert("Validation Error","minutes should not be empty");
        return false;
    }
    else {
        completeprofile["at033"]=minutes;
    }
    var ampm=getDropdownValue("ampm");
    if(ampm==null||ampm=="")
    {
        showAlert("Validation Error","ampm should not be empty");
        return false;
    }
    else {
        completeprofile["at034"]=ampm;
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


