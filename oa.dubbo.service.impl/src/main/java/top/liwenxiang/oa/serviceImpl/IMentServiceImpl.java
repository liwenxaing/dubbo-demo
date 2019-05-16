package top.liwenxiang.oa.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.liwenxiang.oa.dao.IMentMapper;
import top.liwenxiang.oa.dubbo.service.IMentService;
import top.liwenxiang.oa.pojo.Ment;

import java.util.List;

@Service("IMentServiceImpl")
public class IMentServiceImpl implements IMentService {

    @Autowired
    private IMentMapper iMentMapper;


    public void setiMentMapper(IMentMapper iMentMapper) {
        this.iMentMapper = iMentMapper;
    }

    /**
     * 查询到所有部门 【前后台模块共用】
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.SUPPORTS)
    public List<Ment> findAllMent() {
        return iMentMapper.selectAllMent();
    }

    /**
     * 根据ID删除一个部门
     * @param id
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Integer removeOneMentById(int id) {
        return iMentMapper.deleteOneMentById(id);
    }

    /**
     * 保存一个部门信息
     * 此方法有可能会抛出异常 在消费者层调用时需要加上try-catch以防意外
     * MySQLIntegrityConstraintViolationException : Duplicate entry '1001' for key 'PRIMARY'
     * @param ment
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int saveOneMent(Ment ment) {
        return iMentMapper.insertOneMent(ment);
    }

    /**
     * 查询当前这个部门下所有的员工信息
     * @param bid
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.SUPPORTS)
    public Ment findMentStaffById(int bid) {
        return iMentMapper.selectMentStaffById(bid);
    }


}
