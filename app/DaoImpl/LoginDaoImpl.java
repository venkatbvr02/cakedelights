package DaoImpl;

import Dao.LoginDao;
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
import java.util.Iterator;
import java.util.List;
@Repository
public class LoginDaoImpl implements LoginDao {
    LoginEntity loginEntity=new LoginEntity();
   // private static final String crequuer="select rd.username,rd.password from registrationdetails as rd where rd.username=:username and rd.password=:password";
    @Override
    @javax.transaction.Transactional
    public String checkLoginDetails(LoginEntity loginEntity) {
        String result="";
        //RegistrationdetailsEntity registrationdetailsEntity;
        HibernateUtils hibernateUtils=HibernateUtils.getInstance();
        SessionFactory sessionFactory = hibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

       // String result="";
        try {

            String username = loginEntity.getUsername();
            String password = loginEntity.getPassword();
            //final String LoginCheck="Select username,password from registrationdetails where username=username and password=password";
                      Transaction tx = session.beginTransaction();
                      
            Criteria cr = session.createCriteria(RegistrationdetailsEntity.class);

            cr.add(Restrictions.eq("username", username));
            List<RegistrationdetailsEntity> results = cr.list();
            Iterator<RegistrationdetailsEntity> iterator=results.listIterator();
              while ((iterator.hasNext())) {
                  //System.out.println(results.get(1)+""+results.get(2));
                                           RegistrationdetailsEntity registrationdetailsEntity1=iterator.next();
                  System.out.println(":::::::::::::::::::::::: "+ PasswordHashing.check(password,registrationdetailsEntity1.getPassword()));
                  System.out.println("actual password "+password+" ::::: "+registrationdetailsEntity1.getPassword());

                  if (registrationdetailsEntity1.getUsername().equals(username)&&PasswordHashing.check(password,registrationdetailsEntity1.getPassword())) {
                      result = "Success";
                      System.out.println("Login Success");
                      //return result;
                  }

                else
                                    {
                      result="failure";
                      //return  result;
                  }
              }
            //System.out.println("geeting result as form of list :::::::::::: "+results.toString());

            //if(username==results.get(0)&& password==results.get(1)){
//            if(registrationdetailsEntity.getUsername()==results.get(0).getUsername()&&registrationdetailsEntity.getPassword()==results.get(1))

              //  result= "Present";
           // }
           // else{
             //   result= "not present";
            // }

           // String crequuer="select rd.username,rd.password from registrationdetails as rd where rd.username=:username and rd.password=:password";
            //List res= session.createQuery("from RegistrationdetailsEntity where username=:username and password=:password" ).setParameter("username", loginEntity.getUsername()).setParameter("password", loginEntity.getPassword()).list();
              //  if(username.
//            session.flush();
//        
          

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally{
//            session.flush();
            session.close();
            //sessionFactory.close();
            //sessionFactory.close();

        }
  //return result;       //return result;
        return result;
 }

}
