package com.ai.amc.core.service;

import java.util.List;

import com.ai.amc.core.vo.HistoryVo;


public interface IHistorySv {
     
	List<HistoryVo> getItemsByItemID(String itemid,String value_type,int time);
}
