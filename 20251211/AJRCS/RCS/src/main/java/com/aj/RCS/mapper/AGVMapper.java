package com.aj.RCS.mapper;

import com.aj.RCS.pojo.AGV;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AGVMapper {

    @Select("select * from temp02")
    List<AGV> findAll();

    /**
     * 根据ID删除AGV
     */
    @Delete("delete from temp02 where id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into temp02(eName, create_time, update_time) values(#{eName},#{createTime},#{updateTime})")
    void add(AGV agv);

    @Select("select id, eName, type,navType,create_time, update_time from temp02 where id = #{id}")
    AGV findByID(Integer id);

    @Update("update temp02 set eName = #{eName} , update_time = #{updateTime} where id = #{id}")
    void update(AGV agv);
}
