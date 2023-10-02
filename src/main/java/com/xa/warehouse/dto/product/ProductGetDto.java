package com.xa.warehouse.dto.product;

import com.xa.warehouse.dto.GenericDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductGetDto extends GenericDto {

    private String name;

}
