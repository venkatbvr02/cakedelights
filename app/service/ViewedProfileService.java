package service;

import Entity.CompleteProfileEntity;

import java.util.List;

public interface ViewedProfileService {
    List<CompleteProfileEntity> getViewedprofiles(String profid);
    List<CompleteProfileEntity> getClickedonmeprofiles(String profid);
}
