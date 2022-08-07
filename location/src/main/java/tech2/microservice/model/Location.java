package tech2.microservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity (name ="Location")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Location {
    @EmbeddedId
    private LocationKey id;
    private long count = 0;
}
