package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "viewedprofiles")
@Entity
public class ViewedProfiles {
    @Id
    @Column(name = "sno")
    public int sno;
    @Column(name = "user_prof_id")
    public String user_prof_id;
    @Column(name = "clicked_prof_id")
    public String clicked_prof_id;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getUser_prof_id() {
        return user_prof_id;
    }

    public void setUser_prof_id(String user_prof_id) {
        this.user_prof_id = user_prof_id;
    }

    public String getClicked_prof_id() {
        return clicked_prof_id;
    }

    public void setClicked_prof_id(String clicked_prof_id) {
        this.clicked_prof_id = clicked_prof_id;
    }

    @Override
    public String toString() {
        return "ViewedProfiles{" +
                "user_prof_id='" + user_prof_id + '\'' +
                ", clicked_prof_id='" + clicked_prof_id + '\'' +
                '}';
    }
}
