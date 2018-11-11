package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapperdb.AllclassObjectMapper;
import com.example.object.AllclassObject;
import com.example.service.AllclassService;

@Service
public class AllclassServiceImpl implements AllclassService{

	@Autowired
	private AllclassObjectMapper allclassMapper;
	
	@Override
	public int insert(AllclassObject user) {
		// TODO Auto-generated method stub
		return allclassMapper.insert(user);
	}

	@Override
	public int delete(Integer userid) {
		// TODO Auto-generated method stub
		return allclassMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int update(AllclassObject user) {
		// TODO Auto-generated method stub
		return allclassMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public AllclassObject selectByID(Integer CO_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AllclassObject> selectAll() {
		// TODO Auto-generated method stub
		return allclassMapper.selectAll();
	}

	@Override
	public List<AllclassObject> querySelective(AllclassObject allclassObject) {
		// TODO Auto-generated method stub
		return allclassMapper.querySelective(allclassObject);
	}

	@Override
	public List<AllclassObject> selectByCoursesID(Integer CO_ID) {
		// TODO Auto-generated method stub
		return allclassMapper.selectByCoursesID(CO_ID);
	}

}
