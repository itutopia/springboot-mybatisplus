SQL 练习集锦- 一篇文章学会SQL
---------------

SQL基础
    SQL引擎:
        SQL->词法分析->语法分析->逻辑计划->物理计划->数据文件
    select * from tb_user  where userid >10;
    抽象语法树
  




SQL高级
SQL查询的顺序:
1. FROM/JOIN和所有的ON条件
2. WHERE
3. GROUP BY
4. HAVING
5. SELECT (包括窗口函数)
6. ORDER BY
7. LiMIT

1. SQL数据类型隐式转换:SQL中布尔值会自动转化为1或0;
select "0"=0;   -->  result:1;
业务应用: 
分别统计每名学生成绩在90分以上的科目数量和总科目数量,然后相除得到占比;
SELECT uid, avg(score>=90) FROM score GROUP BY uid; 
在每名学生的分组中,条件判断score>=90返回一组0或1的结果,对这组0/1取值求均值操作.即等价于求成绩>=90的科目占比;

2.巧妙运用if函数和null;
null值两大特性:
A. 任何值与null的任何计算都会得到null值;
B. 任何聚合函数中,null值都参与计算(例如: count计数就是查询null以外的结果数量)

业务应用:
统计每名学生成绩在80分以上的成绩的平均值;-> 如果成绩>=80则参与计算,否则不参加;
SELECT uid, avg(if(score>=80), score,null) FROM score GROUP BY uid;
首先通过if函数衍生一个临时字段(if(score>=80, score,null)) 其取值为: 成绩>=80时取成绩值.否则置位null,相当于
仅保留了成绩在80分以上的记录; 而后嵌套一层avg函数即直接实现了计算80分以上平均值的效果.


SQL实战:

#### SQL优化:
#### 1.场景: cont(*) 判空优化: 
#### SQL
SELECT count(*) FROM table WHERE a=1 and b=2
#### Java
int nums = xxDao.countXxByXxx(params);
if(nums>0){
    // 当存在时,执行这里的代码
}else{
    // 当不存在时,执行这里的代码
}
#### 优化方案:
SELECT 1 FROM table WHERE a= 1 and b=2 LIMIT 1
##### Java
Integer exist = xxDao.existXxxByXxx(params);
if(exist != null){
// 当存在时,执行这里的代码
}else{
// 当不存在时,执行这里的代码
}



