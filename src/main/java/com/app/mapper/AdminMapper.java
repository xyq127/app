package com.app.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.app.entity.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @Entity com.app.entity.Admin
 */
@Repository
public interface AdminMapper extends BaseMapper<Admin> {

    List<Admin> selectByAdminName(@Param("adminName") String adminName);

    List<Admin> selectByAdminId(@Param("adminId") String adminId);

}




