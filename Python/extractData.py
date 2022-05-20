import re
import requests


result = requests.get("https://cat-fact.herokuapp.com/facts/random")

print(result)

print(result.json())

print("*****************************",end='\n')

print(result.json()['status'])
