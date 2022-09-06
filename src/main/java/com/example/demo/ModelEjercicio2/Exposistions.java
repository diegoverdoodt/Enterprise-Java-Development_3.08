package com.example.demo.ModelEjercicio2;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "expositions")
public class Exposistions extends Event {
}
