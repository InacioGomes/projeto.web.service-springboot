package com.rodrigomes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigomes.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
