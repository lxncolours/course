package com.course.server.service;


import com.course.server.domain.Chapter;
import com.course.server.dto.ChapterDto;
import com.course.server.dto.PageDto;



public interface ChapterService {

    void list(PageDto pageDto);

    void save(ChapterDto chapterDto);

    void insert(Chapter chapter);

    void update(Chapter chapter);

    void delete(String id);
}
