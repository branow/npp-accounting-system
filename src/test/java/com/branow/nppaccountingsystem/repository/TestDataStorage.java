package com.branow.nppaccountingsystem.repository;

import com.branow.nppaccountingsystem.model.*;

import javax.measure.unit.BaseUnit;
import java.time.LocalDate;
import java.util.List;

public class TestDataStorage {

    public List<Property> properties() {
        return List.of(
                Property.builder()
                        .inventoryNumber(inventoryNumbers().get(0))
                        .name("Генератор")
                        .status(PropertyStatus.IN_INVENTORY)
                        .measurementUnit(new BaseUnit<>("pcs"))
                        .number(1d)
                        .details(propertyDetails().get(0))
                        .build(),
                Property.builder()
                        .inventoryNumber(inventoryNumbers().get(1))
                        .name("Турбіна")
                        .status(PropertyStatus.RETIRED)
                        .measurementUnit(new BaseUnit<>("pcs"))
                        .number(1d)
                        .details(propertyDetails().get(1))
                        .build(),
                Property.builder()
                        .inventoryNumber(inventoryNumbers().get(2))
                        .name("Трансформатор").status(PropertyStatus.IN_INVENTORY)
                        .measurementUnit(new BaseUnit<>("pcs"))
                        .number(1d)
                        .details(propertyDetails().get(2))
                        .build(),
                Property.builder()
                        .inventoryNumber(inventoryNumbers().get(3))
                        .name("Реактор")
                        .status(PropertyStatus.IN_INVENTORY)
                        .measurementUnit(new BaseUnit<>("pcs"))
                        .number(1d)
                        .details(propertyDetails().get(3))
                        .build(),
                Property.builder()
                        .inventoryNumber(inventoryNumbers().get(4))
                        .name("Помпа")
                        .status(PropertyStatus.IN_INVENTORY)
                        .measurementUnit(new BaseUnit<>("pcs"))
                        .number(1d)
                        .details(propertyDetails().get(4))
                        .build()
        );
    }

    private List<PropertyDetails> propertyDetails() {
        return List.of(
                PropertyDetails.builder()
                        .description("Модель X-500")
                        .initialValue(500_000d)
                        .state(PropertyState.OPERATIONAL)
                        .registration(documents().get(0))
                        .responsibleOfficial(officials().get(0))
                        .build(),
                PropertyDetails.builder()
                        .description("Застаріла модель")
                        .initialValue(300_000d).state(PropertyState.NOT_WORKING)
                        .registration(documents().get(0))
                        .deregistration(documents().get(1))
                        .responsibleOfficial(officials().get(0))
                        .build(),
                PropertyDetails.builder()
                        .description("Трансформатор для електростанції")
                        .initialValue(150_000d).state(PropertyState.OPERATIONAL)
                        .registration(documents().get(2))
                        .responsibleOfficial(officials().get(1))
                        .build(),
                PropertyDetails.builder()
                        .description("Високовольтний реактор")
                        .initialValue(250_000d)
                        .state(PropertyState.REQUIRES_REPAIR)
                        .registration(documents().get(2))
                        .responsibleOfficial(officials().get(0))
                        .build(),
                PropertyDetails.builder()
                        .description("Циркуляційна помпа")
                        .initialValue(80_000d)
                        .state(PropertyState.OPERATIONAL)
                        .registration(documents().get(0))
                        .responsibleOfficial(officials().get(2))
                        .build()
        );
    }

    private List<InventoryNumber> inventoryNumbers() {
        return List.of(
                InventoryNumber.builder()
                        .group(1013)
                        .subgroup(2)
                        .sequence(1)
                        .build(),
                InventoryNumber.builder()
                        .group(1013)
                        .subgroup(3)
                        .sequence(2)
                        .build(),
                InventoryNumber.builder()
                        .group(1013)
                        .subgroup(1)
                        .sequence(3)
                        .build(),
                InventoryNumber.builder()
                        .group(1013)
                        .subgroup(2)
                        .sequence(4)
                        .build(),
                InventoryNumber.builder()
                        .group(1013)
                        .subgroup(2)
                        .sequence(5)
                        .build()
        );
    }

    public List<Document> documents() {
        return List.of(
                Document.builder()
                        .number(1001)
                        .name("Акт приймання-передачі")
                        .description("Акт введення в експлуатацію обладнання")
                        .date(LocalDate.of(2023, 1, 15))
                        .build(),
                Document.builder()
                        .number(1002)
                        .name("Акт списання")
                        .description("Акт списання застарілого обладнання")
                        .date(LocalDate.of(2023, 2, 28))
                        .build(),
                Document.builder()
                        .number(1003)
                        .name("Технічний огляд")
                        .description("Результат технічного огляду електротурбіни")
                        .date(LocalDate.of(2023, 3, 10))
                        .build()
        );
    }

    public List<ResponsibleOfficial> officials() {
        return List.of(
                ResponsibleOfficial.builder()
                        .officialId(1021654874L)
                        .firstName("Іван")
                        .lastName("Коваленко")
                        .middleName("Олександрович")
                        .position("Головний інженер")
                        .department(departments().get(0))
                        .build(),
                ResponsibleOfficial.builder()
                        .officialId(6526265654L)
                        .firstName("Марія")
                        .lastName("Іванова")
                        .middleName("Володимирівна")
                        .position("Головний інженер")
                        .department(departments().get(1))
                        .build(),
                ResponsibleOfficial.builder()
                        .officialId(2569135454L)
                        .firstName("Олег")
                        .lastName("Боруля")
                        .middleName("Миколайович")
                        .position("Технік")
                        .department(departments().get(2))
                        .build()
        );
    }

    public List<Department> departments() {
        return List.of(
                Department.builder()
                        .departmentId(1)
                        .departmentName("Енергоблок №1")
                        .build(),
                Department.builder()
                        .departmentId(2)
                        .departmentName("Енергоблок №2")
                        .build(),
                Department.builder()
                        .departmentId(3)
                        .departmentName("Технічне управління")
                        .build()
        );
    }

}
