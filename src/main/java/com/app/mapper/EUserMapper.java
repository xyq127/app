package com.app.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.app.entity.EUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.app.entity.EUser
 */
@Repository
public interface EUserMapper extends BaseMapper<EUser> {

    List<EUser> selectById(@Param("id") String id);

}


