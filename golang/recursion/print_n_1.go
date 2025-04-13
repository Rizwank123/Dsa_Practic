package main

import "fmt"

func main() {
	n := 10
	printNTo1(0, n)
}
func printNTo1(i int, n int) {
	if i > n {
		return
	}
	fmt.Println(n)
	printNTo1(i, n-1)
}
