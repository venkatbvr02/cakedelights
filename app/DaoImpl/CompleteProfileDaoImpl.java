package DaoImpl;

import Dao.CompleteProfileDao;
import Entity.CompleteProfileEntity;
import com.srujanika.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CompleteProfileDaoImpl implements CompleteProfileDao{
    @Override
    public void saveCompleteProfileDetails(CompleteProfileEntity completeProfileEntity)
    {
        HibernateUtils hibernateUtils=HibernateUtils.getInstance();
        SessionFactory sessionFactory = hibernateUtils.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(completeProfileEntity);
        transaction.commit();
        session.close();

    }
}
