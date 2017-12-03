$(document).ready(function () {


    var readURL = function (input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('.profile-pic').attr('src', e.target.result);
            };

            reader.readAsDataURL(input.files[0]);
           
        }
    };
    $('#nextbutton').click(function(){
        alert("coing");
        var file_data = $("#profilePicture").prop("files")[0];
        var fileName = $("#profilePicture").prop("files")[0].name;
        alert("file name is "+fileName);
        var frm = new FormData();
        frm.append('profilePicture', file_data);
        if ( /\.(jpe?g|png)$/i.test(fileName) ) {
            $.ajax({
                url: baseurl + "/srv006",
                method: 'POST',
                data: frm,
                dataType: 'script',
                contentType: false,
                processData: false,
                cache: false

            });
        }
        else {
            showAlert("Error","Must be Extention either .jpg or .jpeg");
        }
    });
//$('#imageinput').change(function(){
function saveimage() {
    alert("coming here :::::::");
    var file_data = $("#profilePicture").prop("files")[0];


    var frm = new FormData();
    frm.append('profilePicture', file_data);
    if ( /\.(jpe?g|png|gif|bmp)$/i.test(fileName) ) {
        $.ajax({
            url: baseurl + "/srv006",
            method: 'POST',
            data: frm,
            dataType: 'script',
            contentType: false,
            processData: false,
            cache: false,
            success:function (data) {
                alert(data);
            }
        });
    }
}

    $(".file-upload").on('change', function () {
        readURL(this);
    });

    $(".upload-button").on('click', function () {
        $(".file-upload").click();
    });
});

$('#illdothislater').click(function () {
    $('#myModal').modal('show');
});
$('#finewithlessrepsponse').click(function () {
    window.location = "index.html";
});

