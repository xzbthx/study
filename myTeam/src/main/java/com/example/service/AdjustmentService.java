package com.example.service;

import java.util.List;

import com.example.object.AdjustmentObject;

public interface AdjustmentService {

	int insert(AdjustmentObject adjustment);

	int delete(Integer AD_ID);

	int update(AdjustmentObject adjustment);

	AdjustmentObject selectByID(Integer AD_ID);

	List<AdjustmentObject> selectAll();

	List<AdjustmentObject> querySelective(AdjustmentObject adjustmentObject);
}
