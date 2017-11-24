package serviceImpl;

import DaoImpl.EditProfileDaoImpl;
import Entity.EditProfileEntity;
import com.srujanika.utils.PropertiesUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import play.mvc.Http;
import service.EditProfileService;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;

@Service
public class EditProfileServiceImpl implements EditProfileService{
    @Inject
    EditProfileDaoImpl editProfileDao;

    @Override
    public void editProfileDetails(EditProfileEntity editProfileEntity) {
        editProfileDao.editProfileDetails(editProfileEntity);
    }

    @Override
    public String uploadProFile(Http.MultipartFormData<File> body) {
        Http.MultipartFormData.FilePart<File> picture=body.getFile("profilePicture");
        if (picture != null) {
            String fileName = picture.getFilename();
            String contentType = picture.getContentType();
            File file = picture.getFile();
            String extention=getFileExtention(fileName);

            try {
                FileUtils.copyFile(file, new File(PropertiesUtil.getInstance().getProperty("profile_image_path"),"T-1235689"+extention));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("fiule name ::::: "+fileName+"::::: "+contentType);
            return "File uploaded";
        } else {
            System.out.println(" ;::: ::: ;:: :::  else block : : :::: ");

            return "Bad Request";
        }


    }
    private String getFileExtention(String fileName){
        int extention=fileName.lastIndexOf('.');
        String extentionlist=fileName.substring(extention);
//        System.out.println("exte:::::::::: "+extentionlist);
        return extentionlist;
    }
}
