package com.mwj.action;

import com.mwj.model.TbBooks;
import com.mwj.model.TbSort;
import com.mwj.service.StaffService;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookAction {

    private TbBooks tbBooks;
    private TbSort tbSort;
    private  String buyTime;
    @Resource
    private StaffService staffService;

    public TbBooks getTbBooks() {
        return tbBooks;
    }

    public void setTbBooks(TbBooks tbBooks) {
        this.tbBooks = tbBooks;
    }

    public TbSort getTbSort() {
        return tbSort;
    }

    public void setTbSort(TbSort tbSort) {
        this.tbSort = tbSort;
    }

    public String getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime;
    }

    public StaffService getStaffService() {
        return staffService;
    }

    public void setStaffService(StaffService staffService) {
        this.staffService = staffService;
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

    public  String addBook(){

           tbBooks.setBuyDate(dateUtil(buyTime));
        boolean b = staffService.addBook(tbBooks);
        if (b)
            return "login";
        else
            return "addbook";

    }
}
