package com.yuanma.programmer.service.admin;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yuanma.programmer.entity.admin.Authority;

/**
 * Ȩ��service�ӿ�
 * @author llq
 *
 */
@Service
public interface AuthorityService {
	public int add(Authority authority);
	public int deleteByRoleId(Long roleId);
	public List<Authority> findListByRoleId(Long roleId);
}
