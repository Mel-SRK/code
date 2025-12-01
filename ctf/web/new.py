import requests

url = 'http://127.0.0.1:45059/questionnaire'

data = {
    "nickname":"Name",
    "user_gender":"male",
    "target":"Man",
    "target_gender":"male",
    "message":"Love",
    "anonymous":"false"
}

for i in range(100):
    response = requests.post(url, json=data)
    print(i)
    print('Status Code:', response.status_code)
    print('Response JSON:', response.json())
