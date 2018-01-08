package DaoImpl;

import Dao.ViewedProfileDao;
import Entity.CompleteProfileEntity;
import Entity.ViewedProfiles;
import com.srujanika.utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ViewedProfileDaoImpl implements ViewedProfileDao{
    @Inject
    CompleteProfileEntity completeProfileEntity1;
    @Override
    public List<CompleteProfileEntity> getViewedProfiles(String profid) {
        List<CompleteProfileEntity> list=new ArrayList<CompleteProfileEntity>();

        SessionFactory sessionFactory= HibernateUtils.getInstance().getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Criteria criteria=session.createCriteria(CompleteProfileEntity.class);
        criteria.add(Restrictions.eq("atp000",profid));
        CompleteProfileEntity completeProfileEntity= (CompleteProfileEntity) criteria.uniqueResult();
        String prof=completeProfileEntity.getClicked_prof_id();
        System.out.println(prof);
        if (prof!=null){
        List<String> list1= null;
           list1=Arrays.asList(prof.split(","));
//        Criteria criteria1=session.createCriteria(CompleteProfileEntity.class);
      // if(!list1.isEmpty()||list1!=null) {
           for (int i = 0; i < list1.size(); i++) {
               Criteria criteria1=session.createCriteria(CompleteProfileEntity.class);
               System.out.println(list1.get(0)+"::::::::::"+list1.get(1)+":::::::::::"+list1.get(2));
               criteria1.add(Restrictions.eq("atp000", list1.get(i)));
               List<CompleteProfileEntity> list2 = criteria1.list();
               Iterator<CompleteProfileEntity> iterator =list2.listIterator();
               CompleteProfileEntity completeProfileEntity21=new CompleteProfileEntity();
               while (iterator.hasNext())
               {
                    //completeProfileEntity2=new CompleteProfileEntity();
                   CompleteProfileEntity  completeProfileEntity2=iterator.next();
                   completeProfileEntity21.setAtp000(completeProfileEntity2.getAtp000());
                   completeProfileEntity21.setImg_path(completeProfileEntity2.getImg_path());
                   completeProfileEntity21.setAt033(completeProfileEntity2.getAt033());
                   completeProfileEntity21.setAt008(completeProfileEntity2.getAt008());
                   completeProfileEntity21.setAt007(completeProfileEntity2.getAt007());
                   completeProfileEntity21.setAt048(completeProfileEntity2.getAt048());
                   completeProfileEntity21.setAt047(completeProfileEntity2.getAt047());
                   completeProfileEntity21.setAt017(completeProfileEntity2.getAt017());
                   System.out.println(completeProfileEntity21);
                   list.add(completeProfileEntity21);
                   session.close();
               }
//               System.out.println(completeProfileEntity21);
//               list.add(completeProfileEntity21);
           }

       }
       else
        {
            session.close();
            return null;
        }
        return list;
    }

    @Override
    public List<CompleteProfileEntity> getClickedonmeprofiles(String profid) throws  NullPointerException{
        SessionFactory sessionFactory=HibernateUtils.getInstance().getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        List<CompleteProfileEntity> list=new ArrayList<CompleteProfileEntity>();

        Criteria criteria=session.createCriteria(CompleteProfileEntity.class);
        criteria.add(Restrictions.eq("atp000",profid));
        CompleteProfileEntity completeProfileEntity= (CompleteProfileEntity) criteria.uniqueResult();
        String prof=completeProfileEntity.getClicked_on_me();
        System.out.println(prof);
        if(prof!=null){
        List<String> list1=new ArrayList<String>();
        list1=Arrays.asList(prof.split(","));
        System.out.println(list1);
//        Criteria criteria1=session.createCriteria(CompleteProfileEntity.class);
        //if(list1!=null||!list1.isEmpty()) {

            for (int i = 0; i < list1.size(); i++) {
                Criteria criteria1=session.createCriteria(CompleteProfileEntity.class);
              //  System.out.println(list1.get(0)+"::::::::::"+list1.get(1)+":::::::::::"+list1.get(2));
                criteria1.add(Restrictions.eq("atp000", list1.get(i)));
                List<CompleteProfileEntity> list2 = criteria1.list();
                Iterator<CompleteProfileEntity> iterator =list2.listIterator();
                CompleteProfileEntity completeProfileEntity21=new CompleteProfileEntity();
                while (iterator.hasNext())
                {
                    //completeProfileEntity2=new CompleteProfileEntity();
                    CompleteProfileEntity  completeProfileEntity2=iterator.next();
                    completeProfileEntity21.setAtp000(completeProfileEntity2.getAtp000());
                    completeProfileEntity21.setImg_path(completeProfileEntity2.getImg_path());
                    completeProfileEntity21.setAt033(completeProfileEntity2.getAt033());
                    completeProfileEntity21.setAt008(completeProfileEntity2.getAt008());
                    completeProfileEntity21.setAt007(completeProfileEntity2.getAt007());
                    completeProfileEntity21.setAt048(completeProfileEntity2.getAt048());
                    completeProfileEntity21.setAt047(completeProfileEntity2.getAt047());
                    completeProfileEntity21.setAt017(completeProfileEntity2.getAt017());
                    System.out.println(completeProfileEntity21);
                    list.add(completeProfileEntity21);
                    session.close();
                }
//               System.out.println(completeProfileEntity21);
//               list.add(completeProfileEntity21);
            }

        }
        else {
            session.close();
            //list.isEmpty();
            return null;
        }
        return list;

        //return null;
    }

}
