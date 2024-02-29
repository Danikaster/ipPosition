package com.ip_position.ipPosition.service;

import com.ip_position.ipPosition.model.IpPositionModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class IpPositionService {

    public IpPositionModel getIpInfo(String ip) {
        String apiUrl = "http://ipwho.is/" + ip;
        String finalUrl = UriComponentsBuilder.fromUriString(apiUrl)
                .buildAndExpand(ip)
                .toUriString();


        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(finalUrl, IpPositionModel.class);
    }
}
