package DaoImpl;

import Dao.EditProfileDao;
import Entity.EditProfileEntity;
import com.srujanika.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class EditProfileDaoImpl implements EditProfileDao {

    @Override
    public void editProfileDetails(EditProfileEntity editProfileEntity) {
HibernateUtils hibernateUtils=HibernateUtils.getInstance();
        SessionFactory sessionFactory = hibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(editProfileEntity);
        tx.commit();;
        session.close();
        //sessionFactory.close();

    }
}
