package main

import "fmt"

func main() {
	var n int
	fmt.Println("Please input number of testcase")
	fmt.Scan(&n)

	for n > 0 {
		var a, b int
		fmt.Println("Input a and b")
		fmt.Scan(&a, &b)
		r := 0
		if b == 0 && a != 0 {
			r = 1
		} else {
			r = 1
			for i := 0; i < b; i++ {
				r = r * a
			}
		}
		fmt.Println(r)
		n--
	}
}
