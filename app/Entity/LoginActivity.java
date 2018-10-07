package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "loginactivity", schema = "matrimony")
public class LoginActivity {
    @Id
    @Column(name = "at000")
    public int at000;
    @Column(name = "atp000")
    public String atp000;
    @Column(name = "at060")
    public String sysdate;
    @Column(name = "at061")
    public String seckey;
    @Column(name = "at062")
    public int status;

    public int getAt000() {
        return at000;
    }

    public void setAt000(int at000) {
        this.at000 = at000;
    }

    public String getAtp000() {
        return atp000;
    }

    public void setAtp000(String atp000) {
        this.atp000 = atp000;
    }

    public String getSysdate() {
        return sysdate;
    }

    public void setSysdate(String sysdate) {
        this.sysdate = sysdate;
    }

    public String getSeckey() {
        return seckey;
    }

    public void setSeckey(String seckey) {
        this.seckey = seckey;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
