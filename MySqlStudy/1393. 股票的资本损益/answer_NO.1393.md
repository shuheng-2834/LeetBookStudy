```sql
SELECT
    stock_name,
    sum(
            IF
                ( operation = 'Buy',- price, price )) capital_gain_loss
FROM
    Stocks
GROUP BY
    stock_name;
```
# 相关函数
### SUM()
#### `SUM() `求和函数

### IF()
#### `IF()` 类似于三目运算符，`IF('条件','结果T','结果F')`
