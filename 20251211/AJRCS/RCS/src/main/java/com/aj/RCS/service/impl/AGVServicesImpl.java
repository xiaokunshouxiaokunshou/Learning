package com.aj.RCS.service.impl;

import com.aj.RCS.mapper.AGVMapper;
import com.aj.RCS.pojo.AGV;
import com.aj.RCS.service.AGVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AGVServicesImpl implements AGVService {

    @Autowired
    private AGVMapper agvMapper;

    @Override
    public void add(AGV agv) {
        agv.setCreateTime(LocalDateTime.now());
        agv.setUpdateTime(LocalDateTime.now());
        agvMapper.add(agv);
    }

    @Override
    public List<AGV> findAll() {
        return agvMapper.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        agvMapper.deleteById(id);
    }

    @Override
    public AGV getById(Integer agvId) {
        return agvMapper.findByID(agvId);
    }

    @Override
    public void update(AGV agv) {
        agv.setUpdateTime(LocalDateTime.now());
        agvMapper.update(agv);
    }
}
