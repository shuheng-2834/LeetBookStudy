```sql
SELECT
    a.customer_id,
    COUNT( a.visit_id ) AS count_no_trans
FROM
    (
        SELECT DISTINCT
            v.*
        FROM
            Visits v
        WHERE
            (
                v.visit_id NOT IN ( SELECT visit_id FROM Transactions ))) AS a
GROUP BY
    a.customer_id;
```

OR
```sql
SELECT
    v.customer_id,
    COUNT( v.visit_id ) AS count_no_trans
FROM
    Visits v
        LEFT JOIN transactions t ON v.visit_id = t.visit_id
WHERE
    t.transaction_id IS NULL
GROUP BY
    customer_id;
```
# 相关函数
### GROUP BY
#### `GROUP BY `语句用于结合聚合函数，根据一个或多个列对结果集进行分组。

### HAVING
#### `WHERE` 关键字无法与聚合函数一起使用,所以使用`HAVING`
##### 1.where在group by前， having在group by 之后
##### 2.聚合函数（avg、sum、max、min、count），不能作为条件放在where之后，但可以放在having之后

