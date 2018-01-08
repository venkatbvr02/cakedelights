$(document).ready(function () {
    $.ajax({
        url:baseurl+"/srv017",
        method:'GET',
        dataType:'json',
        success:function (data) {
            //alert(data);
            if (data==null)
            {
                alert("No User viewed Your Profile");
                window.location.href="/assets/public_html/index.html";
            }
            else {
                var response = $.parseJSON(JSON.stringify(data));
                // alert(response);
                $.each(response, function (index, value) {
                    $('#profile_img' + (index + 1)).attr('src', baseurl + "/assets/public_html/" + value.img_path);

                    $('#profid' + (index + 1)).text(value.atp000);
                    $('#height' + (index + 1)).text(value.at033 + " Yrs ," + value.at008);
                    $('#religion' + (index + 1)).text(value.at048);
                    $('#ocu' + (index + 1)).text(value.at007);
                    // $('#loc'+(index+1)).text(value.at047);
                    $('#edu' + (index + 1)).text(value.at017);

                });
            }
        }
    })
})