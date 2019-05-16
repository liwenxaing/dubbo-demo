package top.liwenxiang.oa.dubbo.service;

import top.liwenxiang.oa.pojo.Staff;

import java.util.List;

/**
 * 员工服务接口
 */
public interface IStaffService {

    /**
     * 查询所有员工信息
     * @return
     */
    List<Staff> findAllStaff();

    /**
     * 根据id查询一个员工的信息
     * @param id
     * @return
     */
    Staff findOneStaffById(int id);

    /**
     * 添加一个员工
     * @param staff
     * @return
     */
    int saveOneStaff(Staff staff);


}
