```sql
SELECT
	p.firstName,
	p.lastName,
	a.city,
	a.state 
FROM
	Person p
	LEFT JOIN Address a ON p.personId = a.personId;
```
# 相关函数
### LEFT JOIN ON
#### 左连接，读取左边数据表的全部数据，即使右边表无对应数据，则为NULL。
