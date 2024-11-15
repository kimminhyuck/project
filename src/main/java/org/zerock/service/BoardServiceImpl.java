package org.zerock.service;

import org.zerock.domain.Board;
import org.zerock.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor // 생성자 주입을 위한 어노테이션
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Override
    public void register(Board board) {
        boardMapper.insert(board);
    }

    @Override
    public Board get(Long bno) {
        return boardMapper.read(bno);
    }

    @Override
    public void modify(Board board) {
        boardMapper.update(board);
    }

    @Override
    public void remove(Long bno) {
        boardMapper.delete(bno);
    }

    @Override
    public List<Board> getList() {
        return boardMapper.getList();
    }
}
