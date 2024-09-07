package com.jajangrohmatulloh.service.notification.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jajangrohmatulloh.service.notification.helper.Converter;
import com.jajangrohmatulloh.service.notification.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Consumer {

    private String url = "https://62843350f6494aa285f590f58ed6ef43.api.mockbin.io/";

    @Autowired
    private RestTemplate restTemplate;

    @KafkaListener(topics = "my-topic", groupId = "my-cgroup", properties = {
            "auto.offset.reset=earliest"
    })
    public void consumeFromTopic(String message) throws JsonProcessingException {
        Data data = Converter.toDataObject(message);
        System.out.println("Data " + data.getNama());
        String response = restTemplate.postForObject(url, data, String.class);

        System.out.println("Response " + response);
    }
}
