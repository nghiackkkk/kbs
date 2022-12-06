
package com.example.demo.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Benh implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int count;
    @Column(columnDefinition = "TEXT")
    private String description;
}
