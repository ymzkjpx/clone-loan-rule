DROP TABLE IF EXISTS ユーザーマスタ;
DROP SCHEMA IF EXISTS ユーザー CASCADE;
CREATE SCHEMA ユーザー;

CREATE TABLE ユーザー.ユーザーマスタ
(
    参加者番号 VARCHAR(36) PRIMARY KEY ,
    登録日時 TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);