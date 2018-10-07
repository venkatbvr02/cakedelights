package DaotransactionPOJO;

import Entity.RegistrationdetailsEntity;
import com.srujanika.utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import play.mvc.Http;

import javax.servlet.http.HttpServlet;

public class Loginservlet extends HttpServlet
{
    public  void addtocookie()
    {
        HibernateUtils hibernateUtils=HibernateUtils.getInstance();
        SessionFactory sessionFactory=hibernateUtils.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        RegistrationdetailsEntity registrationdetailsEntity;
        Criteria criteria=session.createCriteria(RegistrationdetailsEntity.class);
       // criteria.add(Restrictions.eq())
    }
}
