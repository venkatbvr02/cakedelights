package serviceImpl;

import DaoImpl.CompleteProfileDaoImpl;
import Entity.CompleteProfileEntity;
import com.srujanika.utils.HibernateUtils;
import org.apache.http.protocol.HTTP;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import play.mvc.Http;
import service.CompleteProfileService;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;
//import DaoImpl.EditProfileDaoImpl;
//import Entity.EditProfileEntity;
import com.srujanika.utils.PropertiesUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import play.mvc.Http;
//import service.EditProfileService;

import javax.inject.Inject;
import javax.persistence.Query;
import java.io.File;
import java.io.IOException;


public class CompleteProfileServiceImpl implements CompleteProfileService {
    @Inject
    CompleteProfileDaoImpl completeProfileDao;
    @Override
    public void saveCompleteProfileDetails(CompleteProfileEntity completeProfileEntity) {
        completeProfileDao.saveCompleteProfileDetails(completeProfileEntity);

    }
    @Override
    public String uploadProFile(Http.MultipartFormData<File> body,String profid) {
        String result="";
        SessionFactory sessionFactory=HibernateUtils.getInstance().getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Http.MultipartFormData.FilePart<File> picture=body.getFile("profilePicture");
        if (picture != null) {
            String fileName = picture.getFilename();
            String contentType = picture.getContentType();
            File file = picture.getFile();
            String extention=getFileExtention(fileName);

            try {
               FileUtils.copyFile(file, new File(PropertiesUtil.getInstance().getProperty("profile_image_path"),profid+extention));
                File file1=new File(PropertiesUtil.getInstance().getProperty("profile_image_path"),profid+extention);
                String path=file1.getPath();
                String path1=path.substring(19);
                System.out.println(path+":::::::::::::::::::::::");
                Criteria criteria=session.createCriteria(CompleteProfileEntity.class);
                criteria.add(Restrictions.eq("atp000",profid));
                CompleteProfileEntity completeProfileEntity1=(CompleteProfileEntity) criteria.uniqueResult();
                int sno=completeProfileEntity1.getAt000();
                System.out.println(sno);

                CompleteProfileEntity completeProfileEntity=(CompleteProfileEntity)session.get(CompleteProfileEntity.class,sno);
                completeProfileEntity.setImg_path(path1);
                session.update(completeProfileEntity);
                transaction.commit();
                session.close();
//                session.createSQLQuery("UPDATE completeprofiledetails set img_path=path WHERE atp000=profid").executeUpdate();
//                Query query = session.createQuery("UPDATE completeprofiledetails SET img_path=:img_path WHERE atp000=:atp000");
//                query.setParameter("img_path", path);
//                query.setParameter("atp000", profid);
//                int res=query.executeUpdate();
                //                String update_qry="update CompleteProfileEntity img_path=path where atp000=profid";


                System.out.println("Coming here:::::::::::::::::::::::::::::::::::::");
//                CompleteProfileEntity completeProfileEntity1=new CompleteProfileEntity();
//                completeProfileEntity1.setAtp000(profid);
//                completeProfileEntity1.setAt005(completeProfileEntity.getAt005());
//                completeProfileEntity1.setAt007(completeProfileEntity.getAt007());
//                completeProfileEntity1.setAt008(completeProfileEntity.getAt008());
//                completeProfileEntity1.setAt009(completeProfileEntity.getAt009());
//                completeProfileEntity1.setAt010(completeProfileEntity.getAt010());
//                completeProfileEntity1.setAt011(completeProfileEntity.getAt011());
//                completeProfileEntity1.setAt012(completeProfileEntity.getAt012());
//                completeProfileEntity1.setAt013(completeProfileEntity.getAt013());
//                completeProfileEntity1.setAt014(completeProfileEntity.getAt014());
//                completeProfileEntity1.setAt015(completeProfileEntity.getAt015());
//                completeProfileEntity1.setAt016(completeProfileEntity.getAt016());
//                completeProfileEntity1.setAt017(completeProfileEntity.getAt017());
//                completeProfileEntity1.setAt018(completeProfileEntity.getAt018());
//                completeProfileEntity1.setAt019(completeProfileEntity.getAt019());
//                completeProfileEntity1.setAt020(completeProfileEntity.getAt020());
//                completeProfileEntity1.setAt021(completeProfileEntity.getAt021());
//                completeProfileEntity1.setAt022(completeProfileEntity.getAt022());
//                completeProfileEntity1.setAt023(completeProfileEntity.getAt023());
//                completeProfileEntity1.setAt024(completeProfileEntity.getAt024());
//                completeProfileEntity1.setAt025(completeProfileEntity.getAt025());
//                completeProfileEntity1.setAt026(completeProfileEntity.getAt026());
//                completeProfileEntity1.setAt027(completeProfileEntity.getAt027());
//                completeProfileEntity1.setAt028(completeProfileEntity.getAt028());
//                completeProfileEntity1.setAt029(completeProfileEntity.getAt029());
//                completeProfileEntity1.setAt030(completeProfileEntity.getAt030());
//                completeProfileEntity1.setAt031(completeProfileEntity.getAt031());
//                completeProfileEntity1.setAt032(completeProfileEntity.getAt032());
//                completeProfileEntity1.setAt033(completeProfileEntity.getAt033());
//               // completeProfileEntity1.setAt034(completeProfileEntity.getAt030());
//                completeProfileEntity1.setAt035(completeProfileEntity.getAt035());
//                completeProfileEntity1.setAt036(completeProfileEntity.getAt036());
//                completeProfileEntity1.setAt037(completeProfileEntity.getAt037());
//                completeProfileEntity1.setAt038(completeProfileEntity.getAt038());
//                completeProfileEntity1.setAt039(completeProfileEntity.getAt039());
//                completeProfileEntity1.setAt040(completeProfileEntity.getAt040());
//                completeProfileEntity1.setAt041(completeProfileEntity.getAt041());
//                completeProfileEntity1.setAt042(completeProfileEntity.getAt042());
//                completeProfileEntity1.setAt043(completeProfileEntity.getAt043());
//                completeProfileEntity1.setAt044(completeProfileEntity.getAt045());
//                completeProfileEntity1.setAt046(completeProfileEntity.getAt046());
//                completeProfileEntity1.setAt047(completeProfileEntity.getAt047());
//                completeProfileEntity1.setAt048(completeProfileEntity.getAt048());
//                completeProfileEntity1.setAt049(completeProfileEntity.getAt049());
//                completeProfileEntity1.setAt050(completeProfileEntity.getAt050());
//                completeProfileEntity.setImg_path(path);
//                session.saveOrUpdate(completeProfileEntity);
                System.out.println("It is after merger::::::::::::::::::::::::::::::::::::::::::");
                //session.saveOrUpdate(completeProfileEntity);

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("file name ::::: "+fileName+"::::: "+contentType);
            result="File uploaded";
            return result;
        } else {
            System.out.println(" ;::: ::: ;:: :::  else block : : :::: ");
                result="Bad Request";
            return result;
        }


    }
    private String getFileExtention(String fileName){
        int extention=fileName.lastIndexOf('.');
        String extentionlist=fileName.substring(extention);
//        System.out.println("exte:::::::::: "+extentionlist);
        return extentionlist;
    }
}
