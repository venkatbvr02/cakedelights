package serviceImpl;

import DaoImpl.SearchDaoImpl;
import Entity.SearchEntity;
import service.SearchService;

public class SearchServiceImpl implements SearchService {
    SearchDaoImpl searchDao;
    @Override
    public void searchDetails(SearchEntity searchEntity) {
        searchDao.searchDetails(searchEntity);

    }
}
