package com.course.server.impl;

import com.course.server.domain.Chapter;
import com.course.server.dto.ChapterDto;
import com.course.server.mapper.ChapterMapper;
import com.course.server.service.ChapterService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChapterServiceImpl implements ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    @Override
    public List<ChapterDto> list() {
        List<ChapterDto> returnList = new ArrayList<>();
        PageHelper.startPage(1,5);
        List<Chapter> chapters = chapterMapper.selectByExample(null);
        PageInfo<Chapter> pageInfo = new PageInfo<>(chapters);
        List<Chapter> list = pageInfo.getList();
        for (Chapter chapter : list) {
            ChapterDto chapterDto = new ChapterDto();
            BeanUtils.copyProperties(chapter,chapterDto);
            returnList.add(chapterDto);
        }
        return returnList;

    }
}
