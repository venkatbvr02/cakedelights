package DaoImpl;

import Dao.SearchDao;
import Entity.CompleteProfileEntity;
import Entity.RegistrationdetailsEntity;
import Entity.SearchEntity;
import Entity.SearchEntitys;
import com.srujanika.utils.HibernateUtils;
import com.srujanika.utils.PropertiesUtil;
import org.hibernate.*;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import play.mvc.Http;

import javax.activation.MimetypesFileTypeMap;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.inject.Inject;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//@Repository
public class SearchDaoImpl implements SearchDao {
    //    List<RegistrationdetailsEntity> list=null;
    @Inject
    RegistrationdetailsEntity registrationdetailsEntity;
    @Inject
    CompleteProfileEntity completeProfileEntity11;
    @Inject
    CompleteProfileEntity completeProfileEntity1;


    static final File dir = new File(PropertiesUtil.getInstance().getProperty("profile_image_path"));
    static final String[] EXTENSIONS = new String[]{
            "gif", "png", "bmp" ,"jpg","jpeg"
    };// and other formats you need
    static final FilenameFilter IMAGE_FILTER = new FilenameFilter() {

        @Override
        public boolean accept(final File dir, final String name) {
            for (final String ext : EXTENSIONS) {
                if (name.endsWith("." + ext)) {
                    return (true);
                }
            }
            return (false);
        }
    };
    @Override
    public List<SearchEntitys> searchDetails(SearchEntity searchEntity) throws IOException {
        List<CompleteProfileEntity> list1 = null;
        List<SearchEntitys> list2 = new ArrayList<SearchEntitys>();
        String gender = searchEntity.getAt005();
        String maritalstatus = searchEntity.getAt007();
        String country = searchEntity.getAt035();
        String state = searchEntity.getAt036();
        String city = searchEntity.getAt037();
        String religion = searchEntity.getAt048();
        String mothertongue = searchEntity.getAt049();
        int age[] = searchEntity.getAt034();
        int a = age[0];
        int b = age[1];
        String ext[] = {".jpg", ".jpeg"};
        System.out.println(a + "" + b);
        int noofrows=10;
        HibernateUtils hibernateUtils = HibernateUtils.getInstance();
        SessionFactory sessionFactory = hibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
            Criteria criteria=session.createCriteria(CompleteProfileEntity.class);
          //  criteria.createAlias("complete.reg","regst");
            criteria.add(Restrictions.and(Restrictions.eq("at005",gender),Restrictions.eq("at035", country), Restrictions.eq("at036", state), Restrictions.eq("at037", city), Restrictions.eq("at048", religion), Restrictions.eq("at049", mothertongue),Restrictions.and(Restrictions.between("at033", a, b)),Restrictions.eq("at050",1)));
            criteria.setFirstResult(0);
            criteria.setMaxResults(noofrows);
            criteria.addOrder(Order.asc("atp000"));
            List<CompleteProfileEntity> list=criteria.list();
        if (null != list && list.size() > 0) {
            Iterator<CompleteProfileEntity> iterator = list.listIterator();
            while (iterator.hasNext()) {
                completeProfileEntity1 = iterator.next();
                String profileid = completeProfileEntity1.getAtp000();
                String path = dir + "\\" + profileid;
                SearchEntitys searchEntitys = new SearchEntitys();
                searchEntitys.setImg_path(completeProfileEntity1.getImg_path());
                searchEntitys.setAtp000(completeProfileEntity1.getAtp000());
                searchEntitys.setAt014(completeProfileEntity1.getAt014());
                searchEntitys.setAt033(completeProfileEntity1.getAt033());
                searchEntitys.setAt007(completeProfileEntity1.getAt007());
                searchEntitys.setAt008(completeProfileEntity1.getAt008());
                System.out.println(searchEntitys);
                list2.add(searchEntitys);

            }
        }
        else {
            return null;
        }
        session.close();
            return list2;

        }

    @Override
    public List<SearchEntitys> getfeaturedprofiles(String profid) {
        SessionFactory sessionFactory=HibernateUtils.getInstance().getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Criteria criteria=session.createCriteria(CompleteProfileEntity.class);
        criteria.add(Restrictions.eq("atp000",profid));
        CompleteProfileEntity completeProfileEntity=(CompleteProfileEntity) criteria.uniqueResult();
        int  age=completeProfileEntity.getAt033();
        String marstat=completeProfileEntity.getAt007();
        String gender=completeProfileEntity.getAt005();
        int categories=completeProfileEntity.getAt050();
        Criteria criteria1=session.createCriteria(CompleteProfileEntity.class);
        criteria1.add(Restrictions.and(Restrictions.le("at033",age),Restrictions.eq("at007",marstat),Restrictions.ne("at005",gender),Restrictions.eq("at050",categories)));
        List<CompleteProfileEntity> completeProfileEntityList=criteria1.list();
        Iterator<CompleteProfileEntity> iterator=completeProfileEntityList.listIterator();
        List<SearchEntitys> list=new ArrayList<>();
        while (iterator.hasNext())
        {
            CompleteProfileEntity completeProfileEntity2=iterator.next();
            SearchEntitys searchEntitys=new SearchEntitys();
            searchEntitys.setAtp000(completeProfileEntity2.getAtp000());
            searchEntitys.setAt007(completeProfileEntity2.getAt007());
            searchEntitys.setAt033(completeProfileEntity2.getAt033());
            searchEntitys.setAt008(completeProfileEntity2.getAt008());
            searchEntitys.setAt014(completeProfileEntity2.getAt014());
            searchEntitys.setImg_path(completeProfileEntity2.getImg_path());
            list.add(searchEntitys);
        }
        return list;
    }

    public static File getPhotoFileExtension(String profileKey){
        try{
            String[] types = {".jpg",".JPG",".png", ".PNG",".jpeg",".JPEG"};
            for(String t : types)
            {
                String path = dir+"\\" + profileKey + t;
                File f = new File(path);
                if(f.isFile())
                    return f;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
