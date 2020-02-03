package com.airline.a1.board;




import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.airline.a1.boardUtil.Pager;

@Repository
@Mapper
public interface NoticeMapper {
	
	public int noticeWrite(NoticeVO noticeVO)throws Exception;	
	
	public List<BoardVO> noticeList(Pager pager)throws Exception;
	
	public List<BoardVO> subNoticeList(Pager pager)throws Exception;
	
	public int noticeCount(Pager pager)throws Exception;
	
}
