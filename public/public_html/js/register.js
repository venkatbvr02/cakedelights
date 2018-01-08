var register={};
$body = $("body");
$('#regsister_submit').click(function () {


    if(dovalidation()) {
       // $body.addClass("loading");
       // alert(JSON.stringify(register));
        $.ajax({
            url: baseurl+"/srv001",
            method: "POST",
            contentType: 'application/json',
            data: JSON.stringify(register),
            crossDomain: true,
            success: function (data) {
               // $body.removeClass("loading");
                alert(data);
                if(data=="registration success") {
                    window.location.href = baseurl + "/assets/public_html/complete_profile.html";
                }
            }
        });
    }
});
function setHeader(xhr) {
    xhr.setRequestHeader('Access-Control-Allow-Origin: *');
}
function dovalidation() {
    //for username
var username=getTextValue("username");
if(username==null||username=="")
{
    showAlert("validation error","username should not be empty");
    return false;
}

else {
    register["at001"]=username;
    }
//for password
    var password=getTextValue("password");
if(password==null||password=="")
{
    showAlert("validation error","password should not be empty");
    return false;
}
else
{
    register["at002"]=password;
}

//for email
var email=getTextValue("email");
    var atpos = email.indexOf("@");
    var dotpos = email.lastIndexOf(".");

    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=email.length)
    {
        showAlert("Validation Error","Not a Valid Email address");
        return false;
    }
    else if(email==null||email=="")
    {
        showAlert("validation error","password should not be empty");
        return false;
    }
else
{
    register["at003"]=email;
}
//for date
    var age=getTextValue("age");
if(age==null||age=="")
{
    showAlert("validation error","date should not be empty");
    return false;
}
else {
    register["at004"]=age;
}
//for sex
    var sex=getRadioValue("sex");
if(sex==null||sex=="")
{
    showAlert("Validation Error","sex should not be empty");
    return false;
}
else {
    register["at005"]=sex;
}
var subject=getTextValue("subject");
if(subject==null||subject=="")
{
    showAlert("Validation Error","subject should not null");
    return false;
}
else {
    register["at006"]=subject;
}
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
