package DaotransactionPOJO;

import Entity.CompleteProfileEntity;
import Entity.EditCompleteProfileEntity;
import com.srujanika.utils.EncyDecyUtility;
//import Entity.EditProfileEntity;

public class EditCompleteProfiledetailsPojo {
    public EditCompleteProfileEntity setAllValues(CompleteProfileEntity completeProfileEntity)
    {
        EditCompleteProfileEntity editCompleteProfileEntity=new EditCompleteProfileEntity();
        editCompleteProfileEntity.setAtp000(completeProfileEntity.getAtp000());
        editCompleteProfileEntity.setAt007(completeProfileEntity.getAt007());
        editCompleteProfileEntity.setAt008(completeProfileEntity.getAt008());
        editCompleteProfileEntity.setAt009(completeProfileEntity.getAt009());
        editCompleteProfileEntity.setAt010(completeProfileEntity.getAt010());
        editCompleteProfileEntity.setAt011(completeProfileEntity.getAt011());
        editCompleteProfileEntity.setAt012(completeProfileEntity.getAt012());
        editCompleteProfileEntity.setAt013(completeProfileEntity.getAt013());
        editCompleteProfileEntity.setAt014(completeProfileEntity.getAt014());
        editCompleteProfileEntity.setAt015(completeProfileEntity.getAt015());
        editCompleteProfileEntity.setAt016(completeProfileEntity.getAt016());
        editCompleteProfileEntity.setAt017(completeProfileEntity.getAt017());
        editCompleteProfileEntity.setAt018(completeProfileEntity.getAt018());
        editCompleteProfileEntity.setAt019(completeProfileEntity.getAt019());
        editCompleteProfileEntity.setAt020(completeProfileEntity.getAt020());
        editCompleteProfileEntity.setAt021(completeProfileEntity.getAt021());
        editCompleteProfileEntity.setAt022(completeProfileEntity.getAt022());
        editCompleteProfileEntity.setAt023(completeProfileEntity.getAt023());
        editCompleteProfileEntity.setAt024(completeProfileEntity.getAt024());
        editCompleteProfileEntity.setAt025(completeProfileEntity.getAt025());
        editCompleteProfileEntity.setAt026(completeProfileEntity.getAt026());
        editCompleteProfileEntity.setAt027(completeProfileEntity.getAt027());
        editCompleteProfileEntity.setAt028(completeProfileEntity.getAt028());
        editCompleteProfileEntity.setAt029(completeProfileEntity.getAt029());
        editCompleteProfileEntity.setAt030(completeProfileEntity.getAt030());
        editCompleteProfileEntity.setAt031(completeProfileEntity.getAt031());
        editCompleteProfileEntity.setAt032(completeProfileEntity.getAt032());
//        editCompleteProfileEntity.setAt033(completeProfileEntity.getAt033());
//        editCompleteProfileEntity.setAt034(completeProfileEntity.getAt034());
        editCompleteProfileEntity.setAt035(completeProfileEntity.getAt035());
        editCompleteProfileEntity.setAt036(completeProfileEntity.getAt036());
        editCompleteProfileEntity.setAt037(completeProfileEntity.getAt037());
        editCompleteProfileEntity.setAt038(completeProfileEntity.getAt038());
        editCompleteProfileEntity.setAt039(completeProfileEntity.getAt039());
        editCompleteProfileEntity.setAt048(completeProfileEntity.getAt048());
        editCompleteProfileEntity.setAt049(completeProfileEntity.getAt049());
        editCompleteProfileEntity.setAt040(completeProfileEntity.getAt040());
        editCompleteProfileEntity.setAt041(completeProfileEntity.getAt041());
        editCompleteProfileEntity.setAt042(completeProfileEntity.getAt042());
        editCompleteProfileEntity.setAt043(completeProfileEntity.getAt043());
        editCompleteProfileEntity.setAt044(completeProfileEntity.getAt044());
        editCompleteProfileEntity.setAt045(completeProfileEntity.getAt045());
        editCompleteProfileEntity.setAt046(EncyDecyUtility.decrypt(completeProfileEntity.getAt046(),"yourmobilenumber"));
        editCompleteProfileEntity.setAt047(completeProfileEntity.getAt047());
     return editCompleteProfileEntity;
    }
}
