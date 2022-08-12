package tech2.microservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity (name ="Location")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Location {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private LocationKey id;
    private long count = 0;
}
