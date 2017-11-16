package Entity;

import play.libs.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="completeprofiledetails", schema="matrimony")
public class CompleteProfileEntity implements Serializable{
    @Id
    @Column(name="at000", nullable = false)
    public int at000;
    @Column(name = "at023",nullable = false)
    public String at023;
    @Column(name = "at024",nullable = false)
    public String at024;
    @Column(name = "at025",nullable = false)
    public String at025;
    @Column(name = "at026",nullable = false)
    public String at026;
    @Column(name = "at027",nullable = false)
    public String at027;
    @Column(name = "at028",nullable = false)
    public String at028;
    @Column(name = "at029",nullable = false)
    public String at029;
    @Column(name="at030",nullable = false)
    public String at030;
    @Column(name="at031",nullable = false)
    public String at031;
    @Column(name = "at032",nullable = false)
    public String at032;
    @Column(name = "at033",nullable = false)
    public String at033;
    @Column(name = "at034",nullable = false)
    public String at034;
    @Column(name = "at035",nullable = false)
    public String at035;
    @Column(name = "at036",nullable = false)
    public String at036;
    @Column(name = "at037",nullable = false)
    public String at037;
    @Column(name = "at038",nullable = false)
    public String at038;
    @Column(name = "at039",nullable = false)
    public String at039;
    @Column(name = "at040", nullable = false)
    public String at040;
    @Column(name = "at041",nullable = false)
    public String at041;
    @Column(name = "at042",nullable = false)
    public String at042;
    @Column(name = "at043",nullable = false)
    public String at043;
    @Column(name = "at044",nullable = false)
    public String at044;
    @Column(name = "at045",nullable = false)
    public String at045;
    @Column(name = "at046",nullable = false)
    public long at046;
    @Column(name = "at047",nullable = false)
    public String at047;

    public int getAt000() {
        return at000;
    }

    public void setAt000(int at000) {
        this.at000 = at000;
    }

    public String getAt023() {
        return at023;
    }

    public void setAt023(String at023) {
        this.at023 = at023;
    }

    public String getAt024() {
        return at024;
    }

    public void setAt024(String at024) {
        this.at024 = at024;
    }

    public String getAt025() {
        return at025;
    }

    public void setAt025(String at025) {
        this.at025 = at025;
    }

    public String getAt026() {
        return at026;
    }

    public void setAt026(String at026) {
        this.at026 = at026;
    }

    public String getAt027() {
        return at027;
    }

    public void setAt027(String at027) {
        this.at027 = at027;
    }

    public String getAt028() {
        return at028;
    }

    public void setAt028(String at028) {
        this.at028 = at028;
    }

    public String getAt029() {
        return at029;
    }

    public void setAt029(String at029) {
        this.at029 = at029;
    }

    public String getAt030() {
        return at030;
    }

    public void setAt030(String at030) {
        this.at030 = at030;
    }

    public String getAt031() {
        return at031;
    }

    public void setAt031(String at031) {
        this.at031 = at031;
    }

    public String getAt032() {
        return at032;
    }

    public void setAt032(String at032) {
        this.at032 = at032;
    }

    public String getAt033() {
        return at033;
    }

    public void setAt033(String at033) {
        this.at033 = at033;
    }

    public String getAt034() {
        return at034;
    }

    public void setAt034(String at034) {
        this.at034 = at034;
    }

    public String getAt035() {
        return at035;
    }

    public void setAt035(String at035) {
        this.at035 = at035;
    }

    public String getAt036() {
        return at036;
    }

    public void setAt036(String at036) {
        this.at036 = at036;
    }

    public String getAt037() {
        return at037;
    }

    public void setAt037(String at037) {
        this.at037 = at037;
    }

    public String getAt038() {
        return at038;
    }

    public void setAt038(String at038) {
        this.at038 = at038;
    }

    public String getAt039() {
        return at039;
    }

    public void setAt039(String at039) {
        this.at039 = at039;
    }

    public String getAt040() {
        return at040;
    }

    public void setAt040(String at040) {
        this.at040 = at040;
    }

    public String getAt041() {
        return at041;
    }

    public void setAt041(String at041) {
        this.at041 = at041;
    }

    public String getAt042() {
        return at042;
    }

    public void setAt042(String at042) {
        this.at042 = at042;
    }

    public String getAt043() {
        return at043;
    }

    public void setAt043(String at043) {
        this.at043 = at043;
    }

    public String getAt044() {
        return at044;
    }

    public void setAt044(String at044) {
        this.at044 = at044;
    }

    public String getAt045() {
        return at045;
    }

    public void setAt045(String at045) {
        this.at045 = at045;
    }

    public long getAt046() {
        return at046;
    }

    public void setAt046(long at046) {
        this.at046 = at046;
    }

    public String getAt047() {
        return at047;
    }

    public void setAt047(String at047) {
        this.at047 = at047;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompleteProfileEntity that = (CompleteProfileEntity) o;

        if (at000 != that.at000) return false;
        if (at046 != that.at046) return false;
        if (at023 != null ? !at023.equals(that.at023) : that.at023 != null) return false;
        if (at024 != null ? !at024.equals(that.at024) : that.at024 != null) return false;
        if (at025 != null ? !at025.equals(that.at025) : that.at025 != null) return false;
        if (at026 != null ? !at026.equals(that.at026) : that.at026 != null) return false;
        if (at027 != null ? !at027.equals(that.at027) : that.at027 != null) return false;
        if (at028 != null ? !at028.equals(that.at028) : that.at028 != null) return false;
        if (at029 != null ? !at029.equals(that.at029) : that.at029 != null) return false;
        if (at030 != null ? !at030.equals(that.at030) : that.at030 != null) return false;
        if (at031 != null ? !at031.equals(that.at031) : that.at031 != null) return false;
        if (at032 != null ? !at032.equals(that.at032) : that.at032 != null) return false;
        if (at033 != null ? !at033.equals(that.at033) : that.at033 != null) return false;
        if (at034 != null ? !at034.equals(that.at034) : that.at034 != null) return false;
        if (at035 != null ? !at035.equals(that.at035) : that.at035 != null) return false;
        if (at036 != null ? !at036.equals(that.at036) : that.at036 != null) return false;
        if (at037 != null ? !at037.equals(that.at037) : that.at037 != null) return false;
        if (at038 != null ? !at038.equals(that.at038) : that.at038 != null) return false;
        if (at039 != null ? !at039.equals(that.at039) : that.at039 != null) return false;
        if (at040 != null ? !at040.equals(that.at040) : that.at040 != null) return false;
        if (at041 != null ? !at041.equals(that.at041) : that.at041 != null) return false;
        if (at042 != null ? !at042.equals(that.at042) : that.at042 != null) return false;
        if (at043 != null ? !at043.equals(that.at043) : that.at043 != null) return false;
        if (at044 != null ? !at044.equals(that.at044) : that.at044 != null) return false;
        if (at045 != null ? !at045.equals(that.at045) : that.at045 != null) return false;
        return at047 != null ? at047.equals(that.at047) : that.at047 == null;
    }

    @Override
    public int hashCode() {
        int result = at000;
        result = 31 * result + (at023 != null ? at023.hashCode() : 0);
        result = 31 * result + (at024 != null ? at024.hashCode() : 0);
        result = 31 * result + (at025 != null ? at025.hashCode() : 0);
        result = 31 * result + (at026 != null ? at026.hashCode() : 0);
        result = 31 * result + (at027 != null ? at027.hashCode() : 0);
        result = 31 * result + (at028 != null ? at028.hashCode() : 0);
        result = 31 * result + (at029 != null ? at029.hashCode() : 0);
        result = 31 * result + (at030 != null ? at030.hashCode() : 0);
        result = 31 * result + (at031 != null ? at031.hashCode() : 0);
        result = 31 * result + (at032 != null ? at032.hashCode() : 0);
        result = 31 * result + (at033 != null ? at033.hashCode() : 0);
        result = 31 * result + (at034 != null ? at034.hashCode() : 0);
        result = 31 * result + (at035 != null ? at035.hashCode() : 0);
        result = 31 * result + (at036 != null ? at036.hashCode() : 0);
        result = 31 * result + (at037 != null ? at037.hashCode() : 0);
        result = 31 * result + (at038 != null ? at038.hashCode() : 0);
        result = 31 * result + (at039 != null ? at039.hashCode() : 0);
        result = 31 * result + (at040 != null ? at040.hashCode() : 0);
        result = 31 * result + (at041 != null ? at041.hashCode() : 0);
        result = 31 * result + (at042 != null ? at042.hashCode() : 0);
        result = 31 * result + (at043 != null ? at043.hashCode() : 0);
        result = 31 * result + (at044 != null ? at044.hashCode() : 0);
        result = 31 * result + (at045 != null ? at045.hashCode() : 0);
        result = 31 * result + (int) (at046 ^ (at046 >>> 32));
        result = 31 * result + (at047 != null ? at047.hashCode() : 0);
        return result;
    }
}
