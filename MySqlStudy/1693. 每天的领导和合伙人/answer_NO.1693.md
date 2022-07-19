```sql
SELECT
    user_id,
    count( DISTINCT follower_id ) AS followers_count
FROM
    Followers
GROUP BY
    user_id;
```
# 相关函数
### GROUP BY
#### `GROUP BY `语句用于结合聚合函数，根据一个或多个列对结果集进行分组,，可接多个字段。