package DaoImpl;

import Dao.CompleteProfileDao;
import Entity.CompleteProfileEntity;
import Entity.RegistrationdetailsEntity;
import com.srujanika.utils.HibernateUtils;
import org.hibernate.*;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.id.IdentityGenerator;

import javax.inject.Inject;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.Callable;

public class CompleteProfileDaoImpl implements CompleteProfileDao,IdentifierGenerator {
    RegistrationdetailsEntity registrationdetailsEntity;
    SharedSessionContractImplementor sharedSessionContractImplementor;

    //    public static void generate(SharedSessionContractImplementor sharedSessionContractImplementor)
//    {
//        Connection connection=sharedSessionContractImplementor.connection();
//
//    }
//    @Override
    public void saveCompleteProfileDetails(CompleteProfileEntity completeProfileEntity) throws HibernateException {
        HibernateUtils hibernateUtils = HibernateUtils.getInstance();
        SessionFactory sessionFactory = hibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        CompleteProfileDaoImpl completeProfileDao=new CompleteProfileDaoImpl();
        //completeProfileDao.generate(sharedSessionContractImplementor,completeProfileDao);
        //Criteria criteria=session.createCriteria(RegistrationdetailsEntity.class);
        //Criteria criteria1=session.createCriteria(CompleteProfileEntity.class);

       //sharedSessionContractImplementor.connection();

        try {

           //statement statement = connection.createStatement();
            //System.out.println("coming here;;;;;;;yes");
            //ResultSet rs = statement.executeQuery("SELECT atp000 FROM registrationdetails  WHERE at000=(SELECT MAX(at000)+1 FROM completeprofiledetails c)");
//            System.out.println("coming here;;;;;;;");
//            if (rs.next()) {
//                System.out.println("coming here");
//                String pid = rs.getString(1);
//                System.out.println(":::::::::::::::::::" + pid);

               // completeProfileEntity.setAtp000("38");

                session.save(completeProfileEntity);
                transaction.commit();
            //}
        }

        catch (NullPointerException ne)
        {
            ne.printStackTrace();
        }
            catch (Exception e)
        {
            e.printStackTrace();
        }

        finally {

            session.close();
        }
    }

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        return null;
    }

//    }

//    @Override
//    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
//        Connection connection = sharedSessionContractImplementor.connection();
//        String pid = "";
//        try {
//
//            Statement statement = connection.createStatement();
//            System.out.println("coming here;;;;;;;yes");
//            ResultSet rs = statement.executeQuery("SELECT atp000 FROM registrationdetails  WHERE at000=(SELECT MAX(at000)+1 FROM completeprofiledetails c)");
//            System.out.println("coming here;;;;;;;");
//            if (rs.next()) {
//                System.out.println("coming here");
//                pid = rs.getString(1);
//                System.out.println(":::::::::::::::::::" + pid);
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return pid;
//    }


}
