package com.ip_position.ipPosition.info;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ipAddressController {

    private final ipAddressService ipAddressService;

    public ipAddressController(com.ip_position.ipPosition.info.ipAddressService ipAddressService) {
        this.ipAddressService = ipAddressService;
    }


    @GetMapping
    public ipAddress getInfo(){
        return ipAddressService.getInfo();
    }
}
