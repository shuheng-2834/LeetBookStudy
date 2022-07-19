```sql
SELECT
    activity_date AS DAY,
	count( DISTINCT user_id ) AS active_users
FROM
    Activity
WHERE
    activity_date BETWEEN '2019-06-28'
  AND '2019-07-27'
GROUP BY
    activity_date;
```
# 相关函数
### GROUP BY
#### `GROUP BY `语句用于结合聚合函数，根据一个或多个列对结果集进行分组。

### BETWEEN AND
#### `BETWEEN AND `语句用于限制范围。
