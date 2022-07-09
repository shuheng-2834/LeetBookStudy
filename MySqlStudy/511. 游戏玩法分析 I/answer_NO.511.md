```SQL
select
    player_id,min(event_date) as first_login
from
    Activity
group by player_id;
   ```

# 相关函数
### min() 
#### 取最小值