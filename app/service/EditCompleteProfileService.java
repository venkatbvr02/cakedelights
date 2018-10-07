package service;

import Entity.CompleteProfileEntity;
import Entity.EditCompleteProfileEntity;


public interface EditCompleteProfileService {
    EditCompleteProfileEntity getcompletedetails(String profid);
    void saveeditdetails(EditCompleteProfileEntity editCompleteProfileEntity,String profid);
}
