```sql
SELECT ifnull(
    ( SELECT DISTINCT salary AS SecondHighestSalary FROM Employee ORDER BY salary DESC LIMIT 1, 1 )
    ,NULL 
	) AS SecondHighestSalary
```
### OR
```sql
SELECT max( e.salary ) AS SecondHighestSalary FROM Employee AS e,( SELECT max( salary ) AS salary FROM Employee ) AS s
WHERE
    s.salary <> e.salary;
```
# 相关函数
### MAX()
#### 取最大值
