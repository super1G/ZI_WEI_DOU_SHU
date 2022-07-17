package com.eg.ziwei.controller;

import com.eg.ziwei.pojo.DTO.SampleInformationDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZiweiController {

    @PostMapping("/")
    public void sampleInformation(SampleInformationDTO sampleInformationDTO){
        //to service.zeiwei
    }
}
