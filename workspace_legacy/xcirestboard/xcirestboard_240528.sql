select * from tbl_reply;

insert into tbl_reply(rno, bno, reply, replyer)
values (seq_reply.nextval, 2621446, '´ñ±Û µî·Ï', 'user00');

commit;

create index idx_reply on tbl_reply (bno desc, rno asc);

select /*+INDEX(tbl_reply idx_reply)*/
    rownum rn, bno, rno, reply, replyer, replyDate, updatedate
from tbl_reply
where bno = 2621446
and rno > 0;

select * from tbl_board;