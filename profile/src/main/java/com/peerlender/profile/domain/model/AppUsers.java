package com.peerlender.profile.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AppUsers {

  @Id
  private String username;
  private String firstName;
  private String lastName;
  private int age;
  private String occupation;
  private LocalDate registeredSince;
}

