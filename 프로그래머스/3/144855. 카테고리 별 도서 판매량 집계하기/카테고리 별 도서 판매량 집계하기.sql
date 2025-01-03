SELECT b.CATEGORY, SUM(SALES) AS TOTAL_SALES
FROM BOOK b
JOIN BOOK_SALES bs
    ON b.BOOK_ID = bs.BOOK_ID
WHERE bs.SALES_DATE BETWEEN TO_DATE('2022-01-01', 'YYYY-MM-DD') 
    AND TO_DATE('2022-01-31', 'YYYY-MM-DD') 
GROUP BY b.CATEGORY
ORDER BY b.CATEGORY
;
