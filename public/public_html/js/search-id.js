$(document).ready(function () {
    $.ajax({
        url:baseurl+"/srv018",
        method:"GET",
        dataType:'json',
        success:function (data) {
            alert(data);

        }
    });

});