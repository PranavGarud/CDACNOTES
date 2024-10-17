library(RMySQL)
mydb = dbConnect(MySQL(), user='root', password = 'root', dbname='mydb0', host='localhost')
dbListTables(mydb)

##Lists the tables
dbListTables(mydb)

# Retriveing data
## 1.Saving in MySQLResult object
rs = dbSendQuery(mydb, "select * from emp")
rs
## 2. Fetching the data from MySQL result object
# mydata = fetch(rs, n=2) # fetch only 2 results
mydata = fetch(rs, n=-1)  # all the records
mydata
dbClearResult(rs)
rs

## write a dataframe as  a table
#
dbWriteTabl(mydb, name="mtcars", value = mtcars)

### Write a dataframe
#dbSendQuery(mydb, "drop table mtcars")
dbRemoveTable(mydb, 'mtcars')

# Must enable loading in MySQL
# mysql> SET GLOBAL local_infile=1;
dbWriteTable(mydb, name = 'mtcars', value = mtcars)

##Droping the table
dbRemoveTable(mydb,"mtcars")
dbListTables(mydb)

dbDisconnect()









library(XML)
setwd("D:/Git/R/Datasets/")
document <- xmlTreeParse("foods.xml" , useInternalNodes =  T )
rootnode <- xmlRoot(document)
xmlName(rootnode)
names(rootnode)
class(rootnode)

rootnode[1]

rootnode[[1]]
rootnode[[2]]

names(rootnode[[2]])
rootnode[[2]][["price"]]
rootnode[[2]][["name"]]

#xml to dataframe
foods <- xmlToDataFrame(document)
foods

document <-xmlTreeParse("books.xml", useInternalNodes = T)
book <- xmlToDataFrame(document)
book

# Json 
library(jsonlite)
jsonData <- fromJSON("contacts.txt")
class(jsonData)
names(jsonData)

#nested objects
jsonData$phoneNumber
class(jsonData$phoneNumber)
jsonData$phoneNumber$number

#Converting data frames into JSON
mt_JSON <- toJSON(mtcars)
mt_JSON

#import Json into data Framwe
mt_DS <- fromJSON(mt_JSON)

it_json <- fromJSON("Items.json")
names(it_json)

items_df <- data.frame(id = it_json$Item.ID,
                       name = it_json$Item.Name,
                       type = it_json$Item.Type,
                       brand = it_json$Brand)
items_df
