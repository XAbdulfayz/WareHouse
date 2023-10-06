package com.xa.warehouse.entity.product;

import com.xa.warehouse.entity.Auditable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Where(clause = "is_deleted = false") // delete bo'lganlarni select qilmaydi
public class Product extends Auditable {

    @Id
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Long amount;
    @Column(nullable = false)
    private String purchase_price;
    @Column(nullable = false)
    private String selling_price;
    @Column(nullable = false)
    private String status;
    @Column(nullable = false)
    private LocalDate expired_date;


}
