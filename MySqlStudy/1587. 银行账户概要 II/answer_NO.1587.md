```sql
SELECT
    u.NAME,
    SUM( t.amount ) AS balance
FROM
    Transactions t
        LEFT JOIN Users u ON t.account = u.account
GROUP BY
    t.account
HAVING
    balance > 10000;
```
# 相关函数
### GROUP BY
#### `GROUP BY `语句用于结合聚合函数，根据一个或多个列对结果集进行分组。

### HAVING
#### `WHERE` 关键字无法与聚合函数一起使用,所以使用`HAVING`
##### 1.where在group by前， having在group by 之后
##### 2.聚合函数（avg、sum、max、min、count），不能作为条件放在where之后，但可以放在having之后

### SUM()
#### `SUM() `函数用来求和，与`count()`有区别