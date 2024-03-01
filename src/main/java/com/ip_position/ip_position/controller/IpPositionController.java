package com.ip_position.ip_position.controller;

import com.ip_position.ip_position.model.IpPositionModel;
import com.ip_position.ip_position.service.IpPositionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IpPositionController {

    private final IpPositionService ipPositionService;

    public IpPositionController(IpPositionService ipPositionService) {
        this.ipPositionService = ipPositionService;
    }

    private boolean isValidIpAddress(String ip) {
        return ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    }

    @GetMapping("/{ip}")
    public IpPositionModel getIpInfo(@PathVariable String ip) {
        if(ip!=null && isValidIpAddress(ip))
            return ipPositionService.getIpInfo(ip);
        else
            return new IpPositionModel();
    }

}

