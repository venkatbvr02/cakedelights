package DaoImpl;

import Dao.SearchDao;
import Entity.CompleteProfileEntity;
import Entity.RegistrationdetailsEntity;
import Entity.SearchEntity;
import com.srujanika.utils.HibernateUtils;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import javax.persistence.Query;
import java.util.List;

public class SearchDaoImpl implements SearchDao {
    List<RegistrationdetailsEntity> list=null;
    @Override
    public void searchDetails(SearchEntity searchEntity) {
        HibernateUtils hibernateUtils=HibernateUtils.getInstance();
        SessionFactory sessionFactory=hibernateUtils.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        String gender=searchEntity.getAt005();
        String maritalstatus=searchEntity.getAt007();
        String country=searchEntity.getAt035();
        String state=searchEntity.getAt036();
        String city=searchEntity.getAt037();
        String religion=searchEntity.getAt048();
        String mothertongue=searchEntity.getAt049();
        Query query=session.createSQLQuery("select r.atp000,r.at004,c.at008 from completeprofiledetails c,registrationdetails r where r.at005=:at005 and c.at007=:at007 and c.at035=:at035 and c.at036=:at036 and c.at037=:at037 and c.at048=:at048 and c.at049=:at049 and r.atp000=c.atp000")
                .setParameter("at005",gender)
                .setParameter("at007",maritalstatus)
                .setParameter("at035",country)
                .setParameter("at036",state)
                .setParameter("at037",city)
                .setParameter("at048",religion)
                .setParameter("at049",mothertongue);
        List<SearchEntity> list=query.getResultList();
        searchEntity=list.get(0);
        System.out.println(searchEntity.getAt004()+":::::::::::::");

//        Criteria criteria=session.createCriteria(RegistrationdetailsEntity.class);
//        criteria.add(Restrictions.eq("at005",gender));
//        list=criteria.list();
//        Criteria criteria1=session.createCriteria(CompleteProfileEntity.class);
//        criteria1.add(Restrictions)
//        String sql_qry="select r.atp000,r.at004,c.at008 from completeprofiledetails c,registrationdetails r where r.at005=gender and c.at007=maritalstatus and c.at035=country and c.at036=state and c.at037=city and c.at048=religion and c.at049=mothertongue and c.atp000=r.atp000";
//        SQLQuery sqlQuery=session.createSQLQuery(sql_qry);
//        sqlQuery.addEntity(SearchEntity.class);
//        List reults=sqlQuery.list();
//        System.out.println(reults.toString());
    }
}
