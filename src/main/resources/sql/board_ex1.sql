drop table if exists board_tbl;

create table board_tbl(
	bno int auto_increment primary key,
    title varchar(300) not null,
    content text not null,
    writer varchar(50) not null,
    regDate timestamp default current_timestamp,
    updateDate timestamp default current_timestamp
);

insert into board_tbl(title,content,writer) value ('게시물입니다 ','내용입니다','작성자');
insert into board_tbl(title,content,writer) value ('게시물입니다2 ','내용입니다2','작성자2');
insert into board_tbl(title,content,writer) value ('게시물입니다3 ','내용입니다3','작성자3');
insert into board_tbl(title,content,writer) value ('게시물입니다4 ','내용입니다4','작성자4');