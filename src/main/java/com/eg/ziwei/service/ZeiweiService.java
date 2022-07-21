package com.eg.ziwei.service;

import com.eg.ziwei.pojo.BO.ChartInformationBO;
import com.eg.ziwei.pojo.RO.SampleInformationRO;
import com.xhinliang.lunarcalendar.LunarCalendar;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ZeiweiService {

    @Autowired
    LoanTranslationService loanTranslationService;

    public void CalculateChart(SampleInformationRO sampleInformationRO){
        System.out.println(sampleInformationRO);
        //初始化
        ChartInformationBO chartInformationBO = new ChartInformationBO(sampleInformationRO);
        chartInformationBO.setHeavenlyStem(loanTranslationService.parseHeavenlyStemStringByYear(chartInformationBO.getYear()));
        chartInformationBO.setEarthlyBranch(loanTranslationService.parseEarthlyBranchStringByYear(chartInformationBO.getYear()));
        chartInformationBO.setChineseTime(loanTranslationService.parseChineseTimeStringByTime(sampleInformationRO.getBirthTime()));
        System.out.println(chartInformationBO);

    }
}
