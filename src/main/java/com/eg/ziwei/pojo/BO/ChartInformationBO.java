package com.eg.ziwei.pojo.BO;

import com.eg.ziwei.pojo.RO.SampleInformationRO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Data
public class ChartInformationBO {
    private String name;
    private int year;
    private int month;
    private int day;
    private String gender;
    private String earthlyBranch;
    private String heavenlyStem;
    private String chineseTime;

    public ChartInformationBO(SampleInformationRO sampleInformationRO) {
        this.name = sampleInformationRO.getName();
        this.year = getBirthdayYear(sampleInformationRO.getBirthday());
        this.month = getBirthdayMonth(sampleInformationRO.getBirthday());
        this.day = getBirthdayDay(sampleInformationRO.getBirthday());
        this.gender = sampleInformationRO.getGender();
    }

    private int getBirthdayYear(String date) {
        return LocalDate.parse(date).getYear();
    }

    private int getBirthdayMonth(String date) {
        return LocalDate.parse(date).getMonthValue();
    }

    private int getBirthdayDay(String date) {
        return LocalDate.parse(date).getDayOfMonth();
    }
}
