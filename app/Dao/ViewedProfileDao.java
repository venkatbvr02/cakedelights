package Dao;

import Entity.CompleteProfileEntity;

import java.util.List;

public interface ViewedProfileDao {
   List<CompleteProfileEntity> getViewedProfiles(String profid);
   List<CompleteProfileEntity> getClickedonmeprofiles(String profid);
}
