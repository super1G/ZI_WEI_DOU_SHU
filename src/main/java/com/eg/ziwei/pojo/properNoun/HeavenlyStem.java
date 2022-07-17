package com.eg.ziwei.pojo.properNoun;

public enum HeavenlyStem {
    ZI(1, "子"),
    CHOU(2, "丑"),
    YIN(3, "寅"),
    MAO(4, "卯"),
    CHEN(5, "辰"),
    SI(6, "巳"),
    WU(7, "午"),
    WEI(8, "未"),
    SHEN(9, "申"),
    YOU(10, "酉"),
    XU(11, "戌"),
    HAI(12, "亥");

    int sortNumber;
    String name;

    HeavenlyStem(int i, String name) {
        this.sortNumber = i;
        this.name = name;
    }
}
