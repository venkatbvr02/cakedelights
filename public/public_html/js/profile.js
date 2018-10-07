$(document).ready(function () {
    alert("Coming to srv016");
   $.ajax({
      url:baseurl+"/srv016",
      method:'GET',
      dataType:'json',
      success:function (data) {
          //alert(data);
    if(data==null)
    {
        alert("you didnt viewed any profile recently.");
        window.location.href="/assets/public_html/index.html";
    }
          var response=$.parseJSON(JSON.stringify(data));
          // alert(response);
          $.each(response,function (index,value) {
              $('#profile_img'+(index+1)).attr('src',baseurl+"/assets/public_html/"+value.img_path);

              $('#profile_id'+(index+1)).text(value.atp000);
              $('#age'+(index+1)).text(value.at033+" Yrs ,"+ value.at008+", "+value.at014);
              $('#religion'+(index+1)).text(value.at048);
              $('#marstat'+(index+1)).text(value.at007);
              $('#loc'+(index+1)).text(value.at047);
              $('#edu'+(index+1)).text(value.at017);

          });

      }
   });
});