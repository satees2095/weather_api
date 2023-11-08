package com.example.weathe_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private String date;
    @JsonProperty("dateWithTimezone")
    private String dateWithTimezone;
    private double freshSnow;
    private Integer snowHeight;
    private Weather weather;
    private Prec prec;
    private Integer sunHours;
    private Integer rainHours;
    private SnowLine temperature;
    private Wind wind;
    private SnowLine windchill;
    private SnowLine snowLine;
    private Astronomy astronomy;
}
