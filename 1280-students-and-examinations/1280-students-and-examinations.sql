# Write your MySQL query statement below

select stdu.student_id , stdu.student_name , sub.subject_name , count(ex.subject_name) as attended_exams
from students stdu
cross join subjects sub
left join examinations ex
on stdu.student_id = ex.student_id
and sub.subject_name = ex.subject_name
group by stdu.student_id , stdu.student_name , sub.subject_name
order by stdu.student_id , sub.subject_name


