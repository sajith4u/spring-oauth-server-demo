drop table if exists app;
CREATE TABLE IF NOT EXISTS app (
  app_id VARCHAR(20) NOT NULL PRIMARY KEY,
  username VARCHAR(150) NOT NULL,
  password VARCHAR(200) NOT NULL,
  enabled TINYINT(1) ,
  app_name VARCHAR(50)
);

drop table if exists oauth_access_token;
CREATE TABLE IF NOT EXISTS oauth_access_token (
    token_id VARCHAR(50),
    token BLOB,
    authentication_id VARCHAR(50) PRIMARY KEY,
    user_name VARCHAR(50),
    client_id VARCHAR(50),
    authentication BLOB,
    refresh_token VARCHAR(50)
);

drop table if exists oauth_refresh_token;
CREATE TABLE IF NOT EXISTS oauth_refresh_token (
    token_id VARCHAR(256),
    token BLOB,
    authentication BLOB
);


drop table if exists oauth_client_details;
CREATE TABLE IF NOT EXISTS oauth_client_details (
    client_id VARCHAR(50) PRIMARY KEY,
    resource_ids VARCHAR(50),
    client_secret VARCHAR(100),
    scope VARCHAR(50),
    authorized_grant_types VARCHAR(150),
    web_server_redirect_uri VARCHAR(50),
    authorities VARCHAR(50),
    access_token_validity INTEGER,
    refresh_token_validity INTEGER,
    additional_information VARCHAR(150),
    autoapprove VARCHAR(50)
);


INSERT INTO oauth_client_details (client_id, client_secret, scope, authorized_grant_types, web_server_redirect_uri,
 authorities, access_token_validity, refresh_token_validity, additional_information, autoapprove)
 VALUES ("client", "$2a$10$xzhBmHVgSFog1FwNbdx4e.INnyNC5yZ9Lc1ZkiF2JsOCSuv8LjaCW", "read,write",
 "password,authorization_code,refresh_token,client_credentials", null, null, 36000, 36000, null, true);

INSERT INTO app(app_id,username,password,enabled,app_name) values('001','admin','$2a$10$2Qj.gbjlCFezAzkEi6LYnOumhutqMo3h4vPwK4ZWj6kSdV9nemdme',1,'TAP_APP');