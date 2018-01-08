package serviceImpl;

import DaoImpl.SearchDaoImpl;
import Entity.SearchEntity;
import Entity.SearchEntitys;
import org.springframework.stereotype.Service;
import service.SearchService;

import javax.inject.Inject;
import java.io.IOException;
import java.util.List;

//@Service
public class SearchServiceImpl implements SearchService {
   @Inject
    SearchDaoImpl searchDao;
    @Override
    public List<SearchEntitys> searchDetails(SearchEntity searchEntity) throws IOException {
        return searchDao.searchDetails(searchEntity);

    }

    @Override
    public List<SearchEntitys> getfeaturedprofiles(String profid) {
        return searchDao.getfeaturedprofiles(profid);
    }
}
