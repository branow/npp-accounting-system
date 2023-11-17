package com.branow.nppaccountingsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class InventoryNumber implements Serializable {

    @Column(name = "group_number")
    private Integer group;
    @Column(name = "subgroup_number")
    private Integer subgroup;
    @Column(name = "sequence_number")
    private Integer sequence;

    public Long getInventoryNumber() {
        String in = "" + group + subgroup + sequence;
        return Long.parseLong(in);
    }

}
