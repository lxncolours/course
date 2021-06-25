package com.course.business.controller;

import com.course.server.dto.ChapterDto;
import com.course.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {
    @Resource
    private ChapterService chapterService;


    @RequestMapping("/findChapterList")
    public List<ChapterDto> findChapterList(){
        List<ChapterDto> list = chapterService.list();
        return list;
    }


}
