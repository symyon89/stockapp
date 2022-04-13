package com.stockapp.mapper;

import com.stockapp.dto.ComenziDto;
import com.stockapp.model.Comenzi;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProduseMapper {
    ComenziDto mapToDto(Comenzi comenzi);
    Comenzi mapToModel(ComenziDto comenziDto);
}
