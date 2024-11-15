package org.zerock.mapper;

import org.zerock.domain.Board;

import java.util.List;

public interface BoardMapper {
    List<Board> getList();
    void insert(Board board);
    Board read(Long bno);
    void update(Board board);
    void delete(Long bno);
}
