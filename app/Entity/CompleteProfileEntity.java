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
    @Column(name="id", nullable = false)
    public int id;
    @Column(name = "bodytype",nullable = false)
    public String bodytype;
    @Column(name = "weight",nullable = false)
    public String weight;
    @Column(name = "educationInDetail",nullable = false)
    public String educationInDetail;
    @Column(name = "occupationInDetail",nullable = false)
    public String occupationInDetail;
    @Column(name = "eatingHabbit",nullable = false)
    public String eatingHabbit;
    @Column(name = "drinkingHabbit",nullable = false)
    public String drinkingHabbit;
    @Column(name = "smokingHabbit",nullable = false)
    public String smokingHabbit;
    @Column(name="star",nullable = false)
    public String star;
    @Column(name="raasi",nullable = false)
    public String raasi;
    @Column(name = "hours",nullable = false)
    public String hours;
    @Column(name = "minutes",nullable = false)
    public String minutes;
    @Column(name = "ampm",nullable = false)
    public String ampm;
    @Column(name = "country",nullable = false)
    public String country;
    @Column(name = "state",nullable = false)
    public String state;
    @Column(name = "city",nullable = false)
    public String city;
    @Column(name = "fatherstatus",nullable = false)
    public String fatherstatus;
    @Column(name = "motherstatus",nullable = false)
    public String motherstatus;
    @Column(name = "noofbrothers", nullable = false)
    public String noofbrothers;
    @Column(name = "noofbrothersmarried",nullable = false)
    public String noofbrothersmarried;
    @Column(name = "noofsisters",nullable = false)
    public String noofsisters;
    @Column(name = "noofsistersmarried",nullable = false)
    public String noofsistersmarried;
    @Column(name = "familylocation",nullable = false)
    public String familylocation;
    @Column(name = "countrycode",nullable = false)
    public String countrycode;
    @Column(name = "mobilenumber",nullable = false)
    public long mobilenumber;
    @Column(name = "ancestralorigin",nullable = false)
    public String ancestralorigin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getEducationInDetail() {
        return educationInDetail;
    }

    public void setEducationInDetail(String educationInDetail) {
        this.educationInDetail = educationInDetail;
    }

    public String getOccupationInDetail() {
        return occupationInDetail;
    }

    public void setOccupationInDetail(String occupationInDetail) {
        this.occupationInDetail = occupationInDetail;
    }

    public String getNoofbrothersmarried() {
        return noofbrothersmarried;
    }

    public void setNoofbrothersmarried(String noofbrothersmarried) {
        this.noofbrothersmarried = noofbrothersmarried;
    }

    public String getNoofsistersmarried() {
        return noofsistersmarried;
    }

    public void setNoofsistersmarried(String noofsistersmarried) {
        this.noofsistersmarried = noofsistersmarried;
    }

    public String getEatingHabbit() {
        return eatingHabbit;
    }

    public void setEatingHabbit(String eatingHabbit) {
        this.eatingHabbit = eatingHabbit;
    }

    public String getDrinkingHabbit() {
        return drinkingHabbit;
    }

    public void setDrinkingHabbit(String drinkingHabbit) {
        this.drinkingHabbit = drinkingHabbit;
    }

    public String getSmokingHabbit() {
        return smokingHabbit;
    }

    public void setSmokingHabbit(String smokingHabbit) {
        this.smokingHabbit = smokingHabbit;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getRaasi() {
        return raasi;
    }

    public void setRaasi(String raasi) {
        this.raasi = raasi;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getAmpm() {
        return ampm;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFatherstatus() {
        return fatherstatus;
    }

    public void setFatherstatus(String fatherstatus) {
        this.fatherstatus = fatherstatus;
    }

    public String getMotherstatus() {
        return motherstatus;
    }

    public void setMotherstatus(String motherstatus) {
        this.motherstatus = motherstatus;
    }

    public String getNoofbrothers() {
        return noofbrothers;
    }

    public void setNoofbrothers(String noofbrothers) {
        this.noofbrothers = noofbrothers;
    }

    public String getNoofsisters() {
        return noofsisters;
    }

    public void setNoofsisters(String noofsisters) {
        this.noofsisters = noofsisters;
    }

    public String getFamilylocation() {
        return familylocation;
    }

    public void setFamilylocation(String familylocation) {
        this.familylocation = familylocation;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public long getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(long mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getAncestralorigin() {
        return ancestralorigin;
    }

    public void setAncestralorigin(String ancestralorigin) {
        this.ancestralorigin = ancestralorigin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompleteProfileEntity that = (CompleteProfileEntity) o;

        if (id != that.id) return false;
        if (mobilenumber != that.mobilenumber) return false;
        if (bodytype != null ? !bodytype.equals(that.bodytype) : that.bodytype != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (educationInDetail != null ? !educationInDetail.equals(that.educationInDetail) : that.educationInDetail != null)
            return false;
        if (occupationInDetail != null ? !occupationInDetail.equals(that.occupationInDetail) : that.occupationInDetail != null)
            return false;
        if (eatingHabbit != null ? !eatingHabbit.equals(that.eatingHabbit) : that.eatingHabbit != null) return false;
        if (drinkingHabbit != null ? !drinkingHabbit.equals(that.drinkingHabbit) : that.drinkingHabbit != null)
            return false;
        if (smokingHabbit != null ? !smokingHabbit.equals(that.smokingHabbit) : that.smokingHabbit != null)
            return false;
        if (star != null ? !star.equals(that.star) : that.star != null) return false;
        if (raasi != null ? !raasi.equals(that.raasi) : that.raasi != null) return false;
        if (hours != null ? !hours.equals(that.hours) : that.hours != null) return false;
        if (minutes != null ? !minutes.equals(that.minutes) : that.minutes != null) return false;
        if (ampm != null ? !ampm.equals(that.ampm) : that.ampm != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (fatherstatus != null ? !fatherstatus.equals(that.fatherstatus) : that.fatherstatus != null) return false;
        if (motherstatus != null ? !motherstatus.equals(that.motherstatus) : that.motherstatus != null) return false;
        if (noofbrothers != null ? !noofbrothers.equals(that.noofbrothers) : that.noofbrothers != null) return false;
        if (noofbrothersmarried != null ? !noofbrothersmarried.equals(that.noofbrothersmarried) : that.noofbrothersmarried != null)
            return false;
        if (noofsisters != null ? !noofsisters.equals(that.noofsisters) : that.noofsisters != null) return false;
        if (noofsistersmarried != null ? !noofsistersmarried.equals(that.noofsistersmarried) : that.noofsistersmarried != null)
            return false;
        if (familylocation != null ? !familylocation.equals(that.familylocation) : that.familylocation != null)
            return false;
        if (countrycode != null ? !countrycode.equals(that.countrycode) : that.countrycode != null) return false;
        return ancestralorigin != null ? ancestralorigin.equals(that.ancestralorigin) : that.ancestralorigin == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (bodytype != null ? bodytype.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (educationInDetail != null ? educationInDetail.hashCode() : 0);
        result = 31 * result + (occupationInDetail != null ? occupationInDetail.hashCode() : 0);
        result = 31 * result + (eatingHabbit != null ? eatingHabbit.hashCode() : 0);
        result = 31 * result + (drinkingHabbit != null ? drinkingHabbit.hashCode() : 0);
        result = 31 * result + (smokingHabbit != null ? smokingHabbit.hashCode() : 0);
        result = 31 * result + (star != null ? star.hashCode() : 0);
        result = 31 * result + (raasi != null ? raasi.hashCode() : 0);
        result = 31 * result + (hours != null ? hours.hashCode() : 0);
        result = 31 * result + (minutes != null ? minutes.hashCode() : 0);
        result = 31 * result + (ampm != null ? ampm.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (fatherstatus != null ? fatherstatus.hashCode() : 0);
        result = 31 * result + (motherstatus != null ? motherstatus.hashCode() : 0);
        result = 31 * result + (noofbrothers != null ? noofbrothers.hashCode() : 0);
        result = 31 * result + (noofbrothersmarried != null ? noofbrothersmarried.hashCode() : 0);
        result = 31 * result + (noofsisters != null ? noofsisters.hashCode() : 0);
        result = 31 * result + (noofsistersmarried != null ? noofsistersmarried.hashCode() : 0);
        result = 31 * result + (familylocation != null ? familylocation.hashCode() : 0);
        result = 31 * result + (countrycode != null ? countrycode.hashCode() : 0);
        result = 31 * result + (int) (mobilenumber ^ (mobilenumber >>> 32));
        result = 31 * result + (ancestralorigin != null ? ancestralorigin.hashCode() : 0);
        return result;
    }
}
