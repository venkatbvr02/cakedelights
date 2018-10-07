package Dao;

import Entity.CompleteProfileEntity;
import Entity.SearchEntity;
import Entity.SearchEntitys;

import java.io.IOException;
import java.util.List;

public interface SearchDao {
    List<SearchEntitys> searchDetails(SearchEntity searchEntity)throws IOException;
    List<SearchEntitys> getfeaturedprofiles(String profid);
}

