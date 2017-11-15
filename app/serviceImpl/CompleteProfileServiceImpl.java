package serviceImpl;

import DaoImpl.CompleteProfileDaoImpl;
import Entity.CompleteProfileEntity;
import service.CompleteProfileService;

import javax.inject.Inject;

public class CompleteProfileServiceImpl implements CompleteProfileService {
    @Inject
    CompleteProfileDaoImpl completeProfileDao;
    @Override
    public void saveCompleteProfileDetails(CompleteProfileEntity completeProfileEntity) {
        completeProfileDao.saveCompleteProfileDetails(completeProfileEntity);

    }
}
