select * from s_test.student
select * from s_test.course
select * from sc

1.	查询学生表中的学号和姓名
select sno,sname from s_test.student


2.	查询已有学生选修的课程的课程号
select c.cno from s_test.course c , sc ,s_test.student s
where c.cno = sc.cno and s.sno = sc.sno


3.	查询学分为3的课程的课程号和课程名
select cno,cname from s_test.course where credit =3

4.	查询学分为3或先行课号为001的课程的课程号和课程名
select cno,cname from s_test.course where credit = 3 and pcno = 001

5.	查询年龄在19-21岁之间的女生的基本信息
select * from s_test.student where sex = '女' and dept between 20 and 30

6.	查询选修了课程002且成绩在80-90之间的学生的学号

select sno from s_test.student where sno = ( select sno from sc where cno = 002 and grade between 80 and 90)

7.	查询王姓或李姓学生的学号、姓名、性别
select sname,sno,sex from s_test.student where sname like '王%' or sname like '李%'

8.	查找姓名中包含“虎”字的学生的学号和姓名
select sname,sno from s_test.student where sname like '%虎%'


9.	查找姓名中倒数第2个字是“云”的学生的学号和姓名
select sname,sno from s_test.student where sname like '%云_'


10.	查找课程名以“数据_”开头的课程的课程号、课程名
select cno,cname from s_test.course where cname like '数据%'

11.	使用in谓词年龄查找为17、19、21的学生的学号、姓名、性别
select sno,sname,sex from s_test.student where dept in (17,19,21)

12.	按年龄对学生进行降序排列，年龄相同的按姓名升序排列；
select * from s_test.student order by age  desc,sname asc

13.	统计学生的个数
select COUNT(*) from s_test.student

14.	统计男生的个数
select COUNT(*) from s_test.student where sex = '男'


15.	统计信息院女生的个数
select COUNT(*) from s_test.student where sex = '女' and dept = '信息院'

16.	统计选修了课程的学生人数
select COUNT(*) from s_test.course c , sc ,s_test.student s
where c.cno = sc.cno and s.sno = sc.sno


17.	统计001课程的总分数
select SUM(grade) from sc where cno = 001

18.	同时统计出课程门数、有先行课的课程门数、没有先行课的课程门数

select COUNT(*) as 课程门数,COUNT(CASE WHEN pcno='' then 1  end) as 没有先行课, COUNT(CASE WHEN pcno!='' then 1  end) as 有先行课 from s_test.course

select * from s_test.course

19.	（自己构造出2个查询）
select * from s_test.student where age >18

select * from s_test.student where age <21