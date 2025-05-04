package com.sipc.intelligentfarmbackend.mapper;


import com.sipc.intelligentfarmbackend.pojo.Disease;
import com.sipc.intelligentfarmbackend.pojo.DiseaseQueryParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiseaseMapper {


    List<Disease> list(DiseaseQueryParam diseaseQueryParam);


    void delete(List<Integer> ids);
}
