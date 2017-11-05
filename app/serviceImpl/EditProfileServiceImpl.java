package serviceImpl;

import DaoImpl.EditProfileDaoImpl;
import Entity.EditProfileEntity;
import org.springframework.stereotype.Service;
import service.EditProfileService;

import javax.inject.Inject;

@Service
public class EditProfileServiceImpl implements EditProfileService{
    @Inject
    EditProfileDaoImpl editProfileDao;

    @Override
    public void editProfileDetails(EditProfileEntity editProfileEntity) {
        editProfileDao.editProfileDetails(editProfileEntity);
    }
}
