##### 方法1
```SQL
select s.`name`
from
    salesperson as s
where sales_id not in 
      (select o.sales_id 
       from Orders  as o JOIN Company as c  
           ON o.com_id = c.com_id 
       where c.`name` = 'RED');
   ```
##### 方法2
```SQL
select s.`name`
from
    salesperson as s
where sales_id not in 
      (select sales_id 
       from orders 
       where com_id in 
             (select com_id 
              from company 
              where name ='RED'));
   ```

# 相关函数
### JOIN ON
### NOT IN
#### 