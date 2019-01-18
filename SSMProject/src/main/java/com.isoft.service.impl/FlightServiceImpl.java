package com.isoft.service.impl;

import com.isoft.service.IFlightService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service("flightService")
public class FlightServiceImpl implements IFlightService {
    @Override
    public List<Map<String,Object>> findAllFlight(){
        System.out.println("Service Test ok");
        return null;
    }
}
