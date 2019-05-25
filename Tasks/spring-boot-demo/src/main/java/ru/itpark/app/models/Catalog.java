package ru.itpark.app.models;

import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "my_catalog")
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imgName;


    @Column(length = 1000)
    private String description;
    private Double price;

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
}
