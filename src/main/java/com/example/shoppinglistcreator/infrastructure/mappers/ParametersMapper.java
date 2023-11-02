package com.example.shoppinglistcreator.infrastructure.mappers;

import com.example.shoppinglistcreator.domain.parameters.Parameters;
import com.example.shoppinglistcreator.domain.parameters.ParametersDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ParametersMapper {
    ParametersDto ParametersToParametersDto(Parameters parameters);

    Parameters ParametersDtoToParameters(ParametersDto parametersDto);
}