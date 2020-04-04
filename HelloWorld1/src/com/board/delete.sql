select * from boards
where orig_no is null
and board_no =10
and writer = 'user1';

select count(*) as cnt from boards
where orig_no is null
and board_no =10
and writer = 'user1';

delete from boards where board_no = 13;

select count(*) as cnt from boards where orig_no = 1;

select count(*) as cnt from boards where orig_no is null and board_no=? and writer=?