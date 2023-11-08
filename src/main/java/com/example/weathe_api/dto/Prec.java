package com.example.weathe_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Prec {
    private long sum;
    private long sumAsRain;
    private long probability;
    @JsonProperty("class")
    private long precClass;
}
