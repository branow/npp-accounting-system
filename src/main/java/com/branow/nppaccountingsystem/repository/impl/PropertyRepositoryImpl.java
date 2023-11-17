package com.branow.nppaccountingsystem.repository.impl;

import com.branow.nppaccountingsystem.model.InventoryNumber;
import com.branow.nppaccountingsystem.model.Property;
import com.branow.nppaccountingsystem.repository.PropertyRepository;
import jakarta.persistence.EntityManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PropertyRepositoryImpl extends SimpleJpaRepository<Property, InventoryNumber> implements PropertyRepository {

    public PropertyRepositoryImpl(EntityManager entityManager) {
        super(Property.class, entityManager);
    }


    @Override
    public Page<Property> findPageSize20SortByInventoryNumber(int number) {
        return findPageSize20(number, Sort.by("inventoryNumber"));
    }

    @Override
    public Page<Property> findPageSize20(int number, Sort sort) {
        return findAll(PageRequest.of(number, 20, sort));
    }

}
