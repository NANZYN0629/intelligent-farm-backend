package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.Disease;
import com.sipc.intelligentfarmbackend.pojo.DiseaseQueryParam;
import com.sipc.intelligentfarmbackend.pojo.PageResult;

public interface DiseaseService {

    PageResult<Disease> page(DiseaseQueryParam diseaseQueryParam);

}
