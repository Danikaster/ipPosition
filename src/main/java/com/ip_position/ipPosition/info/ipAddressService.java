package com.ip_position.ipPosition.info;

import org.springframework.stereotype.Service;

@Service
public class ipAddressService {
    public ipAddress getInfo(){
        return new ipAddress(
                "Europe",
                "Belarus",
                "Minsk",
                11.1111,
                22.222
        );
    }
}
