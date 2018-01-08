package service;

import Entity.CompleteProfileEntity;

import java.util.List;

public interface ProfileSearchService {
    public CompleteProfileEntity searchProfileById(CompleteProfileEntity completeProfileEntity,String profileId,String profid);
    public List<CompleteProfileEntity> getProfiles(CompleteProfileEntity completeProfileEntity);
    public List<CompleteProfileEntity> getViewProfiles(CompleteProfileEntity completeProfileEntity);
}
