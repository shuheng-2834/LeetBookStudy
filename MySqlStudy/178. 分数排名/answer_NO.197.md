```sql
select
    s1.score as score,dense_rank() over(order by s1.score desc) as 'rank'
from Scores as s1;
```
# 相关函数
### rank() over(业务逻辑)
#### 排名不连续，条件相同排名相同，并列 如 1 1 3 4 4 6 7

### dense_rank() over(业务逻辑)
#### 排名连续，条件相同排名相同，并列 如 1 1 2 3 4 4 5 6

### row_number() over(业务逻辑)
#### 排名连续，相同分数排名不并列 如 1 2 3 4 5 6


##### *over()里面的业务逻辑不局限于order by*
