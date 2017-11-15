package DaoImpl;

import Dao.RegisterDao;
import Entity.RegistrationdetailsEntity;
//import com.srujanika.bo.RegisterBo;
//import com.srujanika.dao.RegisterDao;
//import net.sf.ehcache.hibernate.HibernateUtil;
//import com.srujanika.utility.HibernateUtil;
import com.srujanika.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.Date;

@Repository
//@NamedQuery(name="registrationdetails", query = "insert into matrimony.registrationdetails(id,username,password,email,age,sex,subject) values(?,?,?,?,?,?,?)")
public class RegisterDaoImpl implements RegisterDao {


    @Override
    public void saveRegisterationDetails(RegistrationdetailsEntity registrationdetailsEntity) {
        HibernateUtils hibernateUtils=HibernateUtils.getInstance();
        SessionFactory sessionFactory=hibernateUtils.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction tx=session.beginTransaction();


        session.save(registrationdetailsEntity);
        tx.commit();
        session.close();

           }
}
