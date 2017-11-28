/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var login={};
$body = $("body");
//alert("coming here");
function submitlogindetails() {

    if (dovalidation()) {
        // alert("coming here too");
        // alert(JSON.stringify(login));
        $body.addClass("loading");
        $.ajax({
            url: baseurl+ "/srv002",
            method: "POST",
            contentType: 'application/json',
            header:'sessionid=101',
            data: JSON.stringify(login),
            crossDomain: true,
            success: function (data) {

                $body.removeClass("loading");
                if(data==""||data==undefined||data=="failure")
                {
                    alert("login failed");
                    window.location.href=baseurl+"/assets/public_html/login.html";

                }
                else {
                    alert(data);
                    window.location.href = baseurl + "/assets/public_html/index.html";
                }
            }
        });
    }
}
    function setHeader(xhr,sessionId) {
        xhr.setRequestHeader('Access-Control-Allow-Origin: *');
        sessionId=101;
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
        login["at001"]=username;
    }

  //  for password
    var password=getTextValue("password");
    if(password==null||password=="")
    {
        showAlert("Validation Error","Password should not be empty");
        return false;
    }
    else
    {
        login["at002"]=password;
    }
    return true;
}



