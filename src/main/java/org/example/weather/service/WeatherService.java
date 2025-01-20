package org.example.weather.service;

import org.example.weather.model.*;
import org.example.weather.model.WeatherDTO;

import java.util.ArrayList;

public interface WeatherService {
    Weather getWeather(String city);
    ArrayList<Weather> getWeatherByCity(String city);
    void addWeather(WeatherDTO weather);
    void cityStateUnique(String city, State state);
    void updateWeather(WeatherDTO weather);
    void deleteWeather(String city, State state);
}
