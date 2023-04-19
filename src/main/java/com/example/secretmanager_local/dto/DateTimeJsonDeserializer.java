package com.example.secretmanager_local.dto;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeJsonDeserializer implements JsonDeserializer<Date> {

  @Override
  public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
    LocalDateTime localDateTime = LocalDateTime.parse(json.getAsString(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    return Date.from(localDateTime.atZone(ZoneOffset.systemDefault()).toInstant());
  }
}
