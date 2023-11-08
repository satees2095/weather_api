package com.example.weathe_api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Wind {
    private String unit;
    private String direction;
    private long avg;
    private long min;
    private long max;
    private String text;
    private boolean significationWind;
    private Gusts gusts;
}
