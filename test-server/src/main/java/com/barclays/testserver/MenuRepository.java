package com.barclays.testserver;

import org.springframework.data.jpa.repository.JpaRepository;

interface MenuRepository extends JpaRepository<Menu, Integer> {}

