package com.eking.activemq.dao;

import com.eking.activemq.pojo.FlightInfo;
import java.util.List;

public interface FlightInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FlightInfo record);

    FlightInfo selectByPrimaryKey(Integer id);

    List<FlightInfo> selectAll();

    int updateByPrimaryKey(FlightInfo record);
}