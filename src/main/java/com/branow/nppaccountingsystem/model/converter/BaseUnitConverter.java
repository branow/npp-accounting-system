package com.branow.nppaccountingsystem.model.converter;

import jakarta.persistence.AttributeConverter;

import javax.measure.unit.BaseUnit;

public class BaseUnitConverter implements AttributeConverter<BaseUnit<?>, String> {

    @Override
    public String convertToDatabaseColumn(BaseUnit<?> attribute) {
        return attribute.getSymbol();
    }

    @Override
    public BaseUnit<?> convertToEntityAttribute(String dbData) {
        return new BaseUnit<>(dbData);
    }

}
