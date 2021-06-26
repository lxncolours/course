package com.course.business.controller;

import com.course.server.domain.Chapter;
import com.course.server.dto.PageDto;
import com.course.server.dto.ResponseDto;
import com.course.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {
    @Resource
    private ChapterService chapterService;


    @RequestMapping("/findChapterList")
    public ResponseDto<PageDto> findChapterList(@RequestBody PageDto pageDto){
        ResponseDto<PageDto> responseDto = new ResponseDto<>();
        chapterService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    @RequestMapping("/saveChapter")
    public ResponseDto<Chapter> saveChapter(@RequestBody Chapter chapter){
        ResponseDto<Chapter> responseDto = new ResponseDto<>();
        chapterService.save(chapter);
        responseDto.setContent(chapter);
        return responseDto;
    }

}
