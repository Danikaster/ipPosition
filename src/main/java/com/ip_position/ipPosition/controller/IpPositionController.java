package com.ip_position.ipPosition.controller;

// IpInfoController.java
import com.ip_position.ipPosition.model.IpPositionModel;
import com.ip_position.ipPosition.service.IpPositionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IpPositionController {

    private final IpPositionService ipPositionService;

    public IpPositionController(IpPositionService ipPositionService) {
        this.ipPositionService = ipPositionService;
    }

    @GetMapping("/{ip}")
    public IpPositionModel getIpInfo(@PathVariable String ip) {
        return ipPositionService.getIpInfo(ip);
    }
}

