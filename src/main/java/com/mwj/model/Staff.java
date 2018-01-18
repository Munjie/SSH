package com.mwj.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Staff {
    private String myinitial;
    private String staffname;
    private String password;
    private String depname;
    private String mail;
    private Date joindate;
    private String telephone;
    private Long gender;
    private Long isadmin;
    private Long deleted;

    @Id
    @Column(name = "MYINITIAL", nullable = false, length = 10)
    public String getMyinitial() {
        return myinitial;
    }

    public void setMyinitial(String myinitial) {
        this.myinitial = myinitial;
    }

    @Basic
    @Column(name = "STAFFNAME", nullable = true, length = 50)
    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = true, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "DEPNAME", nullable = true, length = 50)
    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    @Basic
    @Column(name = "MAIL", nullable = true, length = 50)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "JOINDATE", nullable = true)
    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    @Basic
    @Column(name = "TELEPHONE", nullable = true, length = 20)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "GENDER", nullable = true, precision = 0)
    public Long getGender() {
        return gender;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "ISADMIN", nullable = true, precision = 0)
    public Long getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Long isadmin) {
        this.isadmin = isadmin;
    }

    @Basic
    @Column(name = "DELETED", nullable = true, precision = 0)
    public Long getDeleted() {
        return deleted;
    }

    public void setDeleted(Long deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Staff staff = (Staff) o;

        if (myinitial != null ? !myinitial.equals(staff.myinitial) : staff.myinitial != null) return false;
        if (staffname != null ? !staffname.equals(staff.staffname) : staff.staffname != null) return false;
        if (password != null ? !password.equals(staff.password) : staff.password != null) return false;
        if (depname != null ? !depname.equals(staff.depname) : staff.depname != null) return false;
        if (mail != null ? !mail.equals(staff.mail) : staff.mail != null) return false;
        if (joindate != null ? !joindate.equals(staff.joindate) : staff.joindate != null) return false;
        if (telephone != null ? !telephone.equals(staff.telephone) : staff.telephone != null) return false;
        if (gender != null ? !gender.equals(staff.gender) : staff.gender != null) return false;
        if (isadmin != null ? !isadmin.equals(staff.isadmin) : staff.isadmin != null) return false;
        if (deleted != null ? !deleted.equals(staff.deleted) : staff.deleted != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = myinitial != null ? myinitial.hashCode() : 0;
        result = 31 * result + (staffname != null ? staffname.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (depname != null ? depname.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (joindate != null ? joindate.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (isadmin != null ? isadmin.hashCode() : 0);
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        return result;
    }

    public Staff() {
    }

    public Staff(String myinitial, String staffname, String password, String depname, String mail, Date joindate, String telephone, Long gender, Long isadmin, Long deleted) {
        this.myinitial = myinitial;
        this.staffname = staffname;
        this.password = password;
        this.depname = depname;
        this.mail = mail;
        this.joindate = joindate;
        this.telephone = telephone;
        this.gender = gender;
        this.isadmin = isadmin;
        this.deleted = deleted;
    }
}
