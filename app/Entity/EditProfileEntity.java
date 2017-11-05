package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "editprofiledetails", schema = "matrimony", catalog = "")
public class EditProfileEntity {
    @Id
   @Column(name = "maritalstatus")
    public String maritalStatus;
   @Column(name="height")
    public double height;
   @Column(name="familyStatus")
    public String familyStatus;
    @Column(name="familyType")
    public String familyType;
    @Column(name="familyValues")
    public String familyValues;
    @Column(name="anyDisability")
    public String anyDisability;
    @Column(name="caste")
    public String caste;
    @Column(name = "subCaste")
    public String subCaste;
    @Column(name="gothram")
    public String gothram;
    @Column(name="dosham")
    public String dosham;
    @Column(name="higherEducation")
    public String higherEducation;
    @Column(name="employedIn")
    public String employedIn;
    @Column(name="occupation")
    public String occupation;
    @Column(name="income")
    public int income;
    @Column(name="aboutMe")
    public String aboutMe;

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    public String getFamilyType() {
        return familyType;
    }

    public void setFamilyType(String familyType) {
        this.familyType = familyType;
    }

    public String getFamilyValues() {
        return familyValues;
    }

    public void setFamilyValues(String familyValues) {
        this.familyValues = familyValues;
    }

    public String getAnyDisability() {
        return anyDisability;
    }

    public void setAnyDisability(String anyDisability) {
        this.anyDisability = anyDisability;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getSubCaste() {
        return subCaste;
    }

    public void setSubCaste(String subCaste) {
        this.subCaste = subCaste;
    }

    public String getGothram() {
        return gothram;
    }

    public void setGothram(String gothram) {
        this.gothram = gothram;
    }

    public String getDosham() {
        return dosham;
    }

    public void setDosham(String dosham) {
        this.dosham = dosham;
    }

    public String getHigherEducation() {
        return higherEducation;
    }

    public void setHigherEducation(String higherEducation) {
        this.higherEducation = higherEducation;
    }

    public String getEmployedIn() {
        return employedIn;
    }

    public void setEmployedIn(String employedIn) {
        this.employedIn = employedIn;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }
}
