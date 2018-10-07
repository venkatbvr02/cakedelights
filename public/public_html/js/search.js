
$(document).ready(function () {

var prfid=document.getElementById("profile_id1");
//alert(prfid);

});
function getView1(obj) {
    alert(obj);
    var getviewe={};
    getviewe['atp000']=obj;
    alert(getviewe.atp000);
    var res=JSON.stringify(getviewe);
    alert(res);
    var enc_uri=encodeURIComponent(res);
    alert(enc_uri);
    window.location.href="/assets/public_html/view_profile.html?response="+enc_uri;
}
function getView(obj) {
    var getviewe={};
    var id=obj;
     var pf= document.getElementById(id).innerText;
     // alert(pf);
getviewe['atp000']=pf;
var res=JSON.stringify(getviewe);
//alert(res);
// $.ajax({
//     url:baseurl+"/srv011",
//     method:'POST',
//     contentType:'application/json',
//     data:JSON.stringify(getviewe),
//     crossDomain:true,
//     success:function (data) {
//         alert(data);
//         var response=$.parseJSON(JSON.stringify(data));
        var enc_uri=encodeURIComponent(res);
        window.location.href="/assets/public_html/view_profile.html?response="+enc_uri;
    // }
// });
}
var profileid1={};
function getProfile1() {
    //alert("Coming");
    if (dovalid()) {
        var profid = JSON.stringify(profileid1);
        //alert(profid);
        var enc_uri = encodeURIComponent(profid);
        window.location.href="/assets/public_html/view_profile.html?response="+enc_uri;

    }
}
function dovalid() {
    alert("Coming");
    //alert("Coming");
    var profid=getTextValue("profid1");
    if(profid==""||profid==null)
    {
        //alert("Coming too");
        showAlert("Validation Error","Profile Id Should not be Empty");
        return false;
    }
    else{
        profileid1["atp000"]=profid;
    }
    return true;
}


        var profileid={};
        function getProfile() {
           // alert("Coming");
            if(dovalidate())
            {
                var profid=JSON.stringify(profileid);
                alert(profid);
//         //alert(JSON.stringify(profileid));
// $.ajax({
//     url:baseurl+"/srv011",
//     method:'POST',
//     contentType:'application/json',
//     data:JSON.stringify(profileid),
//     crossDomain:true,
//     success:function (data) {
//        alert(data);
//
//        // viewProfile(data);
//         //window.location.href="/assets/public_html/view_p.html";
//          var response=$.parseJSON(JSON.stringify(data));
         var enc_uri=encodeURIComponent(profid);
        window.location.href="/assets/public_html/view_profile.html?response="+enc_uri;



    // }
// });
    }

}
function viewProfile(data)
{


}
function dovalidate() {
   // alert("Coming");
    var profid=getTextValue("profid");
    if(profid==""||profid==null)
    {
       // alert("Coming too");
        showAlert("Validation Error","Profile Id Should not be Empty");
        return false;
    }
    else{
        profileid["atp000"]=profid;
    }
return true;
}


var search={};
//$('#search_submit').click(function(){
    function searchprofiles() {
        //alert("coming");
        if (dovalidation()) {
          //  alert(JSON.stringify(search));
            $.ajax({

                url: baseurl + "/srv009",
                method: 'POST',
                contentType: 'application/json',
                data: JSON.stringify(search),
                crossDomain: true,
                success: function (data) {
                    //alert(data);
                    if (data=="null"||data==""){
                        //alert(" " + data);
                        alert("you have no Profiles based on your search criteria ");
                        window.location.href="/assets/public_html/search.html";

                    }
                    else {
                        alert("Searched Successfully");


                        var response = $.parseJSON(data);
                        //document.getElementById("profile_img1").src="data:image/jpg;base64,"+data.imge;
                        //alert(im);
                        $.each(response, function (index, value) {
                            // alert(index+ "" +value.atp000);
                            var sig = new Image;
                            //sig.src = 'data:image/jpg;base64,' + $('#profile_img3').val();

                            // $('#profile_img'+(index+1)).src(baseurl+"/assets/public_html/"+value.img_path);
                            $('#profile_img' + (index + 1)).attr('src', baseurl + "/assets/public_html/" + value.img_path);
                            $('#profile_id' + (index + 1)).text(value.atp000);
                            $('#details' + (index + 1)).text(value.at033 + " Yrs ," + value.at008 + ", " + value.at014);

                        });
                    }
                }
            });
        }
    }

function setHeader(xhr) {
    xhr.setRequestHeader('Access-Control-Allow-Origin:*');

}
function dovalidation()
{
    var gender=getRadioValue("sex");
    if(gender==null||gender=="")
    {
        showAlert("Validation Error","Please select Gender");
        return false;
    }
    else
    {
        search["at005"]=gender;
    }
    var maritalstatus=getRadioValue("maritalstatus");
    if(maritalstatus==null||maritalstatus=="")
    {
        showAlert("Validation Error","Marital status can not be empty");
        return false;
    }
    else {
        search["at007"]=maritalstatus;
    }
    var country=getDropdownValue("country");
    if(country==null||country=="")
    {
        showAlert("Validation Error","Country should not be empty");
        return false;
    }
    else {
        search["at035"]=country;
    }
    var state=getDropdownValue("state");
    if(state==null||state=="")
    {
        showAlert("Validation Error","State Should not be Empty");
        return false;
    }
    else {
        search["at036"]=state;
    }
    var city=getDropdownValue("city");
    if(city==null||city=="")
    {
        showAlert("Validation Error","City Should not be empty");
        return false;
    }
    else
    {
        search["at037"]=city;
    }
    var religion=getDropdownValue("religion");
    if(religion==null||religion=="")
    {
        showAlert("Validation Error","Religion should not be empty");
        return false;
    }
    else
    {
        search["at048"]=religion;
    }
    var mothertongue=getDropdownValue("mothertongue");
    if(mothertongue==null||mothertongue=="")
    {
        showAlert("Validation Error","Mother Tongue should not be Empty");
        return false;
    }
    else
    {
        search["at049"]=mothertongue;
    }
    var age=new Array();
    age[0]=$("#age1").val();
    age[1]=$("#age2").val();
    if(age==""||age==null)
    {
        showAlert("Validation Error","age should not be Empty");
        return false;
    }
    else {
        search["at034"]=age;
    }
return true;
}