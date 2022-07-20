```sql
SELECT
    event_day DAY,
    emp_id,
    sum( out_time - in_time ) total_time
FROM
    Employees
GROUP BY
    emp_id,
    event_day;
```

# 相关函数

### GROUP BY
#### `GROUP BY`语句用于结合聚合函数，根据一个或多个列对结果集进行分组。



