drop table item;
create table item (
   id number primary key,
   name varchar2(30),
   price number,
   description varchar2(100),
   pictureUrl varchar2(30)
);
insert into item values (1, '����', 50,  '���� ���Ե� �������� �Ƿ�ȸ���� �����ϴ�.   ��Ÿ��C �� ǳ���մϴ�.','lemon.jpg');
insert into item values (2, '������', 100, '��Ÿ��C �� ǳ���մϴ�. ���� �����ϴ�.','orange.jpg');
insert into item values (3, 'Ű��', 200,  '��Ÿ��C �� ǳ���մϴ�. ���̾�Ʈ�� �����ϴ�.','kiui.jpg');
insert into item values (4, '����', 300,  '��������� �ٷ� �����ϰ� �־� �׻�ȭ �ۿ��� �մϴ�.',  'podo.jpg');
insert into item values (5, '����', 800,  '��Ÿ��C�� �ٷ� �����ϰ� �ֽ��ϴ�.',  'ichigo.jpg');
insert into item values (6, '��', 1000,  '�ó��Ǹ��� �ٷ� �����ϰ� �־� ���⿹�濡 �����ϴ�.',  'mikan.jpg');   

commit;

select * from item;