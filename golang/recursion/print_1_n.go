package main

import "fmt"

func main() {
	n := 5

	printNumber(0, n)
}
func printNumber(i int, n int) {
	if i > n {
		return
	}
	fmt.Println(i)
	printNumber(i+1, n)
}
