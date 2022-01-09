package com.restapi;
import javax.persistence.*;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String marca;
    String modelo;
    Integer ano;
    @Column(updatable = false)
    final LocalDateTime cadastradoEm = LocalDateTime.now();
    /*public void setId(Long id2) {
    }*/
}
