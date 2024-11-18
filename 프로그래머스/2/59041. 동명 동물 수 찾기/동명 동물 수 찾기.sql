SELECT NAME, COUNT(*) AS COUNT
FROM ANIMAL_INS 
WHERE NAME IS NOT NULL
GROUP BY NAME
HAVING COUNT(*) > 1
ORDER BY NAME
;