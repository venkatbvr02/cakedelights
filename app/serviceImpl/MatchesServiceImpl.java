package serviceImpl;

import Dao.MatchesDao;
import DaoImpl.MatchesDaoImpl;
import Entity.CompleteProfileEntity;
import service.MatchesService;

import javax.inject.Inject;
import java.util.List;

public class MatchesServiceImpl implements MatchesService{
    @Inject
    MatchesDaoImpl matchesDao;
    @Override
    public List<CompleteProfileEntity> getMatchedProfiles(String profid) {
        System.out.println(profid);
        return matchesDao.getMatchedProfiles(profid);
    }

    @Override
    public List<CompleteProfileEntity> getProfilesbypageId(String profid, int id) {
        return matchesDao.getProfilesbypageId(profid,id);
    }
}
