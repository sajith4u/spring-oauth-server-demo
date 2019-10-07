# spring-oauth-server-demo
This is Oauth Server Demo Application  fro Test Spring Oauth Server [ JDBC Token Store]


### Get Oauth Token

curl -X POST \
  'http://localhost:8081/oauth/token?grant_type=password&username=admin&password=admin123' \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Authorization: Basic Y2xpZW50OnNlY3JldA==' \
  -H 'Postman-Token: 99cb100f-10b3-4207-b056-c2361b157a89' \
  -H 'cache-control: no-cache'
  
 Response : 
 
 {
     "access_token": "9fcde40d-4f56-42ce-abb1-fa160e2b6b2b",
     "token_type": "bearer",
     "refresh_token": "0e205630-2486-4cdb-8007-7f11b1f0f900",
     "expires_in": 3599,
     "scope": "read write"
 }
 
 
### Get Data From Resource

curl -X GET \
  http://localhost:8081/apps/details \
  -H 'Authorization: Bearer 9fcde40d-4f56-42ce-abb1-fa160e2b6b2b' \
  -H 'Postman-Token: cc77cf22-5087-4afc-9afa-e8ea45cff484' \
  -H 'cache-control: no-cache'
  
  
  
  Response : 
  
  {
      "id": "001",
      "name": "Sample App"
  }