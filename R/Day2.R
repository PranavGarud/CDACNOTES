### Filter ###
car93 <- read.csv("D:/Git/R/Datasets/Cars93.csv",stringsAsFactors = T)
car93
s_cars <- filter(car93,Type=="Small")
s_cars



## Rename ##
setwd("D:/Git/R/Datasets/")
df <- read.csv("Lab_Uric.csv")
df_1 <- rename(df, "PID"="PatientID")
library(tidyverse)
## Mutate ##
date("cars")
cars <- mutate(cars, time=dist/speed)
cars
library(dplyr)
data("txhousing")
txhousing <- mutate(txhousing, r1=sales/volume, r2=median/volume)
#Or creating columns separately in assignment statements
data("txhousing")
txhousing
txhousing$r1 <- txhousing$sales/txhousing$volume
txhousing$r2 <- txhousing$median/txhousing$volume

#summary: not a part of dplyr
summary(txhousing$sales)

#summarize 
summarize(txhousing,avg_sales=mean(sales, na.rm=T),
          std_sales = sd(sales, na.rm = T),
          avg_vol = mean(volume, na.rm = T),
          std_vol = sd(volume, na.rm = T))

## group by 
grp_hous <- group_by(txhousing, year)
summarize(grp_hous, avg_sales=mean(sales, na.rm = T))

grp_hous <- group_by(txhousing, year)
summarize(grp_hous, avg_sales=mean(sales, na.rm=T))  

grp_hous <- group_by(txhousing,city, year)
summarize(grp_hous, avg_sales=mean(sales, na.rm=T)) 

## magritrr
# %>% shortcut key: ctrl shift m
txhousing %>% 
  group_by(year) %>% 
  summarise(avg_sales=mean(sales, na.rm = T))

cars93 <- read.csv("Cars93.csv")
select(cars93, Model:Price)
cars93 %>% 
  select(Model:Price)

### Filter the car93 with only type=midsize and then
### on that dataset calculate mean price groupby AirBags

cars93 <- read.csv("Cars93.csv")
s_cars <- filter(cars93, Type == "Midsize")
s_cars
cars93 %>% 
  filter(Type=="Midsize") %>% 
  group_by(AirBags) %>% 
  summarise(avg_price = mean(Price, na.rm = T))


### Join ###
items <- read.csv("Items.csv")
ord_det <- read.csv("Ord_Details.csv")
item_ord <- inner_join(items, ord_det, by = "Item.ID")
item_ord


#### Tidyr ####
library(tidyr)

data("table4a")
gather(table4a, '1999', '2000', key = "year", value = "val")
#Or
table4a %>% gather('1999', '2000', key = "year", value = "val")
#Or
table4a %>% gather(-country, key = "year", value = "val")


## Pivot_longer ##
table4a %>% 
  pivot_longer(-country, names_to = "year",
               values_to = "val")
### Spreading ###
table2
## spread ##
table2 %>% 
  spread(key = "type", value = "count")

## Pivot_wider ##
table2 %>% 
  pivot_wider(names_from = "type",
              values_from = "count")

### Seperate ###
table3
table3 %>% 
  separate(rate, into = c("count",'pop'),
           convert = T)
### Ex1 ###
comb1 <- read.csv("comb1.csv", stringsAsFactors = T)

comb1 %>% 
  pivot_longer(-District, names_to = "ItemType",
               values_to = "qty")

### Plot Tables ###
a <- c(34, 78, 30, 45)
barplot(a)
pie(a)

b <- c(109, 45, 49, 50)
rb <- rbind(a,b)
barplot(rb)
barplot(rb, beside = T)
barplot(rb, beside = T, col = c("burlywood","turquoise4"))

cars93 <- read.csv("cars93.csv",stringsAsFactors = T)
table(cars93$Type)
barplot(table(cars93$Type),beside = T,
        main = "Types of Cars",
        xlab = "Types", ylab = "Count")
  

##### Scatter plot
plot(cars93$MPG.city, cars93$Price)
plot(cars93$MPG.city, cars93$Price, pch=17,
     col="seashell3",xlab = "Milage",
     ylab = "Price", main = "Scatter Plot")

###### Boxplot
boxplot(cars93$MPG.city)

boxplot(cars93$MPG.city ~ cars93$Type,
        xlab = "Type", ylab = "Milage",
        main = "Boxplot")

ggplot(data = cars93, aes(x = MPG.city, y=Price))+
  geom_point() + labs(x="Milege",y="Price")

ggplot(data = cars93, 
       aes(x = MPG.city, y=Price,colour = AirBags))+
  geom_point() + labs(x="Milege",y="Price")

ggplot(data = cars93, 
       aes(x = MPG.city, y=Price,size = EngineSize,color = AirBags))+
  geom_point() + labs(x="Milege",y="Price")

ggplot(data = cars93,
       aes(x=MPG.city, y=Price, size = EngineSize))+
  geom_point(color="violetred",alpha=0.4)+
  labs(x="Milage",y="Price")

ggplot(data = cars93,
       aes(x=MPG.city, y=Price, size = EngineSize,colour = AirBags))+
  geom_point(alpha=0.4)+
  labs(x="Milage",y="Price")

ggplot(data = cars93,
       aes(y=Price, x=AirBags, colour = AirBags))+
  geom_boxplot()

ggplot(data = cars93,
       aes(y=Price, x=AirBags, fill=AirBags))+
  geom_boxplot()
  
### Smoothing

ggplot(data = cars93, aes(x=MPG.city, y=Price)) +
  geom_point() + geom_smooth()+
  labs(x="Milage", y="Price")

ggplot(data = cars93, aes(x=MPG.city, y=Price)) +
  geom_point() + 
  geom_smooth(method = "lm", se = F)+
  labs(x="Milage", y="Price")

ggplot(data = cars, aes(x=dist, y=speed)) +
  geom_point() +
  geom_smooth(method = "lm", se = F)+
  labs(x="Distance", y="Speed")

### Histogram ###
ggplot(data = cars93,
       aes(x=Price))+
  geom_histogram(fill="rosybrown2", color="red")

### Density Plot ###
ggplot(data = cars93,
       aes(x=Price))+
  geom_density(fill="rosybrown2", color="red")

### Bar Plot ###
ggplot(data = cars93,
       aes(x=Price))+
  geom_bar(fill="rosybrown2", color="red")

barplot(table(cars93$Type),beside = T,
        main = "Types of Cars",
        xlab = "Types", ylab = "Count")

ggplot(data = cars93, aes(x=Type, fill = Type)) +
  geom_bar()

ggplot(data = cars93, aes(x=Type, fill = AirBags)) +
  geom_bar(position = "dodge")

## Plotting group by summary ##

ss_cars <-cars93 %>% 
  filter(Type=="Midsize") %>% 
  group_by(AirBags) %>% 
  summarise(avg_price = mean(Price, na.rm = T))

ggplot(data = ss_cars,
       aes(x=AirBags, y=avg_price,fill=AirBags))+
  geom_bar(stat = 'identity') +
  labs(y="Average price",x= "Air Bag")

### Facet Grid ###
ggplot(data = cars93, 
       aes(x = MPG.city, y=Price,colour = AirBags))+
  geom_point() + labs(x="Milege",y="Price")

ggplot(data = cars93, 
       aes(x = MPG.city, y=Price,colour = AirBags))+
  geom_point() + facet_grid(.~AirBags)+
  labs(x="Milege",y="Price")

### Change the Theme ###
ggplot(data = cars93,
       aes(x=MPG.city, y=Price,colour = AirBags))+
  geom_point() + labs(x="Milage", y="Price")+
  ggtitle("Scatter Plot")+theme_bw()+
  theme(plot.title = element_text(hjust = 0.5))

## Consider the dataset AutoCollision. Generate the following plot.
ac = read.csv("AutoCollision.csv",stringsAsFactors = T)

ggplot(data = ac,
       aes(x=Vehicle_Use, y=Claim_Count,fill = Vehicle_Use))+
  geom_boxplot() + labs(x="Vehicle_Use", y="Claim_Count")+
  ggtitle("Box Plot")+theme_bw()+
  theme(plot.title = element_text(hjust = 0.5))

### Ex.3 ###

orns <- read.csv("Ornstein.csv", stringsAsFactors = T)
ggplot(data = orns, aes(x = nation, fill = sector)) +
  geom_bar()
ggplot(data = orns, aes())

## Ex.4 Consider the dataset Ornstein in package car which contains data on
## Canadian firms. Generates the following plot using function ggplot()
ggplot(data = orns,aes(x=assets,y=interlocks,colour = sector))+
  geom_point()+
  facet_grid(.~nation)
## Ex.5 Consider dataset mtcars of the package datasets.Generate the following
##plot using function ggplot()
data("mtcars")
mtcars$gear <- factor(mtcars$gear)
ggplot(data = mtcars, aes(x=disp,y=mpg,colour = gear))+
  geom_point()+
  labs(x="Displacement",y="Miles Per Gallon",
       colour = "Gear")
