package com.mwj.service;
import com.mwj.dao.StaffDao;
import com.mwj.model.Staff;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;



@Service
public class StaffService {

@Resource
    private StaffDao staffDao;

    public boolean login(Staff staff){

        return  staffDao.login(staff);

    }
    @Transactional
    public boolean register(Staff staff) {
       return staffDao.register(staff);

    }
}
