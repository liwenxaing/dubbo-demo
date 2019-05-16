-- 部门表操作
  --  查询到所有部门 【前后台模块共用】
  SELECT bid,bname,logical_deletion FROM ment;
  --  根据ID删除一个部门
  UPDATE ment SET logical_deletion = 1 WHERE  bid = 1
  --  保存一个部门信息
  INSERT INTO ment (bid,bname,logical_deletion) VALUES (1004,"会计部",0)
  --  查询当前这个部门下有所有的员工信息
  SELECT m.bname,s.pk_id,m.logical_deletion,s.name,s.gender,s.bid,s.age FROM ment m,staff s WHERE m.bid = s.bid AND m.bid = 1001
-- 员工表操作
  --  查询所有员工信息
  SELECT m.bname,s.pk_id,s.name,s.gender,s.bid,s.age FROM ment m,staff s WHERE m.bid = s.bid;
  --  根据id查询一个员工的信息
  SELECT s.pk_id,s.name,s.gender,s.bid,s.age FROM staff s WHERE pk_id = 1 LIMIT 1
  --  添加一个员工
  INSERT INTO staff (name,age,in_date,bid,gender) VALUES ("火龙谷",20,NOW(),1002,0)