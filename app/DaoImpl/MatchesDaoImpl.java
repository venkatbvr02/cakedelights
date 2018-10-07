package DaoImpl;

import Dao.MatchesDao;
import Entity.CompleteProfileEntity;
import com.srujanika.utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MatchesDaoImpl implements MatchesDao {
    @Override
    public List<CompleteProfileEntity> getMatchedProfiles(String profid) {
        List<CompleteProfileEntity> list=new ArrayList<CompleteProfileEntity>();
        SessionFactory sessionFactory= HibernateUtils.getInstance().getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Criteria criteria=session.createCriteria(CompleteProfileEntity.class);
        criteria.add(Restrictions.eq("atp000",profid));
        CompleteProfileEntity completeProfileEntity= (CompleteProfileEntity) criteria.uniqueResult();
        String marstat=completeProfileEntity.getAt007();
        String height=completeProfileEntity.getAt008();
        String caste=completeProfileEntity.getAt013();
        String subcaste=completeProfileEntity.getAt014();
        String occup=completeProfileEntity.getAt019();
        String country=completeProfileEntity.getAt035();
        String state=completeProfileEntity.getAt036();
        String city=completeProfileEntity.getAt037();
        String religion=completeProfileEntity.getAt048();
        String mothtongue=completeProfileEntity.getAt049();
        String gender=completeProfileEntity.getAt005();
        Criteria criteria1=session.createCriteria(CompleteProfileEntity.class);
        criteria1.add(Restrictions.and(Restrictions.eq("at007",marstat),Restrictions.eq("at035",country),Restrictions.eq("at036",state),
                Restrictions.eq("at037",city),Restrictions.eq("at048",religion),Restrictions.eq("at049",mothtongue),Restrictions.ne("atp000",profid)));
                criteria1.setFirstResult(0);
                criteria1.setMaxResults(5);
        List<CompleteProfileEntity> results=criteria1.list();
        Iterator<CompleteProfileEntity> iterator=results.listIterator();
        while (iterator.hasNext())
        {
            CompleteProfileEntity completeProfileEntity1=iterator.next();
            System.out.println(completeProfileEntity1.toString());
            list.add(completeProfileEntity1);
        }

        return list;
    }

    @Override
    public List<CompleteProfileEntity> getProfilesbypageId(String profid, int id) {
        List<CompleteProfileEntity> list=new ArrayList<CompleteProfileEntity>();
        SessionFactory sessionFactory= HibernateUtils.getInstance().getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Criteria criteria=session.createCriteria(CompleteProfileEntity.class);
        criteria.add(Restrictions.eq("atp000",profid));
        CompleteProfileEntity completeProfileEntity= (CompleteProfileEntity) criteria.uniqueResult();
        String marstat=completeProfileEntity.getAt007();
        String height=completeProfileEntity.getAt008();
        String caste=completeProfileEntity.getAt013();
        String subcaste=completeProfileEntity.getAt014();
        String occup=completeProfileEntity.getAt019();
        String country=completeProfileEntity.getAt035();
        String state=completeProfileEntity.getAt036();
        String city=completeProfileEntity.getAt037();
        String religion=completeProfileEntity.getAt048();
        String mothtongue=completeProfileEntity.getAt049();
        String gender=completeProfileEntity.getAt005();
        int pagecount=id;
        int maxresults=5*id;
        System.out.println(maxresults+":::::::::::::::::::::");
        int maxres=5;
        int firstresult=maxresults-maxres;
        System.out.println(firstresult+":::::::::::::::::::::::::::");

        Criteria criteria1=session.createCriteria(CompleteProfileEntity.class);
        criteria1.add(Restrictions.and(Restrictions.eq("at007",marstat),Restrictions.eq("at035",country),Restrictions.eq("at036",state),
                Restrictions.eq("at037",city),Restrictions.eq("at048",religion),Restrictions.eq("at049",mothtongue),Restrictions.ne("atp000",profid)));
        criteria1.setFirstResult(firstresult);
        criteria1.setMaxResults(maxres);
        List<CompleteProfileEntity> results=criteria1.list();
        Iterator<CompleteProfileEntity> iterator=results.listIterator();
        while (iterator.hasNext())
        {
            CompleteProfileEntity completeProfileEntity1=iterator.next();
            System.out.println(completeProfileEntity1.toString());
            list.add(completeProfileEntity1);
        }
        transaction.commit();
        session.close();
        return list;


    }
}
