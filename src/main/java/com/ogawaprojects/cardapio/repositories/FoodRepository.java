package com.ogawaprojects.cardapio.repositories;

import com.ogawaprojects.cardapio.food.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
