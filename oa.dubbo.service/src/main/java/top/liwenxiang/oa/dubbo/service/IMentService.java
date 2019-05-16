package top.liwenxiang.oa.dubbo.service;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import top.liwenxiang.oa.pojo.Ment;

import java.util.List;

/**
 * 部门服务接口
 */
public interface IMentService {
      /**
       * 查询到所有部门 【前后台模块共用】
       * @return
       */
      List<Ment> findAllMent();

      /**
       * 根据ID删除一个部门
       * @param id
       * @return
       */
      Integer removeOneMentById(int id);

      /**
       * 保存一个部门信息
       * @param ment
       * @return
       */
      int saveOneMent(Ment ment);

      /**
       * 查询当前这个部门下所有的员工信息
       * @param bid
       * @return
       */
      Ment findMentStaffById(int bid);


}
