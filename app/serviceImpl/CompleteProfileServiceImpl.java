package serviceImpl;

import DaoImpl.CompleteProfileDaoImpl;
import Entity.CompleteProfileEntity;
import org.apache.http.protocol.HTTP;
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
        Http.MultipartFormData.FilePart<File> picture=body.getFile("profilePicture");
        if (picture != null) {
            String fileName = picture.getFilename();
            String contentType = picture.getContentType();
            File file = picture.getFile();
            String extention=getFileExtention(fileName);

            try {
                FileUtils.copyFile(file, new File(PropertiesUtil.getInstance().getProperty("profile_image_path"),profid+extention));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("fiule name ::::: "+fileName+"::::: "+contentType);
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
