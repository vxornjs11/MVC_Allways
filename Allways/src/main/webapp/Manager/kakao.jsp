<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
GET /oauth/authorize?client_id=${REST_API_KEY}&redirect_uri=${REDIRECT_URI}&response_type=code HTTP/1.1
Host: kauth.kakao.com

https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=${REST_API_KEY}&redirect_uri=${REDIRECT_URI}

HTTP/1.1 302 Found
Content-Length: 0
Location: ${REDIRECT_URI}?code=${AUTHORIZE_CODE}

HTTP/1.1 302 Found
Content-Length: 0
Location: ${REDIRECT_URI}?error=access_denied&error_description=User%20denied%20access


POST /oauth/token HTTP/1.1
Host: kauth.kakao.com



Content-type: application/x-www-form-urlencoded;charset=utf-8


curl -v -X POST "https://kauth.kakao.com/oauth/token" \
 -H "Content-Type: application/x-www-form-urlencoded" \
 -d "grant_type=authorization_code" \
 -d "client_id=${REST_API_KEY}" \
 --data-urlencode "redirect_uri=${REDIRECT_URI}" \
 -d "code=${AUTHORIZE_CODE}"
 
 
 HTTP/1.1 200 OK
Content-Type: application/json;charset=UTF-8
{
    "token_type":"bearer",
    "access_token":"${ACCESS_TOKEN}",
    "expires_in":43199,
    "refresh_token":"${REFRESH_TOKEN}",
    "refresh_token_expires_in":25184000,
    "scope":"account_email profile"
}



HTTP/1.1 200 OK
{
    "token_type": "bearer",
    "access_token": "${ACCESS_TOKEN}",
    "id_token": "${ID_TOKEN}",
    "expires_in": 7199,
    "refresh_token": "${REFRESH_TOKEN}",
    "refresh_token_expires_in": 86399,
    "scope": "profile_image openid profile_nickname"
}



{
  "aud": "${APP_KEY}",
  "sub": "${USER_ID}",
  "auth_time": 1661967952,
  "iss": "https://kauth.kakao.com",
  "exp": 1661967972,
  "iat": 1661967952,
  "nickname": "JordyTest",
  "picture": "http://yyy.kakao.com/.../img_110x110.jpg",
  "email": "jordy@kakao.com"
}






</body>
</html>