package com.isoft.action;


import com.isoft.service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@Scope("prototype")
@RequestMapping("/flight")
public class FlightAction {
    @Autowired
    IFlightService flightService;
    @RequestMapping(value = "/findAllFlight.do",method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String,Object>> findAllFlight(){
        System.out.println("control test ok");
        List<Map<String,Object>> allFlight = flightService.findAllFlight();
        return allFlight;
    }
}
