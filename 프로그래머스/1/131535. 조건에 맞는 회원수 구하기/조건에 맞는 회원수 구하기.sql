SELECT COUNT(*) AS USERS
FROM USER_INFO
WHERE JOINED BETWEEN TO_DATE('2021-01-01', 'yyyy-mm-dd')
    AND TO_DATE('2021-12-31', 'yyyy-mm-dd')
AND AGE BETWEEN 20 AND 29