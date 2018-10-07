package service;

import Entity.SearchEntity;
import Entity.SearchEntitys;

import java.io.IOException;
import java.util.List;

public interface SearchService {
    List<SearchEntitys> searchDetails(SearchEntity searchEntity) throws IOException;
    List<SearchEntitys> getfeaturedprofiles(String profid);
}
