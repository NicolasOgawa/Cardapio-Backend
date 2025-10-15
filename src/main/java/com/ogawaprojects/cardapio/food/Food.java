package com.ogawaprojects.cardapio.food;

import jakarta.persistence.*;
import lombok.*;

@Table (name = "foods")
@Entity (name = "foods")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //Usar o UUID numa aplicação profissional
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodRequestDTO data) {
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getPrice() {
        return price;
    }
}