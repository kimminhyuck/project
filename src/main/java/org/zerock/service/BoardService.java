package org.zerock.service;

import org.zerock.domain.BoardVO;

import java.util.List;

public interface BoardService {
    void register(BoardVO board);
    BoardVO get(Long bno);
    void modify(BoardVO board);
    void remove(Long bno);
    List<BoardVO> getList();
}
