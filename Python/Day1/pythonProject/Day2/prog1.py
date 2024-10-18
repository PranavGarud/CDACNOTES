fruit = "apple"

match fruit:
    case "apple":
        print("You like apples!")
    case "banana":
        print("You like banana")
    case _:
        print("I don't know what you like")