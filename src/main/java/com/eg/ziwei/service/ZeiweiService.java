package com.eg.ziwei.service;

import com.eg.ziwei.pojo.RO.SampleInformationRO;
import com.xhinliang.lunarcalendar.LunarCalendar;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ZeiweiService {

    public void CalculateChart(SampleInformationRO sampleInformationRO){
        System.out.println(sampleInformationRO);
        //初始化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH");
        try {
            Date date = simpleDateFormat.parse(sampleInformationRO.getBirthday());
            System.out.println(date.getYear()+1900);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        LunarCalendar lunarCalender = LunarCalendar.obtainCalendar(2016, 2, 8);
        System.out.println(lunarCalender.getLunar());
        //轉換取得國曆資訊
        //取得時辰
        //求天干地支

    }
}
