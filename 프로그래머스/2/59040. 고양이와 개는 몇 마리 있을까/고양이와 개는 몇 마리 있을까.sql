SELECT ANIMAL_TYPE, count(*)
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY count(*)
;


