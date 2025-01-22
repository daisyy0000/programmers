# 더이상 업그레이드 할수가 없다 
# 일단 루트 아이템 제거하고
SELECT II.ITEM_ID, II.ITEM_NAME, II.RARITY
FROM ITEM_INFO II
WHERE II.ITEM_ID NOT IN (
                            SELECT PARENT_ITEM_ID
                            FROM ITEM_TREE 
                            WHERE PARENT_ITEM_ID IS NOT NULL
                        )
ORDER BY II.ITEM_ID DESC
;
