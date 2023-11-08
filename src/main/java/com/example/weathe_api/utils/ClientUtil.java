package com.example.weathe_api.utils;

import com.example.weathe_api.dto.WeatherResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class ClientUtil {
  public WeatherResponse getWetherReportByCity(String city) throws Exception {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://forecast9.p.rapidapi.com/rapidapi/forecast/" + city + "/summary/"))
        .header("X-RapidAPI-Key", "Enter your rapid API key")
        .header("X-RapidAPI-Host", "forecast9.p.rapidapi.com")
        .method("GET", HttpRequest.BodyPublishers.noBody())
        .build();
    HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    if (response.statusCode() == 200) {
      ObjectMapper objectMapper = new ObjectMapper();
      return objectMapper.readValue(response.body(), WeatherResponse.class);
    } else {
      throw new Exception("Failed to fetch weather data. Status code: " + response.statusCode());
    }
  }
  public WeatherResponse getHourlyWeatherReportOfCity(String city) throws Exception {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://forecast9.p.rapidapi.com/rapidapi/forecast/" + city + "/hourly/"))
        .header("X-RapidAPI-Key", "Enter your rapid API key")
        .header("X-RapidAPI-Host", "forecast9.p.rapidapi.com")
        .method("GET", HttpRequest.BodyPublishers.noBody())
        .build();
    HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    if (response.statusCode() == 200) {
      ObjectMapper objectMapper = new ObjectMapper();
      return objectMapper.readValue(response.body(), WeatherResponse.class);
    } else {
      throw new Exception("Failed to fetch weather data. Status code: " + response.statusCode());
    }
  }
}
