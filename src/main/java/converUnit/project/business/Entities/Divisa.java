package converUnit.project.business.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name="DIVISA")
@Getter
@Setter
@RequiredArgsConstructor
public class Divisa implements Serializable {
    @Id
    private int id;

    @Column(name="NAME")
    private String name;

    @Column(name="URLIMG")
    private String url_img;

    @Column(name="FLAG")
    private int flag;

}
