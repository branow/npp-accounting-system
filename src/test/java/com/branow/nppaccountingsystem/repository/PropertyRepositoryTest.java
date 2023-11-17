package com.branow.nppaccountingsystem.repository;

import com.branow.nppaccountingsystem.model.Property;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

@SpringBootTest
public class PropertyRepositoryTest {

    @Autowired
    private PropertyRepository propertyRepository;
    @Autowired
    private DocumentRepository documentRepository;
    @Autowired
    private ResponsibleOfficialRepository officialRepository;
    @Autowired
    private DepartmentRepository departmentRepository;


    @Test
    void fillDb() {
        TestDataStorage storage = new TestDataStorage();
        departmentRepository.saveAll(storage.departments());
        officialRepository.saveAll(storage.officials());
        documentRepository.saveAll(storage.documents());
        propertyRepository.saveAll(storage.properties());
    }

    @Test
    void find() {
        Page<Property> page = propertyRepository.findPageSize20SortByInventoryNumber(0);
        System.out.println("total size -> " + page.getTotalElements());
        System.out.println("page size -> " + page.getSize());
        System.out.println("elements on page -> " + page.getNumberOfElements());
        System.out.println("total pages  -> " + page.getTotalPages());
        System.out.println("page -> " + page.getNumber());
        page.get().forEach(System.out::println);
    }

    @Test
    void clearDb() {
        propertyRepository.deleteAll();
        documentRepository.deleteAll();
        officialRepository.deleteAll();
        departmentRepository.deleteAll();
    }

}
