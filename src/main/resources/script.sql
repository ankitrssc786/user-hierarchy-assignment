
create table users (empid varchar(50) primary key, accesskey varchar(50), country varchar(50)) engine=MyISAM;
create table teamhierarchy (empid varchar(50), managerid varchar(50), foreign key (empid) references users(empid)) engine=MyISAM;
create table useraccess (empid varchar(50), accesskey varchar(50), country varchar(50), subuser varchar(50), subuseraccesskey varchar(50),
subusercountry varchar(50), foreign key (empid) references users(empid)) engine=MyISAM;

INSERT INTO users(empid,accesskey,country) values ('Miller', 'TRMLLR', 'SG');
INSERT INTO users(empid,accesskey,country) values ('Tessa', 'TRTSSA', 'SG');
INSERT INTO users(empid,accesskey,country) values ('Dosson', 'TRDSSN', 'HK');
INSERT INTO users(empid,accesskey,country) values ('Ricky', 'TRRCKY', 'SG');
INSERT INTO users(empid,accesskey,country) values ('Aaron', 'TRARON', 'SG');
INSERT INTO users(empid,accesskey,country) values ('Bob', 'TRBOB', 'HK');

INSERT INTO teamhierarchy(empid,managerid) values ('Tessa', 'Miller');
INSERT INTO teamhierarchy(empid,managerid) values ('Dosson', 'Miller');
INSERT INTO teamhierarchy(empid,managerid) values ('Ricky', 'Tessa');
INSERT INTO teamhierarchy(empid,managerid) values ('Aaron', 'Tessa');
INSERT INTO teamhierarchy(empid,managerid) values ('Bob', 'Dosson');