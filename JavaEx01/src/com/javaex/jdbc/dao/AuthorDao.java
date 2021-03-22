package com.javaex.jdbc.dao;

import java.util.List;

//	설계 규약
//	Interface 를 implements 한 모든 객체는 내부의 추상메소드를 모두 Override 해야 한다.
public interface AuthorDao {

	public List<AuthorVo> getList();
	public List<AuthorVo> search(String keyword);
	public AuthorVo get(Long id);
	public boolean insert(AuthorVo vo);
	public boolean update(AuthorVo vo);
	public boolean delete(Long id);
	
}
