# Write your MySQL query statement below

select c1.name
from customer c1
left join customer c2
on c1.referee_id = c2.id
where c2.id <> 2
or c2.id is null;