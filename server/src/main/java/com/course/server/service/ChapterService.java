package com.course.server.service;


import com.course.server.domain.Chapter;
import com.course.server.dto.ChapterDto;
import com.course.server.dto.PageDto;



public interface ChapterService {

    public void list(PageDto pageDto);

    void save(Chapter chapter);
}
