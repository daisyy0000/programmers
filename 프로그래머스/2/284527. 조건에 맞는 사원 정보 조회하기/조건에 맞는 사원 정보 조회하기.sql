SELECT S.SCORE AS SCORE, S.EMP_NO, HE.EMP_NAME, HE.POSITION, HE.EMAIL
FROM (SELECT EMP_NO, SUM(SCORE) AS SCORE
      FROM HR_GRADE
      GROUP BY EMP_NO
      ORDER BY SCORE DESC
      LIMIT 1) S
JOIN HR_EMPLOYEES HE
ON S.EMP_NO = HE.EMP_NO;