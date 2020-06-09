package com.hibernate.mapping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {
  @Id
  private Integer lid;
  private String lName;
  @OneToOne(mappedBy = "laptop")
  private Student student;

}
