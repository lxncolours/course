package com.course.business.controller;

import com.course.server.domain.Chapter;
import com.course.server.dto.ChapterDto;
import com.course.server.dto.PageDto;
import com.course.server.dto.ResponseDto;
import com.course.server.service.ChapterService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/save")
    public ResponseDto<ChapterDto> save(@RequestBody ChapterDto chapterDto){
        ResponseDto<ChapterDto> responseDto = new ResponseDto<>();
        chapterService.save(chapterDto);
        responseDto.setContent(chapterDto);
        return responseDto;
    }

    @PostMapping("/delete/{id}")
    public ResponseDto<ChapterDto> delete(@PathVariable String id){
        chapterService.delete(id);
        return new ResponseDto<>();
    }

}
