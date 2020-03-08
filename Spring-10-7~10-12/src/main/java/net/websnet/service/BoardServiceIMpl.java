package net.websnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import net.websnet.domain.BoardVO;
import net.websnet.mapper.BoardMapper;
@Service
@AllArgsConstructor
public class BoardServiceIMpl implements BoardService {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> boardList() {
		return mapper.boardList();
	}

	@Override
	public int boardMaxIdx() {
		return mapper.boardMaxIdx();
	}
	
	@Override
	public void boardWrite(BoardVO vo) {
		mapper.boardWrite(vo);
	}
	
	@Override
	public void boardCount(int idx) {
		mapper.boardCount(idx);
	}
	
	@Override
	public BoardVO boardSelect(int idx) {
		return mapper.boardSelect(idx);
	}
	
	@Override
	public void boardDepth(BoardVO vo) {
		mapper.boardDepth(vo);
	}
	
	@Override
	public int boardModify(BoardVO vo) {
		return mapper.boardModify(vo);
	}
	
	@Override
	public int boardRealparent(int idx) {
		return mapper.boardRealparent(idx);
	}
	
	@Override
	public int boardDelete(BoardVO vo) {
		return mapper.boardDelete(vo);
	}
}
