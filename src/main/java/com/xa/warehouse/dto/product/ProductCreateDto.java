package com.xa.warehouse.dto.product;

import com.xa.warehouse.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreateDto implements BaseDto {

    private String name;

}
