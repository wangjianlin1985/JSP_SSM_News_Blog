package com.yuanma.programmer.dao.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yuanma.programmer.entity.admin.Comment;

/**
 * ��������dao
 * @author llq
 *
 */
@Repository
public interface CommentDao {
	public int add(Comment comment);
	public int edit(Comment comment);
	public int delete(String ids);
	public List<Comment> findList(Map<String,Object> queryMap);
	public List<Comment> findAll();
	public int getTotal(Map<String,Object> queryMap);
}
