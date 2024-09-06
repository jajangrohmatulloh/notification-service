package com.jajangrohmatulloh.service.notification.helper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jajangrohmatulloh.service.notification.model.Data;

public class Converter {

    public static Data toDataObject(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Data data = objectMapper.readValue(json, Data.class);

        return data;
    }

}
