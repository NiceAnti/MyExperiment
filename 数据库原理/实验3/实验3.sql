select * from s_test.student
select * from s_test.course
select * from sc

1.	��ѯѧ�����е�ѧ�ź�����
select sno,sname from s_test.student


2.	��ѯ����ѧ��ѡ�޵Ŀγ̵Ŀγ̺�
select c.cno from s_test.course c , sc ,s_test.student s
where c.cno = sc.cno and s.sno = sc.sno


3.	��ѯѧ��Ϊ3�Ŀγ̵Ŀγ̺źͿγ���
select cno,cname from s_test.course where credit =3

4.	��ѯѧ��Ϊ3�����пκ�Ϊ001�Ŀγ̵Ŀγ̺źͿγ���
select cno,cname from s_test.course where credit = 3 and pcno = 001

5.	��ѯ������19-21��֮���Ů���Ļ�����Ϣ
select * from s_test.student where sex = 'Ů' and dept between 20 and 30

6.	��ѯѡ���˿γ�002�ҳɼ���80-90֮���ѧ����ѧ��

select sno from s_test.student where sno = ( select sno from sc where cno = 002 and grade between 80 and 90)

7.	��ѯ���ջ�����ѧ����ѧ�š��������Ա�
select sname,sno,sex from s_test.student where sname like '��%' or sname like '��%'

8.	���������а����������ֵ�ѧ����ѧ�ź�����
select sname,sno from s_test.student where sname like '%��%'


9.	���������е�����2�����ǡ��ơ���ѧ����ѧ�ź�����
select sname,sno from s_test.student where sname like '%��_'


10.	���ҿγ����ԡ�����_����ͷ�Ŀγ̵Ŀγ̺š��γ���
select cno,cname from s_test.course where cname like '����%'

11.	ʹ��inν���������Ϊ17��19��21��ѧ����ѧ�š��������Ա�
select sno,sname,sex from s_test.student where dept in (17,19,21)

12.	�������ѧ�����н������У�������ͬ�İ������������У�
select * from s_test.student order by age  desc,sname asc

13.	ͳ��ѧ���ĸ���
select COUNT(*) from s_test.student

14.	ͳ�������ĸ���
select COUNT(*) from s_test.student where sex = '��'


15.	ͳ����ϢԺŮ���ĸ���
select COUNT(*) from s_test.student where sex = 'Ů' and dept = '��ϢԺ'

16.	ͳ��ѡ���˿γ̵�ѧ������
select COUNT(*) from s_test.course c , sc ,s_test.student s
where c.cno = sc.cno and s.sno = sc.sno


17.	ͳ��001�γ̵��ܷ���
select SUM(grade) from sc where cno = 001

18.	ͬʱͳ�Ƴ��γ������������пεĿγ�������û�����пεĿγ�����

select COUNT(*) as �γ�����,COUNT(CASE WHEN pcno='' then 1  end) as û�����п�, COUNT(CASE WHEN pcno!='' then 1  end) as �����п� from s_test.course

select * from s_test.course

19.	���Լ������2����ѯ��
select * from s_test.student where age >18

select * from s_test.student where age <21