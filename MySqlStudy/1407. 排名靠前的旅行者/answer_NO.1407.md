```sql
SELECT
    u.NAME,
    IFNULL( sum( r.distance ), 0 ) travelled_distance
FROM
    Users u
        LEFT JOIN Rides r ON u.id = r.user_id
SELECT
    u.user_id buyer_id,
    u.join_date,
    COUNT( o.order_id ) orders_in_2019
FROM
    users u
        LEFT JOIN orders o ON u.user_id = o.buyer_id
        AND YEAR ( o.order_date ) = '2019'
GROUP BY
    u.user_id;
```
# 相关函数

### GROUP BY()
#### `GROUP BY()` 分组函数，后面可以接多个分组，用`,`号隔开
