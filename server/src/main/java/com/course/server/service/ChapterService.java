package com.course.server.service;

import com.course.server.domain.Chapter;
import com.course.server.dto.ChapterDto;

import java.util.List;


public interface ChapterService {

    public List<ChapterDto> list();

}
