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
@Embeddable
public class PropertyDetails {

    private String description;
    private Double initialValue;
    @Enumerated(EnumType.STRING)
    private PropertyState state;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "registration")
    private Document registration;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "deregistration")
    private Document deregistration;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "responsibleOfficial")
    private ResponsibleOfficial responsibleOfficial;

}
