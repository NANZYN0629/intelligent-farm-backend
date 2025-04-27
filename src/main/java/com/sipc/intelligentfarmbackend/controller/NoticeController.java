package com.sipc.intelligentfarmbackend.controller;

import com.sipc.intelligentfarmbackend.pojo.Notice;
import com.sipc.intelligentfarmbackend.pojo.PlantLog;
import com.sipc.intelligentfarmbackend.pojo.Result;
import com.sipc.intelligentfarmbackend.service.NoticeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/alert")
@RestController
public class NoticeController {

    @Autowired
    private NoticeService noticeService;


    // 按地块id查询
    @GetMapping("/{fieldId}")
    public Result getByFieldId(@PathVariable Integer fieldId) {
        log.info("查询地块id={}的警报", fieldId);
        List<Notice> notices = noticeService.getByFieldId(fieldId);
        return Result.success(notices);
    }



}
