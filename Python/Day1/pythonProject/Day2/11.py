from operator import index
from tempfile import tempdir

threshold = 75
stud_info = []
for i in range(0,5):
    name = input("Enter Name of Student : ")
    rollno = int(input("Enter Roll No. : "))
    perct  =  float(input("Enter Percentage : "))
    stud_info.append((name,rollno,perct))

for i in range(0,5):
    name,rollno,perct = stud_info[i]
    print("Name:",name,"   Roll No.:",rollno,"  Percentage:",perct)

for i in range(0,5):
    name,rollno,perct = stud_info[i]
    if threshold < perct:
        print("Name:",name,"   Roll No.:",rollno,"  Percentage:",perct)

res = int(input("Enter Rollno you want : "))
for i in range(0,5):
    name,rollno,perct = stud_info[i]
    if res==rollno:
        print("Name:", name, "   Roll No.:", rollno, "  Percentage:", perct)

res = 0
for i in range(0,5):
    name,rollno,perct = stud_info[i]
    res = res + perct

res = res/5
print("Average Percentage : ",res)

res = 0
index1 = 0
for i in range(0,5):
    name,rollno,perct = stud_info[i]
    if res>perct:
        index1 = i

name,rollno,perct = stud_info[index1]
print("Name:", name, "   Roll No.:", rollno, "  Percentage:", perct)

for i in range(0,5):
    name1, rollno1, perct1 = stud_info[i]
    for j in range(i,5):
        name, rollno, perct = stud_info[j]
        if(perct1<perct):
            temp = stud_info[j]
            stud_info[j] = stud_info[i]
            stud_info[i] = temp

for i in range(0,5):
    name,rollno,perct = stud_info[i]
    print("Name:",name,"   Roll No.:",rollno,"  Percentage:",perct)

