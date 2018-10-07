package service;

import Entity.CompleteProfileEntity;
import play.mvc.Http;

import java.io.File;

public interface CompleteProfileService {
    void saveCompleteProfileDetails(CompleteProfileEntity completeProfileEntity);
    public String uploadProFile(Http.MultipartFormData<File> body,String profid);
}
