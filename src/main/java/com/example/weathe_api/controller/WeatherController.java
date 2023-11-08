package com.example.weathe_api.controller;

import com.example.weathe_api.dto.WeatherResponse;
import com.example.weathe_api.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class WeatherController {
  private final WeatherService weatherService;
  String clientId = "Pass";

  String clientSecret = "Secret";

  @GetMapping(value = "api/v1/get-report-by-location")
  public WeatherResponse getWeatherReportByLocation(@RequestHeader("Client-ID") String requestClientId,
                                                    @RequestHeader("Client-Secret") String requestClientSecret, @RequestParam String city) throws Exception {
    if (isValidClient(requestClientId, requestClientSecret)) {
      return this.weatherService.getWeatherReport(city);
    } else {
      throw new RuntimeException("Invalid client credentials");
    }
  }
  @GetMapping(value = "api/v1/get-hourly-report-by-location")
  public WeatherResponse getHourlyWeatherReportByLocation(@RequestHeader("Client-ID") String requestClientId,
                                                          @RequestHeader("Client-Secret") String requestClientSecret, @RequestParam String city) throws Exception {
    if (isValidClient(requestClientId, requestClientSecret)) {
      return this.weatherService.getHourlyWeatherReport(city);
    } else {
      throw new RuntimeException("Invalid client credentials");
    }
  }
  private boolean isValidClient(String requestClientId, String requestClientSecret) {
    return clientId.equals(requestClientId) && clientSecret.equals(requestClientSecret);
  }
}
