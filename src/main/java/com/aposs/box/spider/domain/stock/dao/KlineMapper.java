package com.aposs.box.spider.domain.stock.dao;

import com.aposs.box.spider.config.MyMapper;
import com.aposs.box.spider.domain.stock.entity.Kline;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Aaron
 * @date 2020/12/19
 */
@Mapper
public interface KlineMapper extends MyMapper<Kline> {
}
