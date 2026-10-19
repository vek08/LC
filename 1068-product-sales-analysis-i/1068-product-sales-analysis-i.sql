# Write your MySQL query statement below
SELECT
    product_name,year,price
FROM
    product p
INNER JOIN
    sales s
ON
    p.product_id = s.product_id;
