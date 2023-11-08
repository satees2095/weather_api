package com.example.weathe_api.service;

import com.example.weathe_api.dto.WeatherResponse;
import com.example.weathe_api.utils.ClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class WeatherService {
  private final ClientUtil clientUtil;
  public WeatherResponse getWeatherReport(String city) throws Exception {
    return this.clientUtil.getWetherReportByCity(city);
  }
  public WeatherResponse getHourlyWeatherReport(String city) throws Exception {
    return this.clientUtil.getHourlyWeatherReportOfCity(city);
  }
}
