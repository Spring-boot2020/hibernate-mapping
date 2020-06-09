package com.hibernate.mapping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
  @Id
  private Integer sid;
  private String name;
  @OneToOne
  @JoinColumn(name="lid")
  private Laptop laptop;
}
