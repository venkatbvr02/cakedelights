$(document).ready(function(){
    var uniqueKey=$.cookie("uniquekey")
    // alert(uniqueKey);
    if(uniqueKey=='' || uniqueKey==null || uniqueKey==='undefined'){
        window.location.href=baseurl+"/assets/public_html/login.html";
    }
});