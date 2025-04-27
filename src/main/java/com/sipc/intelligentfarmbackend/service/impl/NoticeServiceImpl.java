package com.sipc.intelligentfarmbackend.service.impl;

import com.sipc.intelligentfarmbackend.mapper.NoticeMapper;
import com.sipc.intelligentfarmbackend.pojo.Notice;
import com.sipc.intelligentfarmbackend.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> getByFieldId(Integer fieldId) {
        return noticeMapper.getByFieldId(fieldId);
    }
}
