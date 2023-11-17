package com.branow.nppaccountingsystem.repository;

import com.branow.nppaccountingsystem.model.InventoryNumber;
import com.branow.nppaccountingsystem.model.Property;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PropertyRepository extends JpaRepository<Property, InventoryNumber> {

    Page<Property> findPageSize20SortByInventoryNumber(int number);
    Page<Property> findPageSize20(int number, Sort sort);

}
