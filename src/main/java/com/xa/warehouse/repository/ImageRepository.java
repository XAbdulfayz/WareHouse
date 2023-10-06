package com.xa.warehouse.repository;

import com.xa.warehouse.entity.product.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
