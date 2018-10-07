package DaoImpl;

import Dao.ProfileSearchDao;
import Entity.CompleteProfileEntity;
import Entity.ViewedProfiles;
import com.srujanika.utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProfileSearchDaoImpl implements ProfileSearchDao {
    @Override
    public CompleteProfileEntity searchProfileById(CompleteProfileEntity completeProfileEntity,String profileId,String profid)throws NullPointerException {

        SessionFactory sessionFactory=HibernateUtils.getInstance().getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
CompleteProfileEntity completeProfileEntity11=new CompleteProfileEntity();
        ViewedProfiles viewedProfiles=new ViewedProfiles();
        Criteria criteria=session.createCriteria(CompleteProfileEntity.class);
        criteria.add(Restrictions.eq("atp000",profileId));
        CompleteProfileEntity completeProfileEntity1=(CompleteProfileEntity)criteria.uniqueResult();
        String clickedonme=completeProfileEntity1.getClicked_on_me();
        if(clickedonme!=null)
        {
         StringJoiner stringJoiner=new StringJoiner(",");
         stringJoiner.add(clickedonme).add(profid);
         String cliksonme=stringJoiner.toString();
            System.out.println(cliksonme+"::::::::::");
         completeProfileEntity1.setClicked_on_me(cliksonme);
         session.saveOrUpdate(completeProfileEntity1);
        }
        else {
            StringJoiner stringJoiner=new StringJoiner(",");
            stringJoiner.add(profid);
            String clicksonme=stringJoiner.toString();
            System.out.println(clicksonme+"::::::::::::::::::");
            completeProfileEntity1.setClicked_on_me(clicksonme);
            session.saveOrUpdate(completeProfileEntity1);

        }

        //Iterator<CompleteProfileEntity> iterator=completeProfileEntity1
//            String retr_prof_id=completeProfileEntity1.getAtp000();
//        System.out.println(retr_prof_id+"::::::::::::::::::::::::");
//        viewedProfiles.setUser_prof_id(profid);
//        viewedProfiles.setClicked_prof_id(profileId);
//        session.save(viewedProfiles);
       // String prof=new String[10];
       // List<String> list=new ArrayList<String>();
           //  =completeProfileEntity.getClicked_prof_id();
        //System.out.println(prof);
        Criteria criteria1=session.createCriteria(CompleteProfileEntity.class);
        criteria1.add(Restrictions.eq("atp000",profid));
        CompleteProfileEntity completeProfileEntity2= (CompleteProfileEntity) criteria1.uniqueResult();
        String  prof=  completeProfileEntity2.getClicked_prof_id();
        if(prof!=null)
        {

            StringJoiner stringJoiner=new StringJoiner(",");
            stringJoiner.add(prof).add(profileId);
            String profiles=stringJoiner.toString();
//            System.out.println();
            //System.out.println(profiles+":::::::::::::::::::   ::::::::::::::::::");
          //completeProfileEntity11.setAtp000(profid);
            completeProfileEntity2.setClicked_prof_id(profiles);
            session.saveOrUpdate(completeProfileEntity2);
        }
        else
        {
            //prof=append(prof,profileId);
            //String[] prof1;
            //List<String> list=new ArrayList<String>();
           // System.out.println(profileId+":::::::::::::::::::::::::::DSDFD"+profid);
            //list.add(profileId);

            //list.add(profid);
            StringJoiner stringJoiner=new StringJoiner(",");
            stringJoiner.add(profileId);
            String profiles=stringJoiner.toString();
            //System.out.println(profiles+"::::::::::profiles:::::::::::");
           // System.out.println(String.valueOf(stringJoiner));
//            System.out.println(prof1);
            //completeProfileEntity1.setAtp000(profid);
            completeProfileEntity2.setClicked_prof_id(profiles);
            session.saveOrUpdate(completeProfileEntity2);
        }

        System.out.println(completeProfileEntity1);
transaction.commit();
session.close();
        return completeProfileEntity1;

    }

    @Override
    public List<CompleteProfileEntity> getProfiles(CompleteProfileEntity completeProfileEntity) {
        List<CompleteProfileEntity> list=new ArrayList<CompleteProfileEntity>();
        SessionFactory sessionFactory=HibernateUtils.getInstance().getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Criteria criteria=session.createCriteria(CompleteProfileEntity.class);
        criteria.add(Restrictions.eq("at050",1));
        criteria.setFirstResult(0);
        criteria.setMaxResults(10);
        List<CompleteProfileEntity> list1=criteria.list();
        Iterator<CompleteProfileEntity> iterator=list1.listIterator();
        while (iterator.hasNext())
        {
            completeProfileEntity=iterator.next();
            System.out.println(completeProfileEntity);
            list.add(completeProfileEntity);

        }
        transaction.commit();
        session.close();

        return list;
    }
    @Override
    public List<CompleteProfileEntity> getViewProfiles(CompleteProfileEntity completeProfileEntity) {
        List<CompleteProfileEntity> list=new ArrayList<CompleteProfileEntity>();
        SessionFactory sessionFactory=HibernateUtils.getInstance().getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Criteria criteria=session.createCriteria(CompleteProfileEntity.class);
        criteria.add(Restrictions.eq("at050",1));
        criteria.setFirstResult(0);
        criteria.setMaxResults(8);
        List<CompleteProfileEntity> list1=criteria.list();
        Iterator<CompleteProfileEntity> iterator=list1.listIterator();
        while (iterator.hasNext())
        {
            completeProfileEntity=iterator.next();
            System.out.println(completeProfileEntity);
            list.add(completeProfileEntity);

        }
transaction.commit();
        session.close();
        return list;
    }
}
