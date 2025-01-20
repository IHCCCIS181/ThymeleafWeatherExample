package org.example.weather.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString

//TODO add validation

public class WeatherDTO {

    public String city;
    public State state;
    public double tempC;
    public double precipitation;
    public double humidity;
    public int windKmH;


    public WeatherDTO(String city, State state, double tempC, double precipitation, double hum, int windKmH) {
        this.city = city;
        this.state = state;
        this.tempC = tempC;
        this.precipitation = precipitation;
        this.humidity = hum;
        this.windKmH = windKmH;
    }
}


