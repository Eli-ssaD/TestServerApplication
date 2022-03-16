package com.barclays.testserver;

import org.springframework.data.jpa.repository.JpaRepository;

interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {}
