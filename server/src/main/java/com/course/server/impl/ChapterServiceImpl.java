package com.course.server.impl;

import com.course.server.domain.Chapter;
import com.course.server.dto.ChapterDto;
import com.course.server.dto.PageDto;
import com.course.server.mapper.ChapterMapper;
import com.course.server.service.ChapterService;
import com.course.server.utils.CopyUtil;
import com.course.server.utils.UuidUtil;
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
    public void list(PageDto pageDto) {
        List<ChapterDto> returnList = new ArrayList<>();
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());
        List<Chapter> chapters = chapterMapper.selectByExample(null);
        PageInfo<Chapter> pageInfo = new PageInfo<>(chapters);
        List<Chapter> list = pageInfo.getList();
        for (Chapter chapter : list) {
            ChapterDto chapterDto = new ChapterDto();
            BeanUtils.copyProperties(chapter,chapterDto);
            returnList.add(chapterDto);
        }
        pageDto.setTotal(pageInfo.getTotal());
        pageDto.setList(returnList);
    }

    @Override
    public void save(Chapter chapter) {
        chapter.setId(UuidUtil.getShortUuid());
        chapterMapper.insert(chapter);
    }
}
