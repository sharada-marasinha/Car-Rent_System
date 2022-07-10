package CarRent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Employer {
    @Id
    private String emID;
    private String emUserName;
    private String emPassword;
    private String emEmail;
    private String emContact;


    /*@Column(unique = true)*/

}
