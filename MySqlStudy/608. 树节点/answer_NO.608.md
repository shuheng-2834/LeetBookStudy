##### 方法1
```SQL
SELECT
    id,
    CASE
        WHEN t.p_id IS NULL THEN
            'Root'
        WHEN t.id IN ( SELECT p_id FROM tree ) THEN
            'Inner' ELSE 'Leaf'
        END AS type
FROM
    tree t;
   ```

# 相关函数
### CASE WHEN THEN
#### `CASE WHEN THEN`