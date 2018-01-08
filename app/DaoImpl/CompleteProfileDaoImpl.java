package DaoImpl;

import Dao.CompleteProfileDao;
import Entity.CompleteProfileEntity;
import Entity.RegistrationdetailsEntity;
import com.srujanika.utils.HibernateUtils;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.id.IdentityGenerator;

import javax.inject.Inject;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Callable;

public class CompleteProfileDaoImpl implements CompleteProfileDao {
    RegistrationdetailsEntity registrationdetailsEntity;
//    SharedSessionContractImplementor sharedSessionContractImplementor;

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
        try {
            String profid=completeProfileEntity.getAtp000();
            Criteria criteria=session.createCriteria(RegistrationdetailsEntity.class);
            criteria.add(Restrictions.eq("atp000",profid));
            RegistrationdetailsEntity registrationdetailsEntity=(RegistrationdetailsEntity)criteria.uniqueResult();
           // Iterator<RegistrationdetailsEntity> iterator=registrationdetailsEntity.
    Date d = registrationdetailsEntity.getAt004();
    Calendar today = Calendar.getInstance();
    Calendar birthDate = Calendar.getInstance();
    birthDate.setTime(d);
    if (birthDate.after(d)) {
        throw new IllegalArgumentException("You don't Exist in this world");
    }
    int todayYear = today.get(Calendar.YEAR);
    int birthDateYear = birthDate.get(Calendar.YEAR);
    int todayDayOfYear = today.get(Calendar.DAY_OF_YEAR);
    int birthDateDayOfYear = birthDate.get(Calendar.DAY_OF_YEAR);
    int todayMonth = today.get(Calendar.MONTH);
    int birthDateMonth = birthDate.get(Calendar.MONTH);
    int todayDayOfMonth = today.get(Calendar.DAY_OF_MONTH);
    int birthDateDayOfMonth = birthDate.get(Calendar.DAY_OF_MONTH);
  int age = todayYear - birthDateYear;

    // If birth date is greater than todays date (after 2 days adjustment of leap year) then decrement age one year
    if ((birthDateDayOfYear - todayDayOfYear > 3) || (birthDateMonth > todayMonth)) {
        age--;

        // If birth date and todays date are of same month and birth day of month is greater than todays day of month then decrement age
    } else if ((birthDateMonth == todayMonth) && (birthDateDayOfMonth > todayDayOfMonth)) {
        age--;
    }
    System.out.println(age);
                completeProfileEntity.setAt033(age);
                completeProfileEntity.setAt005(registrationdetailsEntity.getAt005());
                completeProfileEntity.setAt050(1);
                session.save(completeProfileEntity);
                transaction.commit();

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



}
