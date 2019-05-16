package top.liwenxiang.oa.pojo;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 *  员工实体类 （存储员工信息）
 */
@TableName("Staff")
public class Staff implements Serializable {

    public final static Long serializableVersionID= 1L;
    @TableId(value = "pk_id",type = IdType.AUTO)
    private Integer pkId;  // 员工id
    private String  name;  // 员工姓名
    private byte age;      // 员工年龄  set 方法进行了判断 年龄 范围
    @TableField(value = "in_date")
    private Date inDate;   // 入职时间
    private Integer bid;   // 部门编号（外键）
    private byte gender;   // 性别 0 男 1 女
    @TableField(exist = false)
    private Ment ment;   // 当前员工所在的部门信息

    public Staff() {
    }

    @Override
    public String toString() {
        return "Staff{" +
                "pkId=" + pkId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", inDate=" + inDate +
                ", bid=" + bid +
                ", gender=" + gender +
                ", ment=" + ment +
                '}';
    }

    public Ment getMent() {
        return ment;
    }

    public void setMent(Ment ment) {
        this.ment = ment;
    }

    public Staff(Integer pkId, String name, byte age, Date inDate, Integer bid, byte gender) {
        this.pkId = pkId;
        this.name = name;
        this.age = age;
        this.inDate = inDate;
        this.bid = bid;
        this.gender = gender;
    }

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age > 127) {
            this.age = 0;
        }else{
            this.age = age;
        }
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

}
