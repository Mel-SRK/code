import requests
from bs4 import BeautifulSoup

url="https://zhuanlan.zhihu.com/p/1933916691299038716"
response=requests.get(url)
response.encoding="utf-8"

soup = BeautifulSoup(response.text,"html.parser")
title = soup.string

print("标题:",title)