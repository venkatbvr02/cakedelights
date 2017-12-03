package DaoImpl;

import Dao.LoginDao;
import Entity.LoginActivity;
import Entity.LoginEntity;
import Entity.RegistrationdetailsEntity;
import com.mysql.jdbc.StringUtils;
import com.srujanika.utils.HibernateUtils;
import com.srujanika.utils.PasswordHashing;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import javax.management.Query;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
@Repository
public class LoginDaoImpl implements LoginDao {
    LoginEntity loginEntity=new LoginEntity();
   // private static final String crequuer="select rd.username,rd.password from registrationdetails as rd where rd.username=:username and rd.password=:password";
   @Inject
   RegistrationdetailsEntity registrationdetailsEntity;



    @Override
    @javax.transaction.Transactional
    public String checkLoginDetails(LoginEntity loginEntity) {
        String result="";
//        String uniqueKey=null;
        HibernateUtils hibernateUtils=HibernateUtils.getInstance();
        SessionFactory sessionFactory = hibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

       // String result="";
        try {

            String username = loginEntity.getAt001();
            String password = loginEntity.getAt002();
            String email=loginEntity.getAt003();
            String profileId=loginEntity.getAtp000();
            Transaction tx = session.beginTransaction();
                      
            Criteria cr = session.createCriteria(RegistrationdetailsEntity.class);

            cr.add(Restrictions.or(Restrictions.eq("at001", username),Restrictions.eq("atp000",username)));

            List<RegistrationdetailsEntity> results = cr.list();
            System.out.println(results);
            Iterator<RegistrationdetailsEntity> iterator=results.listIterator();
              while ((iterator.hasNext())) {

                  RegistrationdetailsEntity registrationdetailsEntity1=iterator.next();
                  System.out.println(registrationdetailsEntity1.getAt003());
                  System.out.println(":::::::::::::::::::::::: "+ PasswordHashing.check(password,registrationdetailsEntity1.getAt002()));
                  System.out.println("actual password "+password+" ::::: "+registrationdetailsEntity1.getAt002());
                  System.out.println("email is"+registrationdetailsEntity1.getAt003()+"profile id"+registrationdetailsEntity1.getAtp000());
                 String emname=registrationdetailsEntity1.getAt003();
                 String pfid=registrationdetailsEntity1.getAtp000();
                 if(pfid!=null){
                     Criteria criteria=session.createCriteria(LoginActivity.class);
                     criteria.add(Restrictions.eq("atp000",pfid));
                     LoginActivity loginActivity=(LoginActivity) criteria.uniqueResult();
                     result=loginActivity.getSeckey();

                 }

                  if ((registrationdetailsEntity1.getAt001().equals(username)||registrationdetailsEntity1.getAtp000().equals(username))&&PasswordHashing.check(password,registrationdetailsEntity1.getAt002())) {
//                      result = "Success";
                      System.out.println("Login Success");

                  }

                else
                                    {
                      result="failure";

                  }
              }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally{

            session.close();

        }

        return result;
 }

}
