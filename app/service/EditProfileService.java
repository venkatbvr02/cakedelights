package service;

import Entity.EditProfileEntity;
import play.mvc.Http;

import java.io.File;

public interface EditProfileService {
    void editProfileDetails(EditProfileEntity editProfileEntity);
    String uploadProFile(Http.MultipartFormData<File> body);
}
