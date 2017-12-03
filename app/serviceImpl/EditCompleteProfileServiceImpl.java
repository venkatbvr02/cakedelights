package serviceImpl;

import DaoImpl.EditCompleteProfileDaoImpl;
import Entity.CompleteProfileEntity;
import Entity.EditCompleteProfileEntity;
//import Entity.EditProfileEntity;
import service.EditCompleteProfileService;

import javax.inject.Inject;

public class EditCompleteProfileServiceImpl implements EditCompleteProfileService {

    @Inject
    EditCompleteProfileDaoImpl editCompleteProfileDao;

    @Override
    public EditCompleteProfileEntity getcompletedetails(String profid) {
     return editCompleteProfileDao.getcompletedetails(profid);

    }

    @Override
    public void saveeditdetails(EditCompleteProfileEntity editCompleteProfileEntity,String profid) {
        editCompleteProfileDao.saveeditdetails(editCompleteProfileEntity,profid);
    }
}
