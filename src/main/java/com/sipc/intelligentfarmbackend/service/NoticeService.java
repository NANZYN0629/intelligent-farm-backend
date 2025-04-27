package com.sipc.intelligentfarmbackend.service;

import com.sipc.intelligentfarmbackend.pojo.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> getByFieldId(Integer fieldId);
}
