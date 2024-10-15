library(tidyverse)
data("mtcars")
class(mtcars)
tbl_mtcars <- as_tibble(mtcars)
class(tbl_mtcars)

setwd("D:/Git/R/Datasets/")
b <- read.csv("B.csv")
arrange(b,B)

cars93 <- read.csv("Cars93.csv",stringsAsFactors = T)
s_cars <- arrange(cars93, Price)

s_cars <- arrange(cars93, Type, Price)
s_cars <- arrange(cars93, Type, desc(Price))
s_cars

### Select ###
s_cars <- select(cars93, 1:4)
s_cars

s_cars <- select(cars93, Model:Price)
s_cars

s_cars <- select(cars93, starts_with("MPG"))
s_cars

s_cars <- select(cars93, contains("in"))
s_cars
names(s_cars)
