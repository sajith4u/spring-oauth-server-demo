drop table if exists app;
CREATE TABLE IF NOT EXISTS app (
  app_id VARCHAR(20) NOT NULL PRIMARY KEY,
  username VARCHAR(150) NOT NULL,
  password VARCHAR(200) NOT NULL,
  enabled TINYINT(1) ,
  app_name VARCHAR(50)
);

INSERT INTO app(app_id,username,password,enabled,app_name) values('001','admin','$2a$10$2Qj.gbjlCFezAzkEi6LYnOumhutqMo3h4vPwK4ZWj6kSdV9nemdme',1,'TAP_APP');