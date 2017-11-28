function getRadioValue(groupName) {
    var _result;
    try {
        var o_radio_group = document.getElementsByName(groupName);
//        alert("g")
        for (var a = 0; a < o_radio_group.length; a++) {
            if (o_radio_group[a].checked) {
                _result = o_radio_group[a].value;
                break;
            }
        }
    } catch (e) {
    }
    return _result;
}
function getTextValue(textfield) {
    var _result;
    try {
        var _text_field=$("#"+textfield).val();

        if(_text_field.length>0)
        {
            _result=_text_field;

        }
    }
    catch (e)
    {}
    return _result;
}
function getDropdownValue(selectedvalue) {
    var _result;

        var _selected_value= $('#'+selectedvalue).val();

    if(_selected_value.length>0)
    {
        _result=_selected_value;
    }

return _result;
}

function setradioValue(groupName,fieldValue){
    $("input[name="+groupName+"]").val([fieldValue]);
}
function  setSelectValue(groupName,fieldValue) {
    $( "#"+groupName ).val(fieldValue);
}
function  setTextValue(groupName,fieldValue) {
    $( "#"+groupName ).val(fieldValue);
}