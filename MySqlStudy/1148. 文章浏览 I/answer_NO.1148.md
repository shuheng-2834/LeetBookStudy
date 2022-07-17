```sql
SELECT DISTINCT
    author_id AS id
FROM
    Views
WHERE
    author_id = viewer_id
ORDER BY
    author_id;
```
# 相关函数
### ORDER BY
#### `ORDER BY`升序排序