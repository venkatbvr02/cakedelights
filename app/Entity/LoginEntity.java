package Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "registrationdetails", schema = "matrimony", catalog = "")
public class LoginEntity {
   // @Column(name="username")
    public String at001;
    //@Column(name = "password")
    public String at002;
    @Column(name = "at003",nullable = false)
    public  String at003;
    @Column(name = "atp000",nullable = false)
    public String atp000;
    @Basic
    @Column(name = "at001", nullable = true, length = 50)
    public String getAt001() {
        return at001;
    }

    public void setAt001(String at001) {
        this.at001 = at001;
    }
    @Basic
    @Column(name = "at002", nullable = true, length = 150)
    public String getAt002() {
        return at002;
    }

    public void setAt002(String at002) {
        this.at002 = at002;
    }

    public String getAt003() {
        return at003;
    }

    public void setAt003(String at003) {
        this.at003 = at003;
    }

    public String getAtp000() {
        return atp000;
    }

    public void setAtp000(String atp000) {
        this.atp000 = atp000;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginEntity that = (LoginEntity) o;

        if (at001 != null ? !at001.equals(that.at001) : that.at001 != null) return false;
        if (at002 != null ? !at002.equals(that.at002) : that.at002 != null) return false;
        if (at003 != null ? !at003.equals(that.at003) : that.at003 != null) return false;
        return atp000 != null ? atp000.equals(that.atp000) : that.atp000 == null;
    }

    @Override
    public int hashCode() {
        int result = at001 != null ? at001.hashCode() : 0;
        result = 31 * result + (at002 != null ? at002.hashCode() : 0);
        result = 31 * result + (at003 != null ? at003.hashCode() : 0);
        result = 31 * result + (atp000 != null ? atp000.hashCode() : 0);
        return result;
    }
}
