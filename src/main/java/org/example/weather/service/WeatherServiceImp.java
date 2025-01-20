package org.example.weather.service;

import org.example.weather.model.State;
import org.example.weather.model.Weather;
import org.example.weather.model.WeatherDTO;

import java.util.ArrayList;

public class WeatherServiceImp implements WeatherService {
    @Override
    public Weather getWeather(String city) {
        return null;
    }

    @Override
    public ArrayList<Weather> getWeatherByCity(String city) {
        return null;
    }

    @Override
    public void addWeather(WeatherDTO weather) {

    }

    @Override
    public void cityStateUnique(String city, State state) {

    }

    @Override
    public void updateWeather(WeatherDTO weather) {

    }

    @Override
    public void deleteWeather(String city, State state) {

    }
}
