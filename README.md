# 미니 프로젝트 1 (프로젝트명:구해줘용(9doit))

### 의존성 주입
웹소켓, Redis 추가 예정
초기 개발단계에서는 MariaDB 사용함

* Spring Boot DevTools
* Lombok
* MyBatis Framework
* MariaDB Driver
* Spring Web

### 라이브러리 추가
```sql
implementation group: 'javax.servlet', name: 'jstl', version: '1.2'
implementation group: 'org.apache.tomcat.embed', name: 'tomcat-embed-jasper', version: '9.0.65'
```

### 테이블 생성 (MariaDB)
```sql
CREATE USER '9doit'@'%' IDENTIFIED BY '423206';
CREATE DATABASE 9doitdb;
GRANT ALL PRIVILEGES ON 9doitdb.* TO '9doit'@'%';

USE 9doitdb;

CREATE TABLE users (
   id INT PRIMARY KEY AUTO_INCREMENT,
   user_id VARCHAR(20),
   user_password VARCHAR(20),
   user_name VARCHAR(20),
   age INT,
   phone_number VARCHAR(20),
   email VARCHAR(20),
   photo BLOB,
   position_code_name VARCHAR(20),
   company_id INT,
   mycareer_id INT,
   created TIMESTAMP
);

CREATE TABLE companys (
   id INT PRIMARY KEY AUTO_INCREMENT,
   company_name VARCHAR(20) NOT NULL,
   address VARCHAR(20) NOT NULL,
   email VARCHAR(20) NOT NULL,
   company_number VARCHAR(20) NOT NULL UNIQUE,
   photo BLOB,
   region_code_name VARCHAR(20) NOT NULL,
   intro LONGTEXT,
   years INT NOT NULL,
   member_count INT NOT NULL,
   created TIMESTAMP
);

CREATE TABLE resumes (
   id INT PRIMARY KEY AUTO_INCREMENT,
   user_id INT NOT NULL,
   positions_code_id INT,
   title VARCHAR(20) NOT NULL,
   intro LONGTEXT NOT NULL,
   status_id INT,
   created TIMESTAMP
);

CREATE TABLE wanteds (
   id INT PRIMARY KEY AUTO_INCREMENT,
   position_code_name VARCHAR(20) NOT NULL,
   career_code_id INT,
   pay VARCHAR(20) NOT NULL,
   company_id INT NOT NULL,
   title VARCHAR(20) NOT NULL,
   detail LONGTEXT NOT NULL,
   view_count INT,
   created TIMESTAMP,
   enddate TIMESTAMP,
   checked BOOLEAN
);

CREATE TABLE positions_code (
   id INT PRIMARY KEY AUTO_INCREMENT,
   name VARCHAR(20) UNIQUE,
   created TIMESTAMP
);

CREATE TABLE skills_code (
   id INT PRIMARY KEY AUTO_INCREMENT,
   name VARCHAR(20) UNIQUE,
   created TIMESTAMP
);

CREATE TABLE regions_code (
   id INT PRIMARY KEY AUTO_INCREMENT,
   name VARCHAR(20) UNIQUE,
   created TIMESTAMP
);

CREATE TABLE careers_code (
   id INT PRIMARY KEY AUTO_INCREMENT,
   name VARCHAR(20) UNIQUE,
   created TIMESTAMP
);

CREATE TABLE application_status (
   id INT PRIMARY KEY AUTO_INCREMENT,
   wanted_id INT,
   resume_id INT,
   state INT,
   created TIMESTAMP
);

CREATE TABLE matchings (
   id INT PRIMARY KEY AUTO_INCREMENT,
   resume_id INT,
   wanted_id INT,
   created TIMESTAMP
);

CREATE TABLE applys (
   id INT PRIMARY KEY AUTO_INCREMENT,
   wanted_id INT,
   status INT,
   created TIMESTAMP
);

CREATE TABLE subcribes (
   id INT PRIMARY KEY AUTO_INCREMENT,
   user_id INT,
   company_id INT,
   created TIMESTAMP
);

CREATE TABLE likes (
   id INT PRIMARY KEY AUTO_INCREMENT,
   user_id INT,
   wanted_id INT,
   created TIMESTAMP
);

CREATE TABLE myskills (
   id INT PRIMARY KEY AUTO_INCREMENT,
   user_id INT,
   resume_id INT,
   wanted_id INT,
   skills_code_id INT
);

CREATE TABLE mycareers (
   id INT PRIMARY KEY AUTO_INCREMENT,
   user_id INT,
   resume_id INT,
   startdate TIMESTAMP,
   enddate TIMESTAMP,
   company_name VARCHAR(20)
);

CREATE TABLE educations (
   id INT PRIMARY KEY AUTO_INCREMENT,
   user_id INT,
   resume_id INT,
   startdate TIMESTAMP,
   enddate TIMESTAMP,
   instruction VARCHAR(20),
   state VARCHAR(20)
);

CREATE TABLE requests (
   id INT PRIMARY KEY AUTO_INCREMENT,
   resume_id INT,
   status VARCHAR(20),
   created TIMESTAMP
);

CREATE TABLE recruits (
   id INT PRIMARY KEY AUTO_INCREMENT,
   resume_id INT,
   wanted_id INT,
   created TIMESTAMP
);
```

### 더미데이터 생성 (MariaDB)
```sql
INSERT INTO users(user_id, user_password, user_name, age, phone_number, email, photo, position_code_name, company_id, mycareer_id, created)
VALUES('garam1234', '1234', '박가람', 26, '01011112222', 'garam12@naver.com', NULL, '프론트 개발자', NULL, NULL, NOW());
INSERT INTO users(user_id, user_password, user_name, age, phone_number, email, photo, position_code_name, company_id, mycareer_id, created)
VALUES('Lzm1992', '1234', '이재모', 80, '01024551478', 'Lzm1992@hanmail.com', NULL, NULL, NULL, NULL, NOW());
INSERT INTO users(user_id, user_password, user_name, age, phone_number, email, photo, position_code_name, company_id, mycareer_id, created)
VALUES('lazyIn94', '1234', '한가인', 29, '01034567890', 'lazyIn94@naver.com', NULL, '백앤드 개발자', NULL, NULL, NOW());
INSERT INTO users(user_id, user_password, user_name, age, phone_number, email, photo, position_code_name, company_id, mycareer_id, created)
VALUES('hand0728', '1234', '손재영', 35, '01022223333', 'hand0728@naver.com', NULL, '웹 퍼블리셔', NULL, NULL, NOW());
INSERT INTO users(user_id, user_password, user_name, age, phone_number, email, photo, position_code_name, company_id, mycareer_id, created)
VALUES('dragon5k', '1234', '김용오', 32, '01035567770', 'dragon5k@naver.com', NULL, '백앤드 개발자', NULL, NULL, NOW());
INSERT INTO users(user_id, user_password, user_name, age, phone_number, email, photo, position_code_name, company_id, mycareer_id, created)
VALUES('samsung1', '1234', '이건희', 82, '01023998293', 'samsung1@samsung.com', NULL, NULL, NULL, NULL, NOW());
INSERT INTO users(user_id, user_password, user_name, age, phone_number, email, photo, position_code_name, company_id, mycareer_id, created)
VALUES('goodLg', '1234', '구광모', 44, '01928382992', 'goodLg@lg.com', NULL, NULL, NULL, NULL, NOW());
INSERT INTO users(user_id, user_password, user_name, age, phone_number, email, photo, position_code_name, company_id, mycareer_id, created)
VALUES('apple', '1234', '스티븐잡스', 58, '0828112456', 'apple@apple.com', NULL, NULL, NULL, NULL, NOW());
INSERT INTO users(user_id, user_password, user_name, age, phone_number, email, photo, position_code_name, company_id, mycareer_id, created)
VALUES('kongG', '1234', '홍콩지', 27, '01098776543', 'kongG@nate.com', NULL, '백앤드 개발자', NULL, NULL, NOW());
INSERT INTO users(user_id, user_password, user_name, age, phone_number, email, photo, position_code_name, company_id, mycareer_id, created)
VALUES('1DongA', '1234', '한동아', 20, '01098722921', '1DongA@gmail.com', NULL, '프론트 개발자', NULL, NULL, NOW());
INSERT INTO users(user_id, user_password, user_name, age, phone_number, email, photo, position_code_name, company_id, mycareer_id, created)
VALUES('newSui', '1234', '신류이수', 31, '01056821345', 'newSui@gmail.com', NULL, '웹 퍼블리셔', NULL, NULL, NOW());

INSERT INTO companys(company_name, address, email, company_number, photo, region_code_name, intro, years, member_count, created)
VALUES('이재모피자', '부산광역시 중구 광복중앙로 31', 'Lzm1992@hanmail.com', '98700123456', NULL, '부산', '정성 가득한 피자를 만듭니다.', 1992, 20, NOW());
INSERT INTO companys(company_name, address, email, company_number, photo, region_code_name, intro, years, member_count, created)
VALUES('삼성', '서울특별시 서초구 서초대로74길 4', 'samsung1@samsung.com', '1234567890', NULL, '서울', '전자제품, 가전제품, 종합 반도체와 디스플레이 사업을 하는 기업', 1969, 117498, NOW());
INSERT INTO companys(company_name, address, email, company_number, photo, region_code_name, intro, years, member_count, created)
VALUES('LG전자', '서울특별시 영등포구 여의대로 128', 'goodLg@lg.com', '4567890123', NULL, '서울', '전자제품, 가전제품, 종합 반도체와 디스플레이 사업을 하는 기업', 1958, 34751, NOW());
INSERT INTO companys(company_name, address, email, company_number, photo, region_code_name, intro, years, member_count, created)
VALUES('애플코리아', '서울특별시 강남구 영동대로 517', 'apple@apple.com', '1230987654', NULL, '서울', '세련된 인테리어의 공간에서 iPhone, iPad 등을 판매하는 Apple 소매점입니다.', 1998, 130000, NOW());
INSERT INTO companys(company_name, address, email, company_number, photo, region_code_name, intro, years, member_count, created)
VALUES('굿디자인', '광주 서구 상무자유로 8-3', 'lazyIn94@naver.com', '4561237890', NULL, '광주', '좋은 디자인을 만들어냅니다.', 2015, 32, NOW());

INSERT INTO resumes(user_id, positions_code_id, title, intro, status_id, created)
VALUES(1, 3, '프론트 개발자인 박가람입니다.', '박가람씨의 잘 쓰여진 자기소개서, 우리 회사에 입사시키면 일을 열심히 할 것 같은 내용이 쓰여있다.', NULL, NOW());
INSERT INTO resumes(user_id, positions_code_id, title, intro, status_id, created)
VALUES(4, 1, '백앤드 개발자인 손재영입니다.', '손재영씨의 잘 쓰여진 자기소개서, 우리 회사에 입사시키면 일을 열심히 할 것 같은 내용이 쓰여있다.', NULL, NOW());
INSERT INTO resumes(user_id, positions_code_id, title, intro, status_id, created)
VALUES(5, 2, '웹 퍼블리셔인 김용오입니다.', '김용오씨의 자기소개서, 우리 회사에 입사시키면 일을 무난히 할 것 같은 내용이 쓰여있다.', NULL, NOW());
INSERT INTO resumes(user_id, positions_code_id, title, intro, status_id, created)
VALUES(9, 2, '웹 퍼블리셔인 홍콩지입니다.', '홍콩지씨의 잘 쓰여진 자기소개서, 우리 회사에 입사시키면 일을 열심히 할 것 같은 내용이 쓰여있다.', NULL, NOW());
INSERT INTO resumes(user_id, positions_code_id, title, intro, status_id, created)
VALUES(10, 3, '프론트 개발자인 한동아입니다.', '한동아씨의 자기소개서, 우리 회사에 입사시키면 일을 무난히 할 것 같은 내용이 쓰여있다.', NULL, NOW());
INSERT INTO resumes(user_id, positions_code_id, title, intro, status_id, created)
VALUES(11, 1, '백앤드 개발자인 신류이수입니다.', '신류이수씨의 자기소개서, 우리 회사에 입사시키면 일을 무난히 할 것 같은 내용이 쓰여있다.', NULL, NOW());

INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('백앤드 개발자', 4, 5000, 1, '서버 개발자 구인', '이재모 피자 홈페이지를 개발하실 서버 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('프론트 개발자', 4, 4000, 1, '프론트 개발자 구인', '이재모 피자 홈페이지를 개발하실 프론트 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('백앤드 개발자', 5, 8000, 2, '서버 개발자 구인', '삼성에서 함께 일하실 서버 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('백앤드 개발자', 1, 3200, 2, '서버 개발자 구인', '삼성에서 함께 일하실 서버 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('프론트 개발자', 5, 7000, 2, '프론트 개발자 구인', '삼성에서 함께 일하실 프론트 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('프론트 개발자', 1, 3000, 2, '프론트 개발자 구인', '삼성에서 함께 일하실 프론트 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('웹 퍼블리셔', 5, 6000, 2, '웹 퍼블리셔 구인', '삼성에서 함께 일하실 웹 퍼블리셔를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('웹 퍼블리셔', 1, 2900, 2, '웹 퍼블리셔 구인', '삼성에서 함께 일하실 웹 퍼블리셔를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('백앤드 개발자', 5, 8000, 3, '서버 개발자 구인', 'LG에서 함께 일하실 서버 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('백앤드 개발자', 1, 3200, 3, '서버 개발자 구인', 'LG에서 함께 일하실 서버 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('프론트 개발자', 5, 7000, 3, '프론트 개발자 구인', 'LG에서 함께 일하실 프론트 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('프론트 개발자', 1, 3000, 3, '프론트 개발자 구인', 'LG에서 함께 일하실 프론트 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('웹 퍼블리셔', 5, 6000, 3, '웹 퍼블리셔 구인', 'LG에서 함께 일하실 웹 퍼블리셔를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('웹 퍼블리셔', 1, 2900, 3, '웹 퍼블리셔 구인', 'LG에서 함께 일하실 웹 퍼블리셔를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('백앤드 개발자', 5, 8000, 4, '서버 개발자 구인', '애플코리아에서 함께 일하실 서버 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('백앤드 개발자', 1, 3200, 4, '서버 개발자 구인', '애플코리아에서 함께 일하실 서버 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('프론트 개발자', 5, 7000, 4, '프론트 개발자 구인', '애플코리아에서 함께 일하실 프론트 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('프론트 개발자', 1, 3000, 4, '프론트 개발자 구인', '애플코리아에서 함께 일하실 프론트 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('웹 퍼블리셔', 5, 6000, 4, '웹 퍼블리셔 구인', '애플코리아에서 함께 일하실 웹 퍼블리셔를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('웹 퍼블리셔', 1, 2900, 4, '웹 퍼블리셔 구인', '애플코리아에서 함께 일하실 웹 퍼블리셔를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('프론트 개발자', 3, 5000, 5, '프론트 개발자 구인', '굿디자인에서 함께 일하실 프론트 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('프론트 개발자', 1, 3000, 5, '프론트 개발자 구인', '굿디자인에서 함께 일하실 프론트 개발자를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('웹 퍼블리셔', 3, 4000, 5, '웹 퍼블리셔 구인', '굿디자인에서 함께 일하실 웹 퍼블리셔를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);
INSERT INTO wanteds(position_code_name, career_code_id, pay, company_id, title, detail, view_count, created, enddate, checked)
VALUES('웹 퍼블리셔', 1, 2900, 5, '웹 퍼블리셔 구인', '굿디자인에서 함께 일하실 웹 퍼블리셔를 구인합니다. 회사에 대한 설명이 쓰여있다.', 0, NOW(), LAST_DAY(NOW()), FALSE);

INSERT INTO positions_code(name, created) VALUES('백앤드 개발자', NOW());
INSERT INTO positions_code(name, created) VALUES('웹 퍼블리셔', NOW());
INSERT INTO positions_code(name, created) VALUES('프론트 개발자', NOW());

INSERT INTO skills_code(name, created) VALUES('HTML/CSS', NOW());
INSERT INTO skills_code(name, created) VALUES('JavaScript', NOW());
INSERT INTO skills_code(name, created) VALUES('JQuery', NOW());
INSERT INTO skills_code(name, created) VALUES('Node.js', NOW());
INSERT INTO skills_code(name, created) VALUES('Photoshop', NOW());
INSERT INTO skills_code(name, created) VALUES('React', NOW());
INSERT INTO skills_code(name, created) VALUES('Java', NOW());
INSERT INTO skills_code(name, created) VALUES('Spring', NOW());
INSERT INTO skills_code(name, created) VALUES('AWS', NOW());
INSERT INTO skills_code(name, created) VALUES('Python', NOW());
INSERT INTO skills_code(name, created) VALUES('MySQL', NOW());
INSERT INTO skills_code(name, created) VALUES('Linux', NOW());
INSERT INTO skills_code(name, created) VALUES('Git', NOW());
INSERT INTO skills_code(name, created) VALUES('TypeScript', NOW());

INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(1, 1, NULL, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(1, 1, NULL, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(1, 1, NULL, 3);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(1, 1, NULL, 4);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(1, 1, NULL, 6);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(4, 2, NULL, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(4, 2, NULL, 3);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(4, 2, NULL, 5);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(4, 2, NULL, 7);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(5, 3, NULL, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(5, 3, NULL, 4);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(5, 3, NULL, 7);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(5, 3, NULL, 8);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(5, 3, NULL, 9);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(5, 3, NULL, 13);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(9, 4, NULL, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(9, 4, NULL, 4);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(9, 4, NULL, 7);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(9, 4, NULL, 10);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(9, 4, NULL, 11);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(9, 4, NULL, 12);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(9, 4, NULL, 13);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(10, 5, NULL, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(10, 5, NULL, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(10, 5, NULL, 3);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(10, 5, NULL, 4);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(10, 5, NULL, 6);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(11, 6, NULL, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(11, 6, NULL, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(11, 6, NULL, 3);

INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 1, 10);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 1, 9);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 1, 11);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 1, 12);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 1, 13);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 2, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 2, 3);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 2, 4);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 2, 5);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 2, 6);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 3, 14);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 3, 12);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 3, 11);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 3, 10);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 4, 7);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 4, 9);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 4, 11);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 5, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 5, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 5, 3);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 5, 4);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 5, 6);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 6, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 6, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 6, 6);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 7, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 7, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 7, 3);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 7, 5);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 8, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 8, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 8, 5);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 9, 14);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 9, 12);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 9, 11);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 9, 10);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 10, 7);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 10, 9);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 10, 11);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 11, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 11, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 11, 3);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 11, 4);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 11, 6);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 12, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 12, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 12, 6);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 13, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 13, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 13, 3);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 13, 5);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 14, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 14, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 14, 5);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 15, 14);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 15, 12);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 15, 11);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 15, 10);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 16, 7);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 16, 9);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 16, 11);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 17, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 17, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 17, 3);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 17, 4);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 17, 6);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 18, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 18, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 18, 6);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 19, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 19, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 19, 3);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 19, 5);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 20, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 20, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 20, 5);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 21, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 21, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 21, 3);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 21, 4);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 21, 6);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 22, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 22, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 22, 6);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 23, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 23, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 23, 3);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 23, 5);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 24, 1);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 24, 2);
INSERT INTO myskills(user_id, resume_id, wanted_id, skills_code_id) VALUES(NULL, NULL, 24, 5);

INSERT INTO regions_code(name, created) VALUES('서울', NOW());
INSERT INTO regions_code(name, created) VALUES('부산', NOW());
INSERT INTO regions_code(name, created) VALUES('대구', NOW());
INSERT INTO regions_code(name, created) VALUES('인천', NOW());
INSERT INTO regions_code(name, created) VALUES('광주', NOW());
INSERT INTO regions_code(name, created) VALUES('대전', NOW());
INSERT INTO regions_code(name, created) VALUES('울산', NOW());
INSERT INTO regions_code(name, created) VALUES('세종', NOW());
INSERT INTO regions_code(name, created) VALUES('경기', NOW());
INSERT INTO regions_code(name, created) VALUES('강원', NOW());
INSERT INTO regions_code(name, created) VALUES('충북', NOW());
INSERT INTO regions_code(name, created) VALUES('충남', NOW());
INSERT INTO regions_code(name, created) VALUES('전북', NOW());
INSERT INTO regions_code(name, created) VALUES('전남', NOW());
INSERT INTO regions_code(name, created) VALUES('경북', NOW());
INSERT INTO regions_code(name, created) VALUES('경남', NOW());
INSERT INTO regions_code(name, created) VALUES('제주', NOW());

INSERT INTO careers_code(name, created) VALUES('신입', NOW());
INSERT INTO careers_code(name, created) VALUES('1년', NOW());
INSERT INTO careers_code(name, created) VALUES('2년', NOW());
INSERT INTO careers_code(name, created) VALUES('3년', NOW());
INSERT INTO careers_code(name, created) VALUES('4년', NOW());
INSERT INTO careers_code(name, created) VALUES('5년 이상', NOW());

INSERT INTO mycareers(user_id, resume_id, startdate, enddate, company_name)
VALUES(1, 1, NOW(), MAKEDATE(2024, 245), 'FINE');
INSERT INTO mycareers(user_id, resume_id, startdate, enddate, company_name)
VALUES(4, 2, NOW(), MAKEDATE(2025, 125), '산호디자인');
INSERT INTO mycareers(user_id, resume_id, startdate, enddate, company_name)
VALUES(4, 2, NOW(), MAKEDATE(2027, 305), 'WAVE');
INSERT INTO mycareers(user_id, resume_id, startdate, enddate, company_name)
VALUES(5, 3, NOW(), MAKEDATE(2025, 305), 'CookTV');
INSERT INTO mycareers(user_id, resume_id, startdate, enddate, company_name)
VALUES(9, 4, NOW(), MAKEDATE(2023, 305), 'smartAI');
INSERT INTO mycareers(user_id, resume_id, startdate, enddate, company_name)
VALUES(10, 5, NULL, NULL, NULL);
INSERT INTO mycareers(user_id, resume_id, startdate, enddate, company_name)
VALUES(11, 6, NOW(), MAKEDATE(2024, 325), 'FMserver');

INSERT INTO likes(user_id, wanted_id, created) VALUES(1, 2, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(1, 21, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(4, 7, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(4, 8, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(4, 14, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(4, 13, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(4, 19, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(4, 24, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 1, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 2, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 3, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 4, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 5, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 6, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 7, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 8, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 9, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 10, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 11, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 12, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 13, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 14, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 16, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(5, 17, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(9, 3, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(9, 4, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(9, 5, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(10, 10, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(10, 20, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(10, 23, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(11, 23, NOW());
INSERT INTO likes(user_id, wanted_id, created) VALUES(11, 24, NOW());

INSERT INTO subcribes(user_id, company_id, created) VALUES(1, 1, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(1, 2, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(1, 3, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(2, 1, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(2, 5, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(3, 3, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(4, 2, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(5, 1, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(5, 2, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(5, 3, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(6, 1, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(6, 3, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(6, 4, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(7, 4, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(7, 5, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(8, 5, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(9, 2, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(9, 5, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(10, 1, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(10, 2, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(10, 3, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(11, 2, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(11, 3, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(11, 4, NOW());
INSERT INTO subcribes(user_id, company_id, created) VALUES(11, 5, NOW());

UPDATE users SET company_id = 1 WHERE id = 2;
UPDATE users SET company_id = 2 WHERE id = 6;
UPDATE users SET company_id = 3 WHERE id = 7;
UPDATE users SET company_id = 4 WHERE id = 8;
UPDATE users SET company_id = 5 WHERE id = 3;

COMMIT;
```

### 쿼리 (MariaDB)
```sql
```