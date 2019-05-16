package top.liwenxiang.oa.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import top.liwenxiang.oa.pojo.Staff;

import java.util.List;

public interface IStaffMapper extends BaseMapper<Staff> {
    /**
     * 查询所有员工信息
     * @return
     */
    List<Staff> selectAllStaff();

    /**
     * 根据id查询一个员工的信息
     * @param id
     * @return
     */
    @Select("SELECT s.pk_id  pkId,s.name,s.gender,s.in_date inDate , s.bid,s.age FROM staff s WHERE pk_id = #{id} LIMIT 1")
    Staff selectOneStaffById(int id);

    /**
     * 添加一个员工
     * @param staff
     * @return
     */
    @Insert("INSERT INTO staff (name,age,in_date,bid,gender) VALUES (#{name},#{age},NOW(),#{bid},#{gender})")
    int insertOneStaff(Staff staff);

}
