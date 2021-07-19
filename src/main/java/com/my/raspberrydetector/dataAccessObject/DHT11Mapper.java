package com.my.raspberrydetector.dataAccessObject;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper @Repository
public interface DHT11Mapper {
    List<DHT11> getAllInfo();
}
