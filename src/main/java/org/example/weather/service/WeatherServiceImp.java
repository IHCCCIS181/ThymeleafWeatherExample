package org.example.weather.service;

import org.example.weather.model.State;
import org.example.weather.model.Weather;
import org.example.weather.model.WeatherDTO;
import org.example.weather.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherServiceImp implements WeatherService {

    //TODO build service layer

    @Autowired
    private WeatherRepository weatherRepository;


    @Override
    public Weather getWeather(String city) {
        return null;
    }

    @Override
    public List<Weather> getWeatherByState(State state) {
        return List.of();
    }

    @Override
    public void addWeather(WeatherDTO weather) throws CityAndStateAlreadyExistsException {

    }

    @Override
    public void updateWeather(WeatherDTO weather) {

    }

    @Override
    public void deleteWeather(String city, State state) {

    }
}

