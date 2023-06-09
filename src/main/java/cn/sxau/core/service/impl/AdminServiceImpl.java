package cn.sxau.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sxau.core.dao.AdminMapper;
import cn.sxau.core.po.Admin;
import cn.sxau.core.po.AdminExample;
import cn.sxau.core.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminMapper adminMapper;
	
	@Override
	public Admin findAdmin(String adminId, String adimPwd) {
		AdminExample example = new AdminExample();
		//用来封装查询条件的
		AdminExample.Criteria criteria=example.createCriteria();
		
		criteria.andAdminIdEqualTo(adminId);
		criteria.andAdminPwdEqualTo(adimPwd);
		
		List<Admin> list= adminMapper.selectByExample(example);
		//select * from Admin where aId=? and aPwd=?
		if (list!=null&& list.size()>0) {
			 return list.get(0);
		}
		return null;
	}

	@Override
	public int editInfo(Admin admin) {
		return adminMapper.updateByPrimaryKey(admin);
	}

	@Override
	public Admin getAdmin(String adminId) {
		AdminExample example = new AdminExample();
		//用来封装查询条件的
		AdminExample.Criteria criteria=example.createCriteria();
		
		criteria.andAdminIdEqualTo(adminId);
		
		List<Admin> list= adminMapper.selectByExample(example);
		//select * from Admin where aId=? and aPwd=?
		if (list!=null&& list.size()>0) {
			 return list.get(0);
		}
		return null;
	}



}
