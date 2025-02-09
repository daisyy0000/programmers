SELECT ED3.ID
FROM ECOLI_DATA ED1
JOIN ECOLI_DATA ED2 ON ED2.PARENT_ID = ED1.ID
JOIN ECOLI_DATA ED3 ON ED3.PARENT_ID = ED2.ID
WHERE ED1.PARENT_ID IS NULL
ORDER BY ED3.ID;