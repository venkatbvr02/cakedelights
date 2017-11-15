var register={};
$('#regsister_submit').click(function () {


    if(dovalidation()) {
        alert(JSON.stringify(register));
        $.ajax({
            url: baseurl+"/register",
            method: "POST",
            contentType: 'application/json',
            data: JSON.stringify(register),
            crossDomain: true,
            success: function (data) {
                alert(data);
                if(data==":registration sucess") {
                    window.location.href = baseurl + "/assets/public_html/edit_profile.html";
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
    register["username"]=username;
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
    register["password"]=password;
}

//for email
var email=getTextValue("email");
    var atpos = email.indexOf("@");
    var dotpos = email.lastIndexOf(".");
    if(email==null||email=="")
    {
    showAlert("validation error","password should not be empty");
    return false;
    }
    else if (atpos<1 || dotpos<atpos+2 || dotpos+2>=email.length)
    {
        showAlert("Validation Error","Not a Valid Email address");
        return false;
    }
else
{
    register["email"]=email;
}
//for date
    var age=getTextValue("age");
if(age==null||age=="")
{
    showAlert("validation error","date should not be empty");
    return false;
}
else {
    register["age"]=age;
}
//for sex
    var sex=getRadioValue("sex");
if(sex==null||sex=="")
{
    showAlert("Validation Error","sex should not be empty");
    return false;
}
else {
    register["sex"]=sex;
}
var subject=getTextValue("subject");
if(subject==null||subject=="")
{
    showAlert("Validation Error","subject should not null");
    return false;
}
else {
    register["subject"]=subject;
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
function gettextValue(fieldName) {
    var _result;
    try {
        _result = $(fieldName).val();
    } catch (e) {
    }
    return _result;
}
