package org.zerock.service;

import org.zerock.domain.Board;

import java.util.List;

public interface BoardService {
    void register(Board board);
    Board get(Long bno);
    void modify(Board board);
    void remove(Long bno);
    List<Board> getList();
}
