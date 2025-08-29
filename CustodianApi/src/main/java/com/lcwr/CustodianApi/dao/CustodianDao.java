package com.lcwr.CustodianApi.dao;

import com.lcwr.CustodianApi.model.CustodianModel;

import java.util.List;

public interface CustodianDao {


    List<CustodianModel> getAllCustodianList();

    CustodianModel addCustodian(CustodianModel custodian);

    CustodianModel updateCustodian(CustodianModel custodian);
}
