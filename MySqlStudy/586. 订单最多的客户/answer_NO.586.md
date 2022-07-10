```SQL
select customer_number
from Orders
group by customer_number
order by count(customer_number) DESC
limit 1; 
   ```

# 相关函数
### count() 
#### 统计数量