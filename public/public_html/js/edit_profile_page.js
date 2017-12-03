var edit_profile={};
$(document).ready(function ()
{
    $('.flexslider').flexslider({
        animation: "slide",
        controlNav: "thumbnails"
    });
    $('#button1').click(function(){
        // alert($('#combo :selected').text());
    });
    $(".dropdown").hover(
        function () {
            $('.dropdown-menu', this).stop(true, true).slideDown("fast");
            $(this).toggleClass('open');
        },
        function () {
            $('.dropdown-menu', this).stop(true, true).slideUp("fast");
            $(this).toggleClass('open');
        }
    );
   // alert("coming");
    $.ajax({
        url:baseurl+"/srv005",
        method:"GET",
        dataType:'json',
        success: function (data) {
            var jsonResponse=$.parseJSON(JSON.stringify(data));;
            // alert(jsonResponse.at007);
            setradioValue("maritalstatus",jsonResponse.at007);
            setradioValue("familystatus",jsonResponse.at009);
            setradioValue("familytype",jsonResponse.at010);
            setradioValue("familyvalues",jsonResponse.at011);
            setradioValue("anydisability",jsonResponse.at012);
            setSelectValue("height",jsonResponse.at008);
            setTextValue("caste",jsonResponse.at013);
            setTextValue("subcaste",jsonResponse.at014);
            setTextValue("gothram",jsonResponse.at015);
            setradioValue("dosham",jsonResponse.at016);
            setTextValue("aboutme",jsonResponse.at022);
            setTextValue("highereducation",jsonResponse.at017);
            setradioValue("employedIn",jsonResponse.at018);
            setTextValue("occupation",jsonResponse.at019);
            setTextValue("income",jsonResponse.at020);
            setradioValue("incomecurrencytype",jsonResponse.at021);
            setradioValue("bodytype",jsonResponse.at023);
            setSelectValue("weight",jsonResponse.at024);
            setTextValue("educationInDetail",jsonResponse.at025);
            setTextValue("occupationInDetail",jsonResponse.at026);
            setradioValue("eatingHabbit",jsonResponse.at027);
            setradioValue("drinkingHabbit",jsonResponse.at028);
            setradioValue("smokingHabbit",jsonResponse.at029);
            setSelectValue("star",jsonResponse.at030);
            setTextValue("raasi",jsonResponse.at031);
            setTextValue("time",jsonResponse.at032);
            //setSelectValue("hours",jsonResponse.at032);
            //setSelectValue("minutes",jsonResponse.at033);
            //setSelectValue("ampm",jsonResponse.at034);
            setSelectValue("country",jsonResponse.at035);
            setSelectValue("state",jsonResponse.at036);
            setSelectValue("city",jsonResponse.at037);
            setSelectValue("fatherstatus",jsonResponse.at038);
            setSelectValue("motherstatus",jsonResponse.at039);
            setSelectValue("religion",jsonResponse.at048);
            setSelectValue("mothertongue",jsonResponse.at049);
            setSelectValue("noofbrothers",jsonResponse.at040);
            setSelectValue("noofbrothersmarried",jsonResponse.at041);
            setSelectValue("noofsisters",jsonResponse.at042);
            setSelectValue("noofsistersmarried",jsonResponse.at043);
            setradioValue("familylocation",jsonResponse.at044);
            setSelectValue("countrycode",jsonResponse.at045);
            setTextValue("mobilenumber",jsonResponse.at046);
            setTextValue("ancestralorigin",jsonResponse.at047);

            // $( "#height" ).val(jsonResponse.at008);
            //anydisability
            // $("input[name=maritalstatus][value=" + jsonResponse.at007.trim() + "]").attr('checked', 'checked');
            // $("input[name=maritalstatus]").val([jsonResponse.at007]);

            // $.each(data, function (index, element) {
            //     $('body').append($('<div>', {
            //         text: element.name
            //     }));
            // });

            //contentType:"application/json",
        }  // data:JSON.parse()

    });

});
var editcomplete={};
$body = $("body");

function submiteditdetails() {
    //alert("coming");
    //alert(JSON.stringify(editcomplete));
    if(dovalidation())
    {
        alert("coming");
        alert(JSON.stringify(editcomplete));
        $body.addClass("loading");
        $.ajax({
            url: baseurl+ "/srv008",
            method: "POST",
            contentType: 'application/json',
            data: JSON.stringify(editcomplete),
            crossDomain: true,
            success: function (data) {

                $body.removeClass("loading");
                    alert(data);
                    window.location.href = baseurl + "/assets/public_html/index.html";
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
        editcomplete["at007"] = maritalstatus;
    }
    //for marital status
    var anydisability  = getRadioValue("anydisability");
    if (anydisability == null || anydisability == "") {
        showAlert("validation error", "disability  should not empty");
        return false;
    } else {
        editcomplete["at012"] = anydisability;
    }
    //for height
    var height=getDropdownValue("height");
    if(height == null||height == "")
    {
        showAlert("validation error","height shouldn't be empty");
        return false;
    }else {
        editcomplete["at008"]=height;
    }
    // for caste
    var caste=getTextValue("caste");
    if(caste==null||caste=="")
    {
        showAlert("validation error","caste shouldn't be empty");
        return false;
    }else {
        editcomplete["at013"]=caste;
    }
    //for Subcaste
    var subcaste=getTextValue("subcaste");
    if(subcaste==null||subcaste=="")
    {
        showAlert("validation error","sub caste shouldn't be empty");
        return false;
    }else {
        editcomplete["at014"]=subcaste;
    }
    //for gothram
    var gothram=getTextValue("gothram");
    if(gothram==null||gothram=="")
    {
        showAlert("validation error","gothram shouldn't be empty");
        return false;
    }else {
        editcomplete["at015"]=gothram;
    }
    //for dosham
    var dosham=getTextValue("dosham");
    if(dosham==null||dosham=="")
    {
        showAlert("validation error","gothram shouldn't be empty");
        return false;
    }else {
        editcomplete["at016"]=dosham;
    }
    //for higher education
    var highesteducation=getTextValue("highereducation");
    if(highesteducation==null||highesteducation=="")
    {
        showAlert("validation error","highesteducation shouldn't be empty");
        return false;
    }else {
        editcomplete["at017"]=highesteducation;
    }
    //for employed in
    var employedIn=getTextValue("employedIn");
    if(employedIn==null||employedIn=="")
    {
        showAlert("validation error","employed In shouldn't be empty");
        return false;
    }else {
        editcomplete["at018"]=employedIn;
    }
    //for occupation
    var occupation=getTextValue("occupation");
    if(occupation==null||occupation=="")
    {
        showAlert("validation error","occupation shouldn't be empty");
        return false;
    }else {
        editcomplete["at019"]=occupation;
    }

    //for income
    var income=getTextValue("income");
    if(income==null||income=="")
    {
        showAlert("validation error","income shouldn't be empty");
        return false;
    }else {
        editcomplete["at020"]=income;
    }
    //for about me
    var aboutme=getTextValue("aboutme");
    if(aboutme==null||aboutme=="")
    {
        showAlert("validation error","aboutme shouldn't be empty");
        return false;
    }else {
        editcomplete["at022"]=aboutme;
    }

    //for family status
    var familystatus = getRadioValue("familystatus");
    if (familystatus == null || familystatus == "") {
        showAlert("validation error", "Family status should not empty");
        return false;
    } else {
        editcomplete["at009"] = familystatus;
    }

    //for family type
    var familyType = getRadioValue("familytype");
    if (familyType == null || familyType == "") {
        showAlert("validation error", "Family type should not empty");
        return false;
    } else {
        editcomplete["at010"] = familyType;
    }

    var familyValues = getRadioValue("familyvalues");
    if (familyValues == null || familyValues == "") {
        showAlert("validation error", "Family values should not empty");
        return false;
    } else {
        editcomplete["at011"] = familyValues;
    }
    //employed in
    var employedIn = getRadioValue("employedIn");
    if (employedIn == null || employedIn == "") {
        showAlert("validation error", "Employed In should not empty");
        return false;
    } else {
        editcomplete["at018"] = employedIn;
    }
    //for currency type
    var incomecurrencytype = getRadioValue("incomecurrencytype");
    if (incomecurrencytype == null || incomecurrencytype == "") {
        showAlert("validation error", "Income per month/year  should not empty");
        return false;
    } else {
        editcomplete["at021"] = incomecurrencytype;
    }
    var bodytype = getRadioValue("bodytype");
    if (bodytype == null || bodytype == "") {
        showAlert("validation error", "body type  should not empty");
        return false;
    } else {
        editcomplete["at023"] = bodytype;
    }
    //for weight
    var weight=getDropdownValue("weight");
    if(weight==null||weight=="")
    {
        showAlert("Validation Error","Weight should not be empty");
        return false;
    }
    else {
        editcomplete["at024"]=weight;

    }
    var educationInDetail=getTextValue("educationInDetail");
    if(educationInDetail==null||educationInDetail=="")
    {
        showAlert("Validation Error","Education in details should not be empty");
        return false;
    }
    else {
        editcomplete["at025"]=educationInDetail;
    }
    var occupationInDetail=getTextValue("occupationInDetail");
    if(occupationInDetail==null||occupationInDetail=="")
    {
        showAlert("Validation Error","occupation in detail should not be empty");
        return false;
    }
    else
    {
        editcomplete["at026"]=occupationInDetail;
    }
    var eatingHabbit=getRadioValue("eatingHabbit");
    if(eatingHabbit==null||eatingHabbit=="")
    {
        showAlert("Validation Error","eating habbit should not be empty");
        return false;
    }
    else {
        editcomplete["at027"] = eatingHabbit;
    }
    var drinkingHabbit=getRadioValue("drinkingHabbit");
    if(drinkingHabbit==null||drinkingHabbit=="")
    {
        showAlert("Validation error","Drinking Habbit should not be empty");
        return false;
    }
    else {
        editcomplete["at028"]=drinkingHabbit;
    }
    var smokingHabbit=getRadioValue("smokingHabbit");
    if(smokingHabbit==null||smokingHabbit=="")
    {
        showAlert("Validation Error","Smoking Habbit should not be empty");
        return false;
    }
    else {
        editcomplete["at029"]=smokingHabbit;
    }
    var star=getDropdownValue("star");
    if(star==null||star=="")
    {
        showAlert("Validation Error","star should not be empty");
        return false;
    }
    else {
        editcomplete["at030"]=star;
    }
    var raasi=getTextValue("raasi");
    if(raasi==null||raasi=="")
    {
        showAlert("Validation Error","raasi should not be empty");
        return false;
    }
    else {
        editcomplete["at031"]=raasi;
    }
    //
    // var hours=getDropdownValue("hours");
    // if(hours==null||hours=="")
    // {
    //     showAlert("Validation Error","hours should not be empty");
    //     return false;
    // }
    // else {
    //     editcomplete["at032"]=hours;
    // }
    // var minutes=getDropdownValue("minutes");
    // if(minutes==null||minutes=="")
    // {
    //     showAlert("Validation Error","minutes should not be empty");
    //     return false;
    // }
    // else {
    //     editcomplete["at033"]=minutes;
    // }
    // var ampm=getDropdownValue("ampm");
    // if(ampm==null||ampm=="")
    // {
    //     showAlert("Validation Error","ampm should not be empty");
    //     return false;
    // }
    // else {
    //     editcomplete["at034"]=ampm;
    // }
    var timeofbirth=getTextValue("time");
    if(timeofbirth==null||timeofbirth=="")
    {
        showAlert("Validation Error","Time of birth should not be empty");
        return false;
    }
    else
    {
        editcomplete["at032"]=timeofbirth;
    }

    var country=getDropdownValue("country");
    if(country==null||country=="")
    {
        showAlert("Validation Error","country should not be empty");
        return false;
    }
    else {
        editcomplete["at035"]=country;
    }
    var state=getDropdownValue("state");
    if(state==null||state=="")
    {
        showAlert("Validation Error","state should not be empty");
        return false;
    }
    else {
        editcomplete["at036"]=state;
    }
    var city=getDropdownValue("city");
    if(city==null||city=="")
    {
        showAlert("Validation Error","city should not be empty");
        return false;
    }
    else {
        editcomplete["at037"]=city;
    }

    var fatherstatus=getDropdownValue("fatherstatus");
    if(fatherstatus==null||fatherstatus=="")
    {
        showAlert("Validation Error","fatherstatus should not be empty");
        return false;
    }
    else {
        editcomplete["at038"]=fatherstatus;
    }
    var motherstatus=getDropdownValue("motherstatus");
    if(motherstatus==null||motherstatus=="")
    {
        showAlert("Validation Error","motherstatus should not be empty");
        return false;
    }
    else {
        editcomplete["at039"]=motherstatus;
    }
    var noofbrothers=getDropdownValue("noofbrothers");
    if(noofbrothers==null||noofbrothers=="")
    {
        showAlert("Validation Error","noofbrothers should not be empty");
        return false;
    }
    else {
        editcomplete["at040"]=noofbrothers;
    }
    var noofbrothersmarried=getDropdownValue("noofbrothersmarried");
    if(noofbrothersmarried==null||noofbrothersmarried=="")
    {
        showAlert("Validation Error","noofbrothersmarried should not be empty");
        return false;
    }
    else {
        editcomplete["at041"]=noofbrothersmarried;
    }
    var noofsisters=getDropdownValue("noofsisters");
    if(noofsisters==null||noofsisters=="")
    {
        showAlert("Validation Error","noofsisters should not be empty");
        return false;
    }
    else {
        editcomplete["at042"]=noofsisters;
    }
    var noofsistersmarried=getDropdownValue("noofsistersmarried");
    if(noofsistersmarried==null||noofsistersmarried=="")
    {
        showAlert("Validation Error","noofsistersmarried should not be empty");
        return false;
    }
    else {
        editcomplete["at043"]=noofsistersmarried;
    }
    var familylocation = getRadioValue("familylocation");
    if (familylocation == null || familylocation == "") {
        showAlert("validation error", "familylocation  should not empty");
        return false;
    } else {
        editcomplete["at044"] = familylocation;
    }
    var countrycode=getDropdownValue("countrycode");
    if(countrycode==null||countrycode=="")
    {
        showAlert("Validation Error","countrycode should not be empty");
        return false;
    }
    else {
        editcomplete["at045"]=countrycode;
    }
    var mobilenumber=getTextValue("mobilenumber");
    if(mobilenumber==null||mobilenumber=="")
    {
        showAlert("Validation Error","mobilenumber should not be empty");
        return false;
    }
    else {
        editcomplete["at046"]=mobilenumber;
    }
    var ancestralorigin=getTextValue("ancestralorigin");
    if(ancestralorigin==null||ancestralorigin=="")
    {
        showAlert("Validation Error","ancestralorigin should not be empty");
        return false;
    }
    else {
        editcomplete["at047"]=ancestralorigin;
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


