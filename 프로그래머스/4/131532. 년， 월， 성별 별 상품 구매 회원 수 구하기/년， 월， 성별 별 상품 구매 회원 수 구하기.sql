-- 코드를 입력하세요
SELECT
    EXTRACT(YEAR FROM SALES_DATE) AS YEAR,
    EXTRACT(MONTH FROM SALES_DATE) AS MONTH,
    UI.GENDER,
    COUNT(DISTINCT(UI.USER_ID)) AS USERS
FROM USER_INFO UI
INNER JOIN ONLINE_SALE OS ON UI.USER_ID = OS.USER_ID
WHERE UI.GENDER IS NOT NULL
GROUP BY EXTRACT(YEAR FROM SALES_DATE),EXTRACT(MONTH FROM SALES_DATE), UI.GENDER
ORDER BY EXTRACT(YEAR FROM SALES_DATE) ASC,EXTRACT(MONTH FROM SALES_DATE) ASC, UI.GENDER ASC
