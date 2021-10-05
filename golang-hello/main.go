package main

import "fmt"

func main() {
	fmt.Println("this is hello world")

	var firstName string = "ivan"
	lastName := "abdurrafie"

	fmt.Printf("hallo %s %s! \n ", firstName, lastName)

	var point = 8

	if point == 10 {
		fmt.Println("lulus dengan nilai sempurna")
	} else if point > 5 {
		fmt.Println("lulus")
	} else if point == 4 {
		fmt.Println("hampir lulus")
	} else {
		fmt.Printf("tidak lulus. nilai anda %d\n", point)
	}
}
