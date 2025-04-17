



how to create the database

drop database if exist papas_pizzeria;
create database papas_pizzeria;
use database papas_pizzeria;

create table customer (id int(3) not null auto_increment, email varchar(30) not null, password varchar(256) not null, name varchar(30) not null, surname varchar(30) not null, primary key (id));

create table profile (id int(3) not null auto_increment, street varchar(30) number int(3), town varchar(30), zip int(5), floor int(2), phone varchar(10), primary key (id), foreign key (id) references customer(id));


create table order_queue (order_no int(5) not null auto_increment, q_one int(2), q_two int(2), q_three int(2), q_four int(2), q_five int(2), primary key (order_no));
