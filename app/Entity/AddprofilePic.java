package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "saveimagedetails",schema = "matrimony")
public class AddprofilePic implements Serializable{
    @Id
    @Column(name = "at000")
    public int at000;
    @Column(name = "at048")
    public String at048;
    @Column(name = "at049")
    public String at049;

    public int getAt000() {
        return at000;
    }

    public void setAt000(int at000) {
        this.at000 = at000;
    }

    public String getAt048() {
        return at048;
    }

    public void setAt048(String at048) {
        this.at048 = at048;
    }

    public String getAt049() {
        return at049;
    }

    public void setAt049(String at049) {
        this.at049 = at049;
    }
}
