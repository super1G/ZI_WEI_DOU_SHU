package com.eg.ziwei.pojo.properNoun;

public enum EarthlyBranch {
    JIA(1, "甲"),
    YI(2, "乙"),
    BING(3, "丙"),
    DING(4, "丁"),
    WU(5, "戊"),
    JI(6, "己"),
    GENG(7, "庚"),
    XIN(8, "辛"),
    REN(9, "壬"),
    GUI(10, "癸");

    int sortNumber;
    String name;

    EarthlyBranch(int i, String name) {
        this.sortNumber = i;
        this.name = name;
    }
}
