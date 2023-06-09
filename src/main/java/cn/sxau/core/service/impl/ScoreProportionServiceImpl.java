package cn.sxau.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sxau.core.dao.ScoreProportionMapper;
import cn.sxau.core.po.ScoreProportion;
import cn.sxau.core.service.ScoreProportionService;
@Service
public class ScoreProportionServiceImpl implements ScoreProportionService {

	@Autowired
	private ScoreProportionMapper scoreProportionMapper;
	@Override
	public ScoreProportion getScoreProportion(String proportionId) {
		return scoreProportionMapper.selectByPrimaryKey(proportionId);
	}
	@Override
	public int update(ScoreProportion scoreProportion) {
		return scoreProportionMapper.updateByPrimaryKey(scoreProportion);
	}

}
