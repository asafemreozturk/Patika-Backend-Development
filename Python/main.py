#Patika python temel dersi sonu proje ödevi

input1 = [[1,'a',['cat'],2],[[[3]],'dog'],4,5]
newArr = []

def flatten(arr):
    for a in arr:
        if isinstance(a, list):
            flatten(a)
        else:
            newArr.append(a)

flatten(input1)
print(newArr)

# Task 2

input2 = [[1, 2], [3, 4], [5, 6, 7]]
newList = []

def reverse(arr):
    arr.reverse()
    for a in arr:
        if isinstance(a,list):
            a.reverse()
            newList.append(a)
reverse(input2)
print(newList)