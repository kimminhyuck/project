DB구조(스키마 관리)
=====================
USERS SQL TEST용
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY, --유저 아이디
    email VARCHAR(255) UNIQUE NOT NULL,  -- 이메일
    password VARCHAR(255) NOT NULL, -- 암호화된 비밀번호
    name VARCHAR(100), --이름                         
    role ENUM('admin', 'customer') DEFAULT 'customer', -- 역할 (관리자, 일반 사용자)
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

관리자 TABLE SQL


