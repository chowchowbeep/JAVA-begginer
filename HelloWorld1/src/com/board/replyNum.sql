


--
create or replace FUNCTION GET_REPLY_CNT(p_orig_no number)--매개값
RETURN NUMBER --리턴타입
AS 
  v_cnt number :=0;

BEGIN
  select count(*)
  into v_cnt
  from boards b
  where b.orig_no = p_orig_no;
  
  RETURN v_cnt; 
  
END GET_REPLY_CNT;




select get_reply_cnt(14)
from dual;

select count(*)
from boards b
where b.orig_no =14;

select board_no, title, content, writer, creation_date, orig_no,
  (select count(*) from boards where orig_no = b.board_no) as cnt  --댓글 갯수
from boards b;
