package com.eg.ziwei.pojo.RO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SampleInformationRO {

    @JsonProperty("name")
    private String name;
    @JsonProperty("birthday")
    private String birthday;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("calendar")
    private String calendar;
}
