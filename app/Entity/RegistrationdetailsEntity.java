package Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "registrationdetails", schema = "matrimony", catalog = "")
public class RegistrationdetailsEntity {

    @GenericGenerator(name = "sequence_dep_id", strategy = "DaoImpl.")
    @Column(name = "at000")
    private int at000;
    @Id
    @GenericGenerator(name = "sequence_profile_id", strategy = "Entity.ProfileIdGenerator")
    @GeneratedValue(generator = "sequence_profile_id")
    @Column(name = "atp000")
    private String atp000;
    private String at001;
    private String at002;
    private String at003;
    private Date at004;
    private String at005;
    private String at006;

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

    @Basic
    @Column(name = "at003", nullable = true, length = 50)
    public String getAt003() {
        return at003;
    }

    public void setAt003(String at003) {
        this.at003 = at003;
    }

    @Basic
    @Column(name = "at004", nullable = true)
    public Date getAt004() {
        return at004;
    }

    public void setAt004(Date at004) {
        this.at004 = at004;
    }

    @Basic
    @Column(name = "at005", nullable = true, length = 50)
    public String getAt005() {
        return at005;
    }

    public void setAt005(String at005) {
        this.at005 = at005;
    }

    @Basic
    @Column(name = "at006", nullable = true, length = 50)
    public String getAt006() {
        return at006;
    }

    public void setAt006(String at006) {
        this.at006 = at006;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegistrationdetailsEntity that = (RegistrationdetailsEntity) o;

        if (at000 != that.at000) return false;
        if (at001 != null ? !at001.equals(that.at001) : that.at001 != null) return false;
        if (at002 != null ? !at002.equals(that.at002) : that.at002 != null) return false;
        if (at003 != null ? !at003.equals(that.at003) : that.at003 != null) return false;
        if (at004 != null ? !at004.equals(that.at004) : that.at004 != null) return false;
        if (at005 != null ? !at005.equals(that.at005) : that.at005 != null) return false;
        if (at006 != null ? !at006.equals(that.at006) : that.at006 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = at000;
        result = 31 * result + (at001 != null ? at001.hashCode() : 0);
        result = 31 * result + (at002 != null ? at002.hashCode() : 0);
        result = 31 * result + (at003 != null ? at003.hashCode() : 0);
        result = 31 * result + (at004 != null ? at004.hashCode() : 0);
        result = 31 * result + (at005 != null ? at005.hashCode() : 0);
        result = 31 * result + (at006 != null ? at006.hashCode() : 0);
        return result;
    }
}




