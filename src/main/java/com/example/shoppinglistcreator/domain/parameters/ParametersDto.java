package com.example.shoppinglistcreator.domain.parameters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ParametersDto {
    private Float weight;
    private Float growth;
    private Integer activityLevel;
}