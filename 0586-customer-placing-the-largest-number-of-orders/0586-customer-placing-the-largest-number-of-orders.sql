# Write your MySQL query statement below


select customer_number 
from 
(select customer_number , count(*) as cnt
from orders
group by customer_number) as x
where cnt = (select max(cnt) from (select customer_number , count(*) as cnt
from orders
group by customer_number) as y)




