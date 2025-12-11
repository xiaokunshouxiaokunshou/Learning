package com.aj.RCS.service;

import com.aj.RCS.pojo.AGV;

import java.util.List;

public interface AGVService {
    /**
     * 新增AGV
     * @param agv
     */
    void add(AGV agv);

    /**
     * 查询所有AGV
     */
    List<AGV> findAll();

    /**
     * 根据ID删除AGV
     */
    void deleteById(Integer id);

    /**
     * 根据ID查询AGV
     * @param agvId
     * @return
     */
    AGV getById(Integer agvId);

    /**
     * 更新AGV
     * @param agv
     */
    void update(AGV agv);
}
