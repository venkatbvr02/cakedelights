package DaoImpl;

import Dao.RegisterDao;
import Entity.LoginActivity;
import Entity.RegistrationdetailsEntity;
//import com.srujanika.bo.RegisterBo;
//import com.srujanika.dao.RegisterDao;
//import net.sf.ehcache.hibernate.HibernateUtil;
//import com.srujanika.utility.HibernateUtil;
import com.srujanika.utils.EncyDecyUtility;
import com.srujanika.utils.HibernateUtils;
import com.srujanika.utils.PasswordHashing;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.cfg.Configuration;
import org.joda.time.DateTime;
import org.joda.time.Years;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

@Repository
//@NamedQuery(name="registrationdetails", query = "insert into matrimony.registrationdetails(id,username,password,email,age,sex,subject) values(?,?,?,?,?,?,?)")
public class RegisterDaoImpl implements RegisterDao  {

    private static final DateFormat sdf = new SimpleDateFormat("yyyy-M-D");
    @Override
    public String saveRegisterationDetails(RegistrationdetailsEntity registrationdetailsEntity) throws Exception {

        HibernateUtils hibernateUtils=HibernateUtils.getInstance();
        String uniquekey=null;
        SessionFactory sessionFactory=hibernateUtils.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(registrationdetailsEntity);
        String to=EncyDecyUtility.decrypt(registrationdetailsEntity.getAt003(),"emailaddressmask");
        String from="venkat.tech444@gmail.com";
       // String host="192.168.0.104";
        Properties properties=System.getProperties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.debug", "true");
//        properties.put("mail.smtp.host", "smtp.gmail.com");
//        properties.put("mail.smtp.socketFactory.port", "465");
//        properties.put("mail.smtp.socketFactory.class",
//                "javax.net.ssl.SSLSocketFactory");
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.port", "465");
      //  properties.setProperty("mail.smtp.host",host);
        javax.mail.Session session1= javax.mail.Session.getInstance(properties,new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from,"bhadra02");
            }
        });
        try{
            MimeMessage mimeMessage=new MimeMessage(session1);
            mimeMessage.setFrom(new InternetAddress(from));
            mimeMessage.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            mimeMessage.setSubject("Your Profile Id ");
            mimeMessage.setText("Dear " +registrationdetailsEntity.getAt001()+","+"\n"+
                    "This is your Profile Id of SouthMatrimony Registration: " +registrationdetailsEntity.getAtp000()+"\n"+
                    "Thank you for Registering");
            Transport.send(mimeMessage);
            System.out.println("Profile Id Sent successfully");

        }
        catch (MessagingException msg)
        {
            msg.printStackTrace();
        }

try{
    System.out.println(" ::::::::::::::::::::::::::::::::: "+registrationdetailsEntity.getAtp000());
            LoginActivity loginActivity = new LoginActivity();
            loginActivity.setAtp000(registrationdetailsEntity.getAtp000());
            Date date = new Date();
            loginActivity.setSysdate(sdf.format(date));
            uniquekey=EncyDecyUtility.getEncrypetedValue(registrationdetailsEntity.getAtp000(),"yoursecretkeyofp");
        //uniquekey=PasswordHashing.getSaltedHash(registrationdetailsEntity.getAtp000());
            loginActivity.setSeckey(uniquekey);
            loginActivity.setStatus(1);
            session.save(loginActivity);

            tx.commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
      finally {
            session.close();
        }
        return uniquekey;
    }
}
