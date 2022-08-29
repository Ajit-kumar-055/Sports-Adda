# Sports-Adda
APIs for sports news and Live socores.


## APIs
1. Register Api
   - http://localhost:9090/auth/register
   -  Data format
      - {
      "name":"Abc",
      "email":"abc@gmail.com",
      "userName":"abcd",
      "password":"1234567899"
      }
2. Login Api
   - http://localhost:9090/auth/login
   - Input Data fromate
      - {
    "username" : "abc@gmail.com",
    "password" : "1234567899"
}
3. Sports News
    - Multiple sports like Football, Tenis, Cricket, Rugby, Hockey etc.
    - http://localhost:9090/sports/news
    - Get Method
4. Live Score
    - Score of all live football games
    - http://localhost:9090/sports/liveSports
    - Get Method
5. Get user
    - Get user by user id
    - For Admin
    - http://localhost:8081/users/{userId}
