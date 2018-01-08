package Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("ALL")
@Entity
@Table(name="completeprofiledetails", schema="matrimony")
public class CompleteProfileEntity implements Serializable{
    @Id
    @Column(name="at000", nullable = false)
    public int at000;

//    @GenericGenerator(name = "sequence_profile_id", strategy = "Entity.ProfileIdGenerator")
//    @GeneratedValue(generator = "sequence_profile_id")
    @Column(name = "atp000", nullable = false)
    public String atp000;
    @Column(name="at005")
    public String at005;
    @Column(name = "at007")
    public String at007;
    @Column(name="at008")
    public String at008;
    @Column(name="at009")
    public String at009;
    @Column(name="at010")
    public String at010;
    @Column(name="at011")
    public String at011;
    @Column(name="at012")
    public String at012;
    @Column(name="at013")
    public String at013;
    @Column(name = "at014")
    public String at014;
    @Column(name="at015")
    public String at015;
    @Column(name="at016")
    public String at016;
    @Column(name="at017")
    public String at017;
    @Column(name="at018")
    public String at018;
    @Column(name="at019")
    public String at019;
    @Column(name="at020")
    public int at020;
    @Column(name="at021")
    public String at021;
    @Column(name="at022")
    public String at022;
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
    public String at046;
    @Column(name = "at047",nullable = false)
    public String at047;
    @Column(name = "at048",nullable = false)
    public String at048;
    @Column(name = "at049",nullable = false)
    public String at049;
   @Column(name = "at033",nullable = false)
    public int at033;
   @Column(name = "at050")
   public  int at050;
   @Column(name="img_path")
   public String img_path;
   @Column(name = "clicked_prof_id",nullable = false)
   public String clicked_prof_id;
   @Column(name="clicked_on_me")
   public String clicked_on_me;
    @OneToOne(cascade =CascadeType.ALL)
    @PrimaryKeyJoinColumn
    public RegistrationdetailsEntity registrationdetailsEntity;

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

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

    public String getAt005() {
        return at005;
    }

    public void setAt005(String at005) {
        this.at005 = at005;
    }

    public int getAt033() {
        return at033;
    }

    public void setAt033(int at033) {
        this.at033 = at033;
    }

    public int getAt050() {
        return at050;
    }

    public void setAt050(int at050) {
        this.at050 = at050;
    }

    public String getClicked_prof_id() {
        return clicked_prof_id;
    }

    public String getClicked_on_me() {
        return clicked_on_me;
    }

    public void setClicked_on_me(String clicked_on_me) {
        this.clicked_on_me = clicked_on_me;
    }

    public void setClicked_prof_id(String clicked_prof_id) {
        this.clicked_prof_id = clicked_prof_id;
    }

    //    public String getAt004() {
//        return at004;
//    }
//
//    public void setAt004(String at004) {
//        this.at004 = at004;
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

    public String getAt009() {
        return at009;
    }

    public void setAt009(String at009) {
        this.at009 = at009;
    }

    public String getAt010() {
        return at010;
    }

    public void setAt010(String at010) {
        this.at010 = at010;
    }

    public String getAt011() {
        return at011;
    }

    public void setAt011(String at011) {
        this.at011 = at011;
    }

    public String getAt012() {
        return at012;
    }

    public void setAt012(String at012) {
        this.at012 = at012;
    }

    public String getAt013() {
        return at013;
    }

    public void setAt013(String at013) {
        this.at013 = at013;
    }

    public String getAt014() {
        return at014;
    }

    public void setAt014(String at014) {
        this.at014 = at014;
    }

    public String getAt015() {
        return at015;
    }

    public void setAt015(String at015) {
        this.at015 = at015;
    }

    public String getAt016() {
        return at016;
    }

    public void setAt016(String at016) {
        this.at016 = at016;
    }

    public String getAt017() {
        return at017;
    }

    public void setAt017(String at017) {
        this.at017 = at017;
    }

    public String getAt018() {
        return at018;
    }

    public void setAt018(String at018) {
        this.at018 = at018;
    }

    public String getAt019() {
        return at019;
    }

    public void setAt019(String at019) {
        this.at019 = at019;
    }

    public int getAt020() {
        return at020;
    }

    public void setAt020(int at020) {
        this.at020 = at020;
    }

    public String getAt021() {
        return at021;
    }

    public void setAt021(String at021) {
        this.at021 = at021;
    }

    public String getAt022() {
        return at022;
    }

    public void setAt022(String at022) {
        this.at022 = at022;
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

    public String getAt046() {
        return at046;
    }

    public void setAt046(String at046) {
        this.at046 = at046;
    }

    public String getAt047() {
        return at047;
    }

    public void setAt047(String at047) {
        this.at047 = at047;
    }

    public RegistrationdetailsEntity getRegistrationdetailsEntity() {
        return registrationdetailsEntity;
    }

    public void setRegistrationdetailsEntity(RegistrationdetailsEntity registrationdetailsEntity) {
        this.registrationdetailsEntity = registrationdetailsEntity;
    }

    @Override
    public String toString() {
        return "CompleteProfileEntity{" +
                "at000=" + at000 +
                ", atp000='" + atp000 + '\'' +
                ", at007='" + at007 + '\'' +
                ", at008='" + at008 + '\'' +
                ", at009='" + at009 + '\'' +
                ", at010='" + at010 + '\'' +
                ", at011='" + at011 + '\'' +
                ", at012='" + at012 + '\'' +
                ", at013='" + at013 + '\'' +
                ", at014='" + at014 + '\'' +
                ", at015='" + at015 + '\'' +
                ", at016='" + at016 + '\'' +
                ", at017='" + at017 + '\'' +
                ", at018='" + at018 + '\'' +
                ", at019='" + at019 + '\'' +
                ", at020=" + at020 +
                ", at021='" + at021 + '\'' +
                ", at022='" + at022 + '\'' +
                ", at023='" + at023 + '\'' +
                ", at024='" + at024 + '\'' +
                ", at025='" + at025 + '\'' +
                ", at026='" + at026 + '\'' +
                ", at027='" + at027 + '\'' +
                ", at028='" + at028 + '\'' +
                ", at029='" + at029 + '\'' +
                ", at030='" + at030 + '\'' +
                ", at031='" + at031 + '\'' +
                ", at032='" + at032 + '\'' +
                ", at035='" + at035 + '\'' +
                ", at036='" + at036 + '\'' +
                ", at037='" + at037 + '\'' +
                ", at038='" + at038 + '\'' +
                ", at039='" + at039 + '\'' +
                ", at048='" + at048 + '\'' +
                ", at049='" + at049 + '\'' +
                ", at040='" + at040 + '\'' +
                ", at041='" + at041 + '\'' +
                ", at042='" + at042 + '\'' +
                ", at043='" + at043 + '\'' +
                ", at044='" + at044 + '\'' +
                ", at045='" + at045 + '\'' +
                ", at046=" + at046 +
                ", at047='" + at047 + '\'' +
                ", img_path='" + img_path + '\'' +
                '}';
    }
}
