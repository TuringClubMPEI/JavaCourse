CREATE TABLE users
(
    Id Serial PRIMARY KEY,
    Avatar bytea,
    Description varchar(250),
    Username varchar(50),
    Fullname varchar(150),
    Email varchar(100),
    Password varchar(100),
    Age INTEGER,
    CHECK(Age>0 AND Age<=130 AND (Email!='') AND(Username!='')AND(Fullname!='')),
    UNIQUE(Username,Email)
);
CREATE TABLE article
(
    Id Serial PRIMARY KEY,
    IdUser Serial REFERENCES users(Id),
    Title varchar(200) NOT NULL,
    Text text NOT NULL,
    Likes smallint,
    Thumbnail bytea,
    CreatedDate timestamp
);
CREATE TABLE comments(
                         Id Serial PRIMARY KEY,
                         IdUser Serial REFERENCES users(Id),
                         IdArticle Serial REFERENCES article(Id),
                         Text text NOT NULL,
                         Likes smallint,
                         CreateDate timestamp NOT NULL,
                         number bigint NOT NULL,
                         CHECK (text !='')
    );
CREATE TABLE tag(
                    Id Serial,
                    ParentId Serial REFERENCES users(Id),
                    name varchar(100) NOT NULL,
                    CHECK(name != '')
    );