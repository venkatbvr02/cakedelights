package serviceImpl;

import Dao.ViewedProfileDao;
import DaoImpl.ViewedProfileDaoImpl;
import Entity.CompleteProfileEntity;
import service.ViewedProfileService;

import javax.inject.Inject;
import java.util.List;

public class ViewedProfileServiceImpl implements ViewedProfileService {
    @Inject
    ViewedProfileDaoImpl viewedProfileDao;
    @Override
    public List<CompleteProfileEntity> getViewedprofiles(String profid) {
        return viewedProfileDao.getViewedProfiles(profid) ;
    }

    @Override
    public List<CompleteProfileEntity> getClickedonmeprofiles(String profid) {
        return viewedProfileDao.getClickedonmeprofiles(profid);
    }
}
