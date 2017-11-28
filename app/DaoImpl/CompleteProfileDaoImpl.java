package DaoImpl;

import Dao.CompleteProfileDao;
import Entity.CompleteProfileEntity;
import Entity.RegistrationdetailsEntity;
import com.srujanika.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CompleteProfileDaoImpl implements CompleteProfileDao{
    RegistrationdetailsEntity registrationdetailsEntity;
    @Override
    public void saveCompleteProfileDetails(CompleteProfileEntity completeProfileEntity)
    {
        HibernateUtils hibernateUtils=HibernateUtils.getInstance();
        SessionFactory sessionFactory = hibernateUtils.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        //completeProfileEntity.setRegistrationdetailsEntity(registrationdetailsEntity.getAtp000());
      //  completeProfileEntity.setAtp000(completeProfileEntity.getRegistrationdetailsEntity());
        //completeProfileEntity.setAtp000("22");
        session.save(completeProfileEntity);
        transaction.commit();
        session.close();

    }
}
