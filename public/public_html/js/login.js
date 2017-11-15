/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var login={};
//alert("coming here");
function submitlogindetails() {

    if (dovalidation()) {
        // alert("coming here too");
        // alert(JSON.stringify(login));
        $.ajax({
            url: baseurl+ "/login",
            method: "POST",
            contentType: 'application/json',
            data: JSON.stringify(login),
            crossDomain: true,
            success: function (data) {
                alert(data);
                window.location.href=baseurl+"/assets/public_html/index.html";
            }
        });
    }
}
    function setHeader(xhr) {
        xhr.setRequestHeader('Access-Control-Allow-Origin: *');
    }



function dovalidation() {

    //for username
    var username=getTextValue("username");
    if(username==null||username==""||username==undefined)
    {
        showAlert("validation error","username should not be empty");
        // alert("coming to dovalidation");
        // showAlert("Validation Error", "Username should not be empty");
         return false;
    }
    else {
        login["username"]=username;
    }
    //for password
    var password=getTextValue("password");
    if(password==null||password=="")
    {
        showAlert("Validation Error","Password should not be empty");
        return false;
    }
    else
    {
        login["password"]=password;
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

