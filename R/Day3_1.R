library(tidyverse)
setwd("D:/Git/R/Datasets/")
daily_sales <- read.csv("train_25.csv", stringsAsFactors = T)
store_info <- read.csv("store.csv",stringsAsFactors = T)

### sum per store ###

Sales_per_store <- daily_sales %>% 
                  group_by(Store) %>% 
                  summarise(tot_sales=sum(Sales, na.rm = T))
view(Sales_per_store)
sum(Sales_per_store)

### Mean sales per day of week ###
avg_day <- daily_sales %>% 
            group_by(DayOfWeek) %>% 
            summarise(avg_sales=mean(Sales, na.rm = T))
view(avg_day)
avg_day

ggplot(data = avg_day, 
       aes(x=DayOfWeek,y=avg_sales,fill=DayOfWeek))+
  geom_bar(stat = 'identity', fill='plum')

### Plot the freq count for assortment for store ###
table(store_info$Assortment)
ggplot(data = store_info, aes(x=Assortment))+
  geom_bar(fill = 'olivedrab4')
ggplot(data = store_info, aes(x=Assortment,fill = Assortment))+
  geom_bar()

### Join
sales_data <- daily_sales %>% 
              left_join(store_info,by = "Store")
sales_data
view(sales_data)

### How many are missing in CompitionMonth ###
### in store data?                         ###

sum(is.na(store_info$CompetitionOpenSinceMonth))


#Calculate percentage#
pct <- round(100*cnt_srt%cnt/sum(cnt_srt$cnt))
### Pie chart for store type in store ###
library(ggplot2)

ggplot(data = store_info,aes(x=StoreType,fill = StoreType))+
  geom_