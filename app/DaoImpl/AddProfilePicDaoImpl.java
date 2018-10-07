package DaoImpl;

import Dao.AddProfilePicDao;
import Entity.AddprofilePic;
import com.srujanika.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AddProfilePicDaoImpl implements AddProfilePicDao {

    @Override
    public void saveimagedetails(AddprofilePic addprofilePic) {
        HibernateUtils hibernateUtils=HibernateUtils.getInstance();
        SessionFactory sessionFactory=hibernateUtils.getSessionFactory();
        Session session=sessionFactory.openSession();


    }
}
