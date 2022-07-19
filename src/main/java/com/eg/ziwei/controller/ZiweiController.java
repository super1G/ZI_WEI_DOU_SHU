package com.eg.ziwei.controller;

import com.eg.ziwei.pojo.RO.SampleInformationRO;
import com.eg.ziwei.service.ZeiweiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZiweiController {

    @Autowired
    ZeiweiService zeiweiService;

    @PostMapping("/test")
    public void sampleInformation(@RequestBody SampleInformationRO sampleInformationRO){
        //to service.zeiwei Test
        zeiweiService.CalculateChart(sampleInformationRO);
    }
}
