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
public class ProductUpdateDto extends GenericDto {

    private String name;

}
