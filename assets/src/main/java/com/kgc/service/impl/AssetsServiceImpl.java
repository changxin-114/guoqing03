package com.kgc.service.impl;

import com.kgc.mapper.AssetsMapper;
import com.kgc.pojo.Assets;
import com.kgc.pojo.AssetsExample;
import com.kgc.service.AssetsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("assetsService")
public class AssetsServiceImpl implements AssetsService {
    @Resource
    AssetsMapper assetsMapper;

    @Override
    public List<Assets> selectAll(String assetid, Integer assettype) {
        AssetsExample assetsExample=new AssetsExample();
        AssetsExample.Criteria criteria = assetsExample.createCriteria();
        if(assetid!=null||(assettype!=null&&assettype!=0)){
            criteria.andAssetidLike("%"+assetid+"%");
            criteria.andAssettypeEqualTo(assettype);
        }else{
            return assetsMapper.selectByExample(null);
        }
        return assetsMapper.selectByExample(assetsExample);
    }

    @Override
    public int add(Assets assets) {
        return assetsMapper.insert(assets);
    }
}
