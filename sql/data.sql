-- 테이블 생성 SQL - User
CREATE TABLE User
(
    `userId`        BIGINT          NOT NULL    AUTO_INCREMENT COMMENT '사용자아이디',
    `userName`      VARCHAR(45)     NOT NULL    COMMENT '닉네임',
    `userPassword`  VARCHAR(45)     NOT NULL    COMMENT '비밀번호',
    `profileImage`  VARCHAR(255)    NULL        COMMENT '프로필이미지',
    `userEmail`     VARCHAR(45)     NOT NULL    COMMENT '이메일',
    `region`        VARCHAR(30)     NOT NULL    COMMENT '지역',
    `addressDetail` VARCHAR(255)    NOT NULL    COMMENT '상세주소',
    `createdAt`     DATETIME        DEFAULT CURRENT_TIMESTAMP    COMMENT '가입날짜',
    `mbti`          VARCHAR(4)      NULL        COMMENT 'mbti',
    `score`         INT           DEFAULT 50   COMMENT '사용자점수',
    `out`          TINYINT(1)       DEFAULT 0    COMMENT '탈퇴여부',
    PRIMARY KEY (userId)
);

-- Unique Index 설정 SQL - User(userEmail)
CREATE UNIQUE INDEX UQ_User_1
    ON User(userEmail);

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
-- 테이블 생성 SQL - Post
CREATE TABLE Post
(
    `userId`     BIGINT         NOT NULL    COMMENT '작성자아이디',
    `region`     VARCHAR(30)    NOT NULL    COMMENT '거래지역',
    `title`      VARCHAR(45)    NOT NULL    COMMENT '제목',
    `content`    TEXT           NOT NULL    COMMENT '내용',
    `createdAt`  DATETIME       NOT NULL    COMMENT '생성일자',
    `updateAt`   DATETIME       NOT NULL    COMMENT '수정일자',
    `postNum`    BIGINT         NOT NULL    AUTO_INCREMENT COMMENT '게시글번호',
    `countNum`   BIGINT         NOT NULL    COMMENT '조회수',
    `postType`   INT            NOT NULL    COMMENT '게시글타입',
    PRIMARY KEY (postNum)
);

-- Foreign Key 설정 SQL - Post(userId, region, mbti) -> User(userId, region, mbti)
ALTER TABLE Post
    ADD CONSTRAINT FK_Post_userId_User_userId FOREIGN KEY (userId, region)
        REFERENCES User (userId, region) ON DELETE RESTRICT ON UPDATE RESTRICT;

-- Foreign Key 삭제 SQL - Post(userId, region, mbti)
-- ALTER TABLE Post
-- DROP FOREIGN KEY FK_Post_userId_User_userId;

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
-- 테이블 생성 SQL - Reply
CREATE TABLE Reply
(
    `userId`      BIGINT        NOT NULL    COMMENT '댓글아이디',
    `comment`     TEXT          NOT NULL    COMMENT '내용',
    `createdAt`   DATETIME      NOT NULL    COMMENT '생성일자',
    `updateSt`    TINYINT(1)    NOT NULL    COMMENT '수정여부',
    `commentNum`  BIGINT        NOT NULL    AUTO_INCREMENT COMMENT '댓글번호',
    `postNum`     BIGINT        NOT NULL    COMMENT '게시글번호',
    PRIMARY KEY (commentNum)
);

-- Foreign Key 설정 SQL - Reply(userId) -> User(userId)
ALTER TABLE Reply
    ADD CONSTRAINT FK_Reply_userId_User_userId FOREIGN KEY (userId)
        REFERENCES User (userId) ON DELETE RESTRICT ON UPDATE RESTRICT;

-- Foreign Key 삭제 SQL - Reply(userId)
-- ALTER TABLE Reply
-- DROP FOREIGN KEY FK_Reply_userId_User_userId;

-- Foreign Key 설정 SQL - Reply(postNum) -> Post(postNum)
ALTER TABLE Reply
    ADD CONSTRAINT FK_Reply_postNum_Post_postNum FOREIGN KEY (postNum)
        REFERENCES Post (postNum) ON DELETE RESTRICT ON UPDATE RESTRICT;

-- Foreign Key 삭제 SQL - Reply(postNum)
-- ALTER TABLE Reply
-- DROP FOREIGN KEY FK_Reply_postNum_Post_postNum;


ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
-- 테이블 생성 SQL - Product
CREATE TABLE Product
(
    `productId`     BIGINT          NOT NULL    AUTO_INCREMENT COMMENT '상품아이디',
    `price`         VARCHAR(45)     NOT NULL    COMMENT '상품가격',
    `productImage`  VARCHAR(300)    NULL        COMMENT '상품이미지',
    `postNum`       BIGINT          NOT NULL    COMMENT '게시글번호',
    `categoryId`    BIGINT          NOT NULL    COMMENT '카테고리아이디',
    PRIMARY KEY (productId)
);

-- Foreign Key 설정 SQL - Product(postNum) -> Post(postNum)
ALTER TABLE Product
    ADD CONSTRAINT FK_Product_postNum_Post_postNum FOREIGN KEY (postNum)
        REFERENCES Post (postNum) ON DELETE RESTRICT ON UPDATE RESTRICT;

-- Foreign Key 삭제 SQL - Product(postNum)
-- ALTER TABLE Product
-- DROP FOREIGN KEY FK_Product_postNum_Post_postNum;

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

—- 테이블 생성 SQL - Category
CREATE TABLE Category
(
    `categoryId`     BIGINT          NOT NULL    AUTO_INCREMENT COMMENT '카테고리아이디',
    `categoryName`   VARCHAR(100)    NOT NULL    COMMENT '카테고리명',
    PRIMARY KEY (categoryId)
);


— Foreign Key 설정 SQL - Category(categoryId) -> Product(categoryId)
ALTER TABLE Category
    ADD CONSTRAINT FK_Category_categoryId_Product_categoryId FOREIGN KEY (categoryId)
        REFERENCES Product (categoryId) ON DELETE RESTRICT ON UPDATE RESTRICT;

— Foreign Key 삭제 SQL - Category(categoryId)
— ALTER TABLE Category
— DROP FOREIGN KEY FK_Category_categoryId_Product_categoryId;