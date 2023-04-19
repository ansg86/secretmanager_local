package com.example.secretmanager_local.dto;

import com.google.gson.annotations.JsonAdapter;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TestDto {

  private String name;

  @JsonAdapter(DateTimeJsonDeserializer.class)
  private Date testDate;

  @JsonAdapter(DateJsonDeserializer.class)
  private Date saveDate;
}
