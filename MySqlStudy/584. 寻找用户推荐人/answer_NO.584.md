##### 方法1
```SQL
select name 
from customer 
where id not in 
      (select id from customer where referee_id = 2);
   ```
##### 方法2
```SQL
select name 
from customer 
where ifnull(referee_id,0) <> 2;
   ```

# 相关函数
### IFNULL(arg1,arg2)
#### 如果`arg1`的值为`NULL`的话，则将其替换为`arg2`
### NOT IN
#### 