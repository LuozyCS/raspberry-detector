package com.my.raspberrydetector.dataAccessObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
public class DHT11 {
    private String TEMP;
    private String HUM;
    private String TIME;
}
