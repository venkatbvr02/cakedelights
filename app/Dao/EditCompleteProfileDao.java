package Dao;

import Entity.CompleteProfileEntity;
import Entity.EditCompleteProfileEntity;
//import Entity.EditProfileEntity;

public interface EditCompleteProfileDao {
    EditCompleteProfileEntity getcompletedetails(String profid);
    void saveeditdetails(EditCompleteProfileEntity editCompleteProfileEntity,String profid);
}
