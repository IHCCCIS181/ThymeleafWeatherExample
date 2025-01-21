package org.example.weather.Controller;

import org.example.weather.model.State;
import org.example.weather.model.Weather;
import org.example.weather.model.WeatherDTO;
import org.example.weather.service.CityAndStateAlreadyExistsException;
import org.example.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherAdminController {

    @Autowired
    private WeatherService weatherService;

    //TODO build API Controller

}

