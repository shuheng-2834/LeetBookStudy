```sql
SELECT
    date_id,
    make_name,
    count( DISTINCT lead_id ) unique_leads,
    count( DISTINCT partner_id ) unique_partners
FROM
    DailySales
GROUP BY
    date_id,
    make_name;
```
# 相关函数
### GROUP BY
#### `GROUP BY `语句用于结合聚合函数，根据一个或多个列对结果集进行分组,，可接多个字段。