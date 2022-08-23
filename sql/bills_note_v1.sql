create table bills_note_v1
(
	id int auto_increment comment '主键id',
	inout_type int not null comment '收支类型',
	amount decimal not null comment '金额',
	record_time datetime not null comment '记录时间',
	remark varchar(255) not null comment '记录人',
	unique_identifier varchar(32) not null comment '唯一标识符',
	constraint bills_note_v1_pk
		primary key (id)
)
comment '月度流水账单';

create unique index bills_note_v1_unique_identifier_uindex
	on bills_note_v1 (unique_identifier);

