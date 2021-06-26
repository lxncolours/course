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
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChapterServiceImpl implements ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    @Override
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        List<Chapter> chapters = chapterMapper.selectByExample(null);
        PageInfo<Chapter> pageInfo = new PageInfo<>(chapters);
        List<Chapter> list = pageInfo.getList();
        List<ChapterDto> returnList = CopyUtil.copyList(list, ChapterDto.class);
        pageDto.setTotal(pageInfo.getTotal());
        pageDto.setList(returnList);
    }

    @Override
    public void save(ChapterDto chapterDto) {
        Chapter chapter = CopyUtil.copy(chapterDto, Chapter.class);
        if (StringUtils.isEmpty(chapter.getId())) {
            chapter.setId(UuidUtil.getShortUuid());
            this.insert(chapter);
        } else {
            this.update(chapter);
        }
    }

    @Override
    public void insert(Chapter chapter) {
        chapterMapper.insert(chapter);
    }

    @Override
    public void update(Chapter chapter) {
        chapterMapper.updateByPrimaryKey(chapter);
    }

    @Override
    public void delete(String id) {
        chapterMapper.deleteByPrimaryKey(id);
    }


}
