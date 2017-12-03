var search={};
//$('#search_submit').click(function(){
    function searchprofiles() {
        alert("coming");
        if (dovalidation()) {
            alert(JSON.stringify(search));
            $.ajax({

                url: baseurl + "/srv009",
                method: 'POST',
                contentType: 'application/json',
                data: JSON.stringify(search),
                crossDomain: true,
                success: function (data) {
                    alert(data);
                    window.location.href = "/assets/public_html/search.html";

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
return true;
}