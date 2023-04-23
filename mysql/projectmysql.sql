create database assignment;
use assignment;
create table salepeople(SNUM varchar(5) Primary Key, Sname char(20), city char(20), comm decimal(8,3));
drop table salepeople;
insert into salepeople values('1001','aman','sagar',0.12);
insert into salepeople values('1002','akshat','itava',0.08);
insert into salepeople values('1003','sahil','bhind',0.11);
insert into salepeople values('1004','tanishq','agar',0.7);
insert into salepeople values('1005','aayush','sagar',0.3);
show tables;



CREATE TABLE CUST(CNUM int(5) PRIMARY KEY,  CNAME CHAR(20),  CITY CHAR(20), RATING int(3),SNUM int(4));
insert into cust values(2001,'host','london',100,1001);
insert into cust values(2002,'ginovvane','paris',200,1002);
insert into cust values(2003,'liu','san jose',300,1003);
insert into cust values(2004,'antim','sagar',400,1004);
insert into cust values(2005,'sankee','sahaghar',500,1005);
insert into cust values(2006,'rimi','indore',600,1006);

CREATE TABLE ORDERS(ONUM int(5) PRIMARY KEY,  AMT decimal(5,2), ODATE Date, CNUM INT(4),SNUM INT(4));
INSERT INTO ORDERS VALUES ('3001','18.69','1994-10-03','2008','1007'); 
    INSERT INTO ORDERS VALUES ('3003','767.19','1994-10-04','2007','1001');  
    INSERT INTO ORDERS VALUES (3004,19.69,'1994-10-03',2009,1008); 
    INSERT INTO ORDERS VALUES (3005,768.19,'1994-10-04',2001,1009);  
    INSERT INTO ORDERS VALUES (3006,180.69,'1994-10-04',2002,1001); 
    INSERT INTO ORDERS VALUES (3007,76.19,'1994-10-04',2003,1002);  
    INSERT INTO ORDERS VALUES (3008,183.69,'1994-10-05',2004,1003); 
    INSERT INTO ORDERS VALUES (3009,67.19,'1994-10-05',2005,1004);  
    INSERT INTO ORDERS VALUES (3010,123.69,'1994-10-05',2006,1005); 
    INSERT INTO ORDERS VALUES (3011,167.19,'1994-10-05',2007,1006);  

SHOW TABLES;
SELECT * FROM CUST;
SELECT * FROM ORDERS;

#Display snum,sname,city and comm of all salespeople.
SELECT * FROM SALEPEOPLE;

#Display all snum without duplicates from all orders.
#USE: TO REMOVE DUPLICATE VALUES
SELECT distinct SNUM FROM ORDERS;

#Display names and commissions of all salespeople in london.
SELECT SNAME,COMM FROM SALEPEOPLE WHERE CITY = 'LONDON'; 

#All customers with rating of 100.
SELECT CNAME FROM CUST WHERE RATING = '100';

#Produce orderno, amount and date form all rows in the order table.
SELECT ONUM,AMT,ODATE FROM ORDERS;

#All customers in San Jose, who have rating more than 200
SELECT CNAME FROM CUST WHERE CITY = "SAN JOSE" AND RATING = "200";

#All customers who were either located in San Jose or had a rating above 200.
SELECT CNAME FROM CUST WHERE CITY = 'SAN JOSE' OR RATING>200;  

#All orders for more than $1000.
SELECT ONUM FROM ORDERS WHERE AMT>1000;

#Names and citires of all salespeople in london with commission above 0.10.
SELECT SNAME FROM SALEPEOPLE WHERE CITY = "LONDON" AND COMM>0.10;

#All customers excluding those with rating < = 100 unless they are located in Rome.
SELECT CNAME FROM CUST WHERE RATING >100 OR CITY="ROME";

#All salespeople either in Barcelona or in london.
SELECT SNAME FROM SALEPEOPLE WHERE CITY ="BARCELONA" OR "LONDON";

#All salespeople with commission between 0.10 and 0.12. (Boundary values should be excluded)
SELECT SNAME FROM SALEPEOPLE WHERE COMM>0.10 AND COMM<0.12;

#All customers with NULL values in city column.
SELECT CNAME FROM CUST WHERE CITY="NULL";

#All orders taken on Oct 3Rd and Oct 4th 1994.
SELECT * FROM ORDERS WHERE ODATE IN ("1994-10-03","1994-10-04");

#All customers serviced by peel or Motika
select cname from cust,orders where orders.cnum = cust.cnum
and orders.snum in (select snum from salepeople where Sname = 'peel'and'motika');

#All customers whose names begin with a letter from A to B.
select cname from cust where cname like "a%" or "b%" ;

#All customers whose names begin with a letter from A to B.
select * from orders where amt="0" or "null";

#Count the number of salespeople currently listing orders in the order table
select count(distinct snum) from salepeople;

#Largest order taken by each salesperson, datewise.
select  odate,snum, max(amt) from orders group by odate,snum order by odate,snum; 

#Largest order taken by each salesperson with order value more than $3000.
select snum from orders where amt>3000;

#Which day had the hightest total amount ordered.
select odate,amt,snum,cnum
from orders 
where amt = (select max(amt) from orders);

#count all orders for Oct 3rd.
select count(*) from orders where odate="1994-10-03";

#Count the number of different non NULL city values in customers table.
select count(distinct city) from cust;

#Select each customer’s smallest order.
select onum, min(amt)
from orders
group by onum,amt
order by onum,amt;

#First customer in alphabetical order whose name begins with G.
select cname from cust where cname like "g%";

#Get the output like "For dd/mm/yy there are_orders.
select odate,onum,
case
when odate then "there are"+onum
end as are_order
from orders;

#Assume that each salesperson has a 12% commission. Produce order no., salesperson no., and amount of salesperson’s commission for that order.
select onum,snum,amt,amt*0.12 from orders order by snum; 

#Find highest rating in each city. Put the output in this form. For the city (city), the highest rating is : (rating).
select city,max(rating) from cust group by city order by max(rating);

#Display the totals of orders for each day and place the results in descending order.
select odate, count(onum) from orders group by odate order by count(onum);

#All combinations of salespeople and customers who shared a city. (ie same city )
Select sname, cname from salepeople, cust where salepeople.city = cust.city; 

#Name of all customers matched with the salespeople serving them.
select sname,cname from salepeople,cust where salepeople.sname = cust.cname;

#List each order number followed by the name of the customer who made the order.
select cname,onum from orders,cust where orders.cnum = cust.cnum;

#Names of salesperson and customer for each order after the order number.
select onum,sname,cname from orders,salepeople,cust where orders.snum = salepeople.snum and orders.cnum = cust.cnum;

#Produce all customer serviced by salespeople with a commission above 12%.
select sname,cname from salepeople,cust where comm>100*0.12;

#Calculate the amount of the salesperson’s commission on each order with a rating above 100.
select comm,sname,rating from salepeople,cust where salepeople.snum = cust.snum and rating>100;

#Find all pairs of customers having the same rating.
#alias concept use
select a.cname,b.cname,a.rating from cust a, cust b where a.rating = b.rating and a.cnum != b.cnum;

#Policy is to assign three salesperson to each customers. Display all such combinations.
Select a.cname, b.cname,a.rating from cust a, cust b where a.rating = b.rating and a.cnum != b.cnum and a.cnum <> b.cnum; 

#Find all pairs of customers served by single salesperson.
select cname,sname from cust,salepeople where cust.snum = salepeople.snum;

#Produce all pairs of salespeople which are living in the same city. Exclude combinations of salespeople with themselves as well as duplicates with the order reversed.
select cname from cust where snum in (select snum from cust group by snum having count(snum)>1);
select distinct a.cname from cust a, cust b where a.snum=b.snum and a.rowid != b.rowid;

#Produce names and cities of all customers with the same rating as Hoffman.
select * from cust where rating=100;

#Extract all the orders of Motika.
select onum from orders where snum = (select snum from salepeople where sname="motika");
select onum from orders where snum = 1004; 

#All orders credited to the same salesperson who services Hoffman.
select onum from orders where snum = (select snum from cust where cname = "host");

#All orders that are greater than the average for Oct 4.
select onum from orders where odate>"1994-10-04";

#Find average commission of salespeople in london.
select count(sname) from salepeople where city = "london";

#Find all orders attributed to salespeople servicing customers in london.
select snum from cust where city="london";
select onum from orders where snum = (select snum from cust where city="london");

#Extract commissions of all salespeople servicing customers in London.
select comm from salepeople where snum =(select snum from cust where city= "london");

#Find average commission of salespeople in london.
select avg(comm) from salepeople where city = "london";

#Find all customers whose cnum is 1000 above the snum of serres.
Select cnum, cname from cust where cnum > ( select snum+1000  from salepeople where sname = 'akshat');

#Count the customers with rating above San Jose’s average.
Select cnum, rating from cust where rating > ( select avg(rating)  from cust where city = 'San Jose'); 