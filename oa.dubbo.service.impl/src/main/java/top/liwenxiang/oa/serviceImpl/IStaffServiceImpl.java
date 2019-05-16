package top.liwenxiang.oa.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.liwenxiang.oa.dao.IStaffMapper;
import top.liwenxiang.oa.dubbo.service.IStaffService;
import top.liwenxiang.oa.pojo.Staff;

import java.util.List;

@Service("IStaffServiceImpl")
public class IStaffServiceImpl implements IStaffService {

    @Autowired
    private IStaffMapper iStaffMapper;


    public void setiStaffMapper(IStaffMapper iStaffMapper) {
        this.iStaffMapper = iStaffMapper;
    }

    /**
     * 查询所有员工信息
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.SUPPORTS)
    public List<Staff> findAllStaff() {
        return iStaffMapper.selectAllStaff();
    }

    /**
     * 根据id查询一个员工的信息
     * @param id
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.SUPPORTS)
    public Staff findOneStaffById(int id) {
        return iStaffMapper.selectOneStaffById(id);
    }

    /**
     * 添加一个员工
     * @param staff
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int saveOneStaff(Staff staff) {
        return iStaffMapper.insertOneStaff(staff);
    }

}
