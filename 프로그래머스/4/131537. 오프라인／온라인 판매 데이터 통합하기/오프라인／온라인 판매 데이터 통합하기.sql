SELECT *
FROM
(SELECT TO_CHAR(SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE
, PRODUCT_ID
, USER_ID
, SALES_AMOUNT
FROM ONLINE_SALE
WHERE TO_CHAR(SALES_DATE, 'YYYYMM') = '202203'
UNION ALL
SELECT TO_CHAR(SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE
, PRODUCT_ID
, NULL AS USER_ID
, SALES_AMOUNT
FROM OFFLINE_SALE
WHERE TO_CHAR(SALES_DATE, 'YYYYMM') = '202203'
)
ORDER BY SALES_DATE ASC, PRODUCT_ID ASC, USER_ID ASC