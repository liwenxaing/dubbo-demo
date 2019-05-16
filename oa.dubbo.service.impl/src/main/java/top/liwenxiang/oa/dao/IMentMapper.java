package top.liwenxiang.oa.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import top.liwenxiang.oa.pojo.Ment;

import java.util.List;

public interface IMentMapper extends BaseMapper<Ment> {
    /**
     * 查询到所有部门 【前后台模块共用】
     * @return
     */
    @Select("SELECT bid,bname,logical_deletion FROM ment")
    List<Ment> selectAllMent();

    /**
     * 根据ID删除一个部门
     * @param id
     * @return
     */
    @Update("UPDATE ment SET logical_deletion = 1 WHERE  bid = #{0}")
    Integer deleteOneMentById(int id);

    /**
     * 保存一个部门信息
     * @param ment
     * @return
     */
    @Insert("INSERT INTO ment (bid,bname,logical_deletion) VALUES (#{bId},#{bName},0)")
    int insertOneMent(Ment ment);

    /**
     * 查询当前这个部门下所有的员工信息
     * @param bid
     * @return
     */
    Ment selectMentStaffById(int bid);
}
