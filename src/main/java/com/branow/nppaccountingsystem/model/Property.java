package com.branow.nppaccountingsystem.model;

import com.branow.nppaccountingsystem.model.converter.BaseUnitConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.measure.unit.BaseUnit;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Property {

    @Id
    @EmbeddedId
    private InventoryNumber inventoryNumber;
    private String name;
    @Enumerated(EnumType.STRING)
    private PropertyStatus status;
    @Convert(converter = BaseUnitConverter.class)
    private BaseUnit<?> measurementUnit;
    private Double number;
    @Embedded
    private PropertyDetails details;

}
