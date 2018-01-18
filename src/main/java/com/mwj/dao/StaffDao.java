package com.mwj.dao;


import com.mwj.model.Staff;
import com.mwj.model.TbBooks;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;

@Repository
public class StaffDao extends HibernateDaoSupport {


    @Resource
    public void setSessionFactory2(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }


    public boolean login(Staff staff) {
        Long count = (Long) getHibernateTemplate().find("select count(*) from  Staff where myinitial=? and password=?", staff.getMyinitial(), staff.getPassword()).get(0);
        return count>0;
    }

    public boolean register(Staff staff) {
        Serializable save = getHibernateTemplate().save(staff);
        System.out.println(save);
        return save !=null;
    }


    public  boolean addBook(TbBooks tbBooks){

        Serializable save = getHibernateTemplate().save(tbBooks);
        return  save != null;


    }


}
