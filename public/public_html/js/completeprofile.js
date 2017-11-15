/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var completeprofile={};
function completeRegistration() {
    //alert("coming here");
    //alert(JSON.stringify(completeprofile));
    if( dovalidation()) {
      alert(JSON.stringify(completeprofile));
        $.ajax({
            url: baseurl+"/completeprofile",
            method: "POST",
            contentType: 'application/json',
            //dataType: "json",
            data: JSON.stringify(completeprofile),
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
    //for bodytype
    var bodytype = getRadioValue("bodytype");
    if (bodytype == null || bodytype == "") {
        showAlert("validation error", "body type  should not empty");
        return false;
    } else {
        completeprofile["bodytype"] = bodytype;
    }
    //for weight
    var weight=getDropdownValue("weight");
    if(weight==null||weight=="")
    {
        showAlert("Validation Error","Weight should not be empty");
        return false;
    }
    else {
        completeprofile["weight"]=weight;

    }
    var educationInDetail=getTextValue("educationInDetail");
    if(educationInDetail==null||educationInDetail=="")
    {
        showAlert("Validation Error","Education in details should not be empty");
        return false;
    }
    else {
        completeprofile["educationInDetail"]=educationInDetail;
    }
    var occupationInDetail=getTextValue("occupationInDetail");
    if(occupationInDetail==null||occupationInDetail=="")
    {
        showAlert("Validation Error","occupation in detail should not be empty");
        return false;
    }
    else
    {
        completeprofile["occupationInDetail"]=occupationInDetail;
    }
    var eatingHabbit=getRadioValue("eatingHabbit");
    if(eatingHabbit==null||eatingHabbit=="")
    {
        showAlert("Validation Error","eating habbit should not be empty");
        return false;
    }
    else {
        completeprofile["eatingHabbit"] = eatingHabbit;
    }
    var drinkingHabbit=getRadioValue("drinkingHabbit");
    if(drinkingHabbit==null||drinkingHabbit=="")
    {
        showAlert("Validation error","Drinking Habbit should not be empty");
        return false;
    }
    else {
        completeprofile["drinkingHabbit"]=drinkingHabbit;
    }
    var smokingHabbit=getRadioValue("smokingHabbit");
    if(smokingHabbit==null||smokingHabbit=="")
    {
        showAlert("Validation Error","Smoking Habbit should not be empty");
        return false;
    }
    else {
        completeprofile["smokingHabbit"]=smokingHabbit;
    }
    var star=getDropdownValue("star");
    if(star==null||star=="")
    {
        showAlert("Validation Error","star should not be empty");
        return false;
    }
    else {
        completeprofile["star"]=star;
    }
    var raasi=getTextValue("raasi");
    if(raasi==null||raasi=="")
    {
        showAlert("Validation Error","raasi should not be empty");
        return false;
    }
    else {
        completeprofile["raasi"]=raasi;
    }

    var hours=getDropdownValue("hours");
    if(hours==null||hours=="")
    {
        showAlert("Validation Error","hours should not be empty");
        return false;
    }
    else {
        completeprofile["hours"]=hours;
    }
    var minutes=getDropdownValue("minutes");
    if(minutes==null||minutes=="")
    {
        showAlert("Validation Error","minutes should not be empty");
        return false;
    }
    else {
        completeprofile["minutes"]=minutes;
    }
    var ampm=getDropdownValue("ampm");
    if(ampm==null||ampm=="")
    {
        showAlert("Validation Error","ampm should not be empty");
        return false;
    }
    else {
        completeprofile["ampm"]=ampm;
    }

    var country=getDropdownValue("country");
    if(country==null||country=="")
    {
        showAlert("Validation Error","country should not be empty");
        return false;
    }
    else {
        completeprofile["country"]=country;
    }
    var state=getDropdownValue("state");
    if(state==null||state=="")
    {
        showAlert("Validation Error","state should not be empty");
        return false;
    }
    else {
        completeprofile["state"]=state;
    }
    var city=getDropdownValue("city");
    if(city==null||city=="")
    {
        showAlert("Validation Error","city should not be empty");
        return false;
    }
    else {
        completeprofile["city"]=city;
    }

    var fatherstatus=getDropdownValue("fatherstatus");
    if(fatherstatus==null||fatherstatus=="")
    {
        showAlert("Validation Error","fatherstatus should not be empty");
        return false;
    }
    else {
        completeprofile["fatherstatus"]=fatherstatus;
    }
    var motherstatus=getDropdownValue("motherstatus");
    if(motherstatus==null||motherstatus=="")
    {
        showAlert("Validation Error","motherstatus should not be empty");
        return false;
    }
    else {
        completeprofile["motherstatus"]=motherstatus;
    }
    var noofbrothers=getDropdownValue("noofbrothers");
    if(noofbrothers==null||noofbrothers=="")
    {
        showAlert("Validation Error","noofbrothers should not be empty");
        return false;
    }
    else {
        completeprofile["noofbrothers"]=noofbrothers;
    }
    var noofbrothersmarried=getDropdownValue("noofbrothersmarried");
    if(noofbrothersmarried==null||noofbrothersmarried=="")
    {
        showAlert("Validation Error","noofbrothersmarried should not be empty");
        return false;
    }
    else {
        completeprofile["noofbrothersmarried"]=noofbrothersmarried;
    }
    var noofsisters=getDropdownValue("noofsisters");
    if(noofsisters==null||noofsisters=="")
    {
        showAlert("Validation Error","noofsisters should not be empty");
        return false;
    }
    else {
        completeprofile["noofsisters"]=noofsisters;
    }
    var noofsistersmarried=getDropdownValue("noofsistersmarried");
    if(noofsistersmarried==null||noofsistersmarried=="")
    {
        showAlert("Validation Error","noofsistersmarried should not be empty");
        return false;
    }
    else {
        completeprofile["noofsistersmarried"]=noofsistersmarried;
    }
    var familylocation = getRadioValue("familylocation");
    if (familylocation == null || familylocation == "") {
        showAlert("validation error", "familylocation  should not empty");
        return false;
    } else {
        completeprofile["familylocation"] = familylocation;
    }
    var countrycode=getDropdownValue("countrycode");
    if(countrycode==null||countrycode=="")
    {
        showAlert("Validation Error","countrycode should not be empty");
        return false;
    }
    else {
        completeprofile["countrycode"]=countrycode;
    }
    var mobilenumber=getTextValue("mobilenumber");
    if(mobilenumber==null||mobilenumber=="")
    {
        showAlert("Validation Error","mobilenumber should not be empty");
        return false;
    }
    else {
        completeprofile["mobilenumber"]=mobilenumber;
    }
    var ancestralorigin=getTextValue("ancestralorigin");
    if(ancestralorigin==null||ancestralorigin=="")
    {
        showAlert("Validation Error","ancestralorigin should not be empty");
        return false;
    }
    else {
        completeprofile["ancestralorigin"]=ancestralorigin;
    }
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
