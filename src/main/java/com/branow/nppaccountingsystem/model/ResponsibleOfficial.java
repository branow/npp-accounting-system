package com.branow.nppaccountingsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ResponsibleOfficial {

    @Id
    private Long officialId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String position;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "department")
    private Department department;


    public String getFullName() {
        return lastName + " " + firstName + " " + middleName;
    }

}
