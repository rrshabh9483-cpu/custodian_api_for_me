package com.lcwr.CustodianApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Custodian")
public class CustodianModel {
    private int id;
    private String name;
    private String add;


}
