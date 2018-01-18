package com.mwj.action;
import com.mwj.model.Staff;
import com.mwj.service.StaffService;
import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class StaffAction {


    private Staff staff;
    private  String hireDate;
    @Resource
    private StaffService staffService;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public StaffService getStaffService() {
        return staffService;
    }

    public void setStaffService(StaffService staffService) {
        this.staffService = staffService;
    }

    public String login(){

        boolean login = staffService.login(staff);
        System.out.println(22);
        if(login){
            return "success";
        }
        else {
            msg = "user Name or Pwd is invalid";
            return "error";
        }

    }

    public  String register(){

      staff.setJoindate(dateUtil(hireDate));

        boolean register = staffService.register(staff);
        if (register)
            return "login";
        else
            return "register";

    }


    public Date dateUtil(String dateString){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = null;
        try {
            parse = sdf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;


    }
}
