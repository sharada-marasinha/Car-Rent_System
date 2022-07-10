package CarRent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Blob;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
public class Driver {
    @Id
    private String driID;
    private String driName;
    private String driAddress;
    private String driContact;
    private String drilicence;

}
