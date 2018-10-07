package Entity;

import java.util.Arrays;

public class SearchEntitys {
    public int at033;
    //public Byte[] image;
    public String atp000;
    public String at007;
    public String at008;
    public String at014;
    public byte[] imge;
    public String img_path;

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    public String getAt014() {
        return at014;
    }

    public void setAt014(String at014) {
        this.at014 = at014;
    }

    public int getAt033() {
        return at033;
    }

    public void setAt033(int at033) {
        this.at033 = at033;
    }

    public String getAtp000() {
        return atp000;
    }

    public void setAtp000(String atp000) {
        this.atp000 = atp000;
    }

    public byte[] getImge() {
        return imge;
    }

    public void setImge(byte[] imge) {
        this.imge = imge;
    }
//    public Byte[] getImage() {
//        return image;
//    }
//
//    public void setImage(Byte[] image) {
//        this.image = image;
//    }

    public String getAt007() {
        return at007;
    }

    public void setAt007(String at007) {
        this.at007 = at007;
    }

    public String getAt008() {
        return at008;
    }

    public void setAt008(String at008) {
        this.at008 = at008;
    }

    @Override
    public String toString() {
        return "SearchEntitys{" +
                "at033=" + at033 +
                ", atp000='" + atp000 + '\'' +
                ", at007='" + at007 + '\'' +
                ", at008='" + at008 + '\'' +
                ", at014='" + at014 + '\'' +
                ", img_path='" + img_path + '\'' +
//                ", imge=" + Arrays.toString(imge) +
                '}';
    }
}
