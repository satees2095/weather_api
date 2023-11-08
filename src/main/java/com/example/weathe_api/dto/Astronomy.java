package com.example.weathe_api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Astronomy {
    private String dawn;
    private String sunrise;
    private String suntransit;
    private String sunset;
    private String dusk;
    private String moonrise;
    private String moontransit;
    private String moonset;
    private long moonphase;
    private long moonzodiac;
}
