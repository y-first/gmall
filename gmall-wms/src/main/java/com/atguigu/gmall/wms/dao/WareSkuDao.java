package com.atguigu.gmall.wms.dao;

import com.atguigu.gmall.wms.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author y
 * @email lxf@atguigu.com
 * @date 2020-03-17 18:39:29
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
