package org.zerock.service;

import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor 
public class BoardServiceImpl implements BoardService {

	private final BoardMapper boardMapper;

	@Override
	public void register(BoardVO board) {
		boardMapper.insert(board);
	}

	@Override
	public BoardVO get(Long bno) {
		return boardMapper.read(bno);
	}

	@Override
	public void modify(BoardVO board) {
		boardMapper.update(board);
	}

	@Override
	public void remove(Long bno) {
		boardMapper.delete(bno);
	}

	@Override
	public List<BoardVO> getList() {
		return boardMapper.getList();
	}
}
