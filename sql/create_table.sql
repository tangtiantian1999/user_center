-- auto-generated definition
create table user
(
    id           bigint auto_increment
        primary key,
    username     varchar(256)                       null comment '⽤户昵
称',
    userAccount  varchar(256)                       null comment '账号',
    avatarUrl    varchar(1024)                      null comment '⽤户头
像',
    gender       tinyint                            null comment '性别',
    userPassword varchar(512)                       not null comment '密
码',
    email        varchar(512)                       null comment '邮箱',
    userStatus   int      default 0                 null comment '状态 0-
正常',
    phone        varchar(128)                       null comment '电话',
    createTime   datetime default CURRENT_TIMESTAMP null comment '创建时
间',
    updateTime   datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete     tinyint  default 0                 not null comment '是否删除',
    userRole     int      default 0                 null comment '用户角色 0 - 普通用户 1 - 管理员',
    planetCode   varchar(12)                        null comment '星球编号'
)
    comment '用户';

