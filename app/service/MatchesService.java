package service;

import Entity.CompleteProfileEntity;

import java.util.List;

public interface MatchesService {
    List<CompleteProfileEntity> getMatchedProfiles(String profid);
    List<CompleteProfileEntity> getProfilesbypageId(String profid,int id);
}
