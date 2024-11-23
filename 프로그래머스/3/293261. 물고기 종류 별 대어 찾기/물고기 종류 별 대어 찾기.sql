SELECT FI.ID, A.FISH_NAME, FI.LENGTH
FROM FISH_INFO FI
JOIN (
    SELECT FI.FISH_TYPE, MAX(FI.LENGTH) AS LENGTH, FNI.FISH_NAME
    FROM FISH_INFO FI
    JOIN FISH_NAME_INFO FNI
    ON FI.FISH_TYPE = FNI.FISH_TYPE
    GROUP BY FI.FISH_TYPE, FNI.FISH_NAME
) A
ON FI.FISH_TYPE = A.FISH_TYPE AND FI.LENGTH = A.LENGTH
ORDER BY FI.ID;