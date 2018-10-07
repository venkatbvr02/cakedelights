package serviceImpl;

import Dao.ProfileSearchDao;
import DaoImpl.ProfileSearchDaoImpl;
import Entity.CompleteProfileEntity;
import service.ProfileSearchService;

import javax.inject.Inject;
import java.util.List;

public class ProfileSearchServiceImpl implements ProfileSearchService{
    @Inject
    ProfileSearchDaoImpl profileSearchDao;
    @Override
    public CompleteProfileEntity searchProfileById(CompleteProfileEntity completeProfileEntity, String profileId,String profid) {
        return profileSearchDao.searchProfileById(completeProfileEntity,profileId,profid);
    }

    @Override
    public List<CompleteProfileEntity> getProfiles(CompleteProfileEntity completeProfileEntity) {
        return profileSearchDao.getProfiles(completeProfileEntity);
    }

    @Override
    public List<CompleteProfileEntity> getViewProfiles(CompleteProfileEntity completeProfileEntity) {
        return profileSearchDao.getViewProfiles(completeProfileEntity);
    }
}
