package com.birds.boot.service;

import java.io.IOException;
import java.util.Date;

import org.springframework.boot.jackson.JsonComponent;

import com.birds.boot.helpers.DateHelper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

@JsonComponent
public class JsonConverters {


    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static class DateSerializer extends JsonSerializer<Date> {

        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException,
                                                                                             JsonProcessingException {
            gen.writeString(DateHelper.convertToString(value, DATE_FORMAT));

        }

    }

    public static class DateDeserializer extends JsonDeserializer<Date> {

        @Override
        public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            return DateHelper.convertDate(p.getText(), DATE_FORMAT);
        }

    }
}
