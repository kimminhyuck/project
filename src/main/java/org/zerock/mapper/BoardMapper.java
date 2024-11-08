package org.zerock.mapper;

import org.zerock.domain.BoardVO;

import java.util.List;

public interface BoardMapper {
    List<BoardVO> getList();
    void insert(BoardVO board);
    BoardVO read(Long bno);
    void update(BoardVO board);
    void delete(Long bno);
}
