package Dao;

import Entity.CompleteProfileEntity;

import java.util.List;

public interface MatchesDao {
    List<CompleteProfileEntity> getMatchedProfiles(String profid);
    List<CompleteProfileEntity> getProfilesbypageId(String profid,int id);
}
