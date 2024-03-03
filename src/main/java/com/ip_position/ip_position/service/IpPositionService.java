package com.ip_position.ip_position.service;

import com.ip_position.ip_position.model.IpPositionModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IpPositionService {

    public IpPositionModel getIpInfo(String ip) {
        String apiUrl = "http://ipwho.is/" + ip;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl, IpPositionModel.class);
    }
}
