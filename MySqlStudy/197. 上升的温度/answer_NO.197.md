```SQL
select
    w.id
from
    Weather as w join Weather
on
    DATEDIFF(w.recordDate,Weather.recordDate) = 1  and w.temperature > Weather.temperature;
   ```

# 相关函数
### DATEDIFF() 
#### 返回相关两个日期相差的天数