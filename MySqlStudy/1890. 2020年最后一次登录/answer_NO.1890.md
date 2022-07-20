```sql
SELECT
    user_id,
    max( time_stamp ) last_stamp
FROM
    Logins
WHERE
    LEFT ( time_stamp, 4 ) = '2020'
GROUP BY
    user_id;
```

# 相关函数

### GROUP BY
#### `GROUP BY`语句用于结合聚合函数，根据一个或多个列对结果集进行分组。



