INSERT INTO tbl_board(bno, title, CONTENT, writer, regdate, updatedate)
(SELECT 
    seq_board.nextval, title, CONTENT, writer, regdate, updatedate
FROM
    tbl_board);

commit;

SELECT COUNT(*) FROM TBL_BOARD;

SELECT * FROM tbl_board ORDER BY bno DESC;

SELECT /*+ INDEX_DESC(tbl_board pk_board) */ *
FROM tbl_board
WHERE bno>0;

SELECT /*+ FULL(tbl_board) */ *
FROM tbl_board
ORDER BY bno DESC;

select *
from (
        select /*+ INDEX_DESC(tbl_board pk_board) */ 
            rownum rn, bno, title, content, writer, regdate, updatedate
        from
            tbl_board
        where
            (title like '%테스트%' or content like '%테스트%')
            and rownum <= 20
        )
where rn > 10;