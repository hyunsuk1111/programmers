-- 코드를 작성해주세요
SELECT 
    IT.ITEM_ID AS ITEM_ID,
    II.ITEM_NAME
FROM ITEM_INFO II 
INNER JOIN ITEM_TREE IT ON II.ITEM_ID = IT.ITEM_ID
    AND IT.PARENT_ITEM_ID IS NULL
ORDER BY II.ITEM_ID ASC;