package com.course.business.controller;

import com.course.server.dto.ChapterDto;
import com.course.server.dto.PageDto;
import com.course.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestBody;
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
    public PageDto findChapterList(@RequestBody PageDto pageDto){
        chapterService.list(pageDto);
        return pageDto;
    }


}
