package com.xa.warehouse.entity.product;

import com.xa.warehouse.entity.Auditable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Where(clause = "is_deleted = false") // delete bo'lganlarni select qilmaydi
public class Product extends Auditable {

    @Column(nullable = false)
    private String name;

}
