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
$('#nextbutton').change(function(){
//function saveimage() {

    var frm = new FormData($('form').get(0));
    frm.append('imageInput', input.files[0]);
    $.ajax({
        url:baseurl+"/srv006",
        method: 'POST',
       // address: 'E:\\profileimages',
        data: frm,
        contentType: false,
        processData: false,
        cache: false
    });
});

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
    window.location = "completeProfile.html";
});
$('#nextbutton').click(function(){
    window.location="completeProfile.html";
});
