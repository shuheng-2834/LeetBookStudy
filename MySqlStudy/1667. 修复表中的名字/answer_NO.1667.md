```sql
SELECT
    user_id,
    concat(
            upper(
                    LEFT ( NAME, 1 )),
            lower(
                    RIGHT ( NAME, length( NAME )- 1 ))) AS NAME
FROM
    Users
ORDER BY
    user_id;
```

# 相关函数

### concat()
#### `concat() `函数用于拼接两个字符串

### upper()
#### `upper()` 函数用于将字符串转换为大写

### lower()
#### `lower()` 函数用于将字符串转换为小写

### LEFT()
#### `LEFT()` 截取字符串，从左边开始截取

### RIGHT()
#### `RIGHT()` 截取字符串，从右边开始截取



