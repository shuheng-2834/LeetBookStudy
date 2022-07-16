```sql
SELECT
    e.employee_id
FROM
    Employees AS e
        LEFT JOIN Salaries AS s ON e.employee_id = s.employee_id
WHERE
    s.salary IS NULL UNION
SELECT
    s.employee_id
FROM
    Employees AS e
        RIGHT JOIN Salaries AS s ON e.employee_id = s.employee_id
WHERE
    e.NAME IS NULL
ORDER BY
    employee_id;
```

# 相关函数

### UNION
#### `UNION `并集



