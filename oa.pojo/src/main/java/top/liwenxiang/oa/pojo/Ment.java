package top.liwenxiang.oa.pojo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Set;

/**
 * 部门表 用来传输部门的数据信息
 */
@TableName("Ment")
public class Ment implements Serializable {

    public final static Long serializableVersionID= 1L;


     @TableId(value = "bid")
     private Integer bId;   // 部门编号
     @TableField("bname")
     private String bName;  // 部门名称
     @TableField("logical_deletion")
     private byte logicalDeletion ;  // 是否删除 此处为逻辑删除 不是真正意义的删除;
     @TableField(exist =false)
     private Set<Staff> staffs;  // 当前部门下的所有员工信息

    @Override
    public String toString() {
        return "Ment{" +
                "bId=" + bId +
                ", bName='" + bName + '\'' +
                ", logicalDeletion=" + logicalDeletion +
                ", staffs=" + staffs +
                '}';
    }

    public Ment() {
    }

    public Set<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(Set<Staff> staffs) {
        this.staffs = staffs;
    }

    public byte getLogicalDeletion() {
        return logicalDeletion;
    }

    public void setLogicalDeletion(byte logicalDeletion) {
        this.logicalDeletion = logicalDeletion;
    }

    public Ment(Integer bId, String bName, byte logicalDeletion) {
        this.bId = bId;
        this.bName = bName;
        this.logicalDeletion = logicalDeletion;
    }

    public Ment(Integer bId, String bName) {
        this.bId = bId;
        this.bName = bName;
    }


    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }
}
