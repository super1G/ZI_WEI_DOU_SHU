package com.eg.ziwei.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * 天干地支服務
 */
@Service
public class LoanTranslationService {
    public String earthlyBranch;
    public String heavenlyStem;

    @PostConstruct
    public void init() {
        earthlyBranch = "甲乙丙丁戊己庚辛壬癸";
        heavenlyStem = "子丑寅卯辰巳午未申酉戌亥";
    }

    public int parseEarthlyBranchIntByYear(int year) {
        return (year - 3) % 10;
    }

    public String parseEarthlyBranchStringByYear(int year) {
        char[] chars = earthlyBranch.toCharArray();
        return String.valueOf(chars[(year - 3) % 10 - 1]);
    }

    public int parseHeavenlyStemIntByYear(int year) {
        return (year - 3) % 12;
    }

    public String parseHeavenlyStemStringByYear(int year) {
        char[] chars = heavenlyStem.toCharArray();
        return String.valueOf(chars[(year - 3) % 12 - 1]);
    }

    public String parseChineseTimeStringByTime(int HH) {
        char[] chars = heavenlyStem.toCharArray();
        return String.valueOf(chars[(HH + 1) / 2]);
    }
}
