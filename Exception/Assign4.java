// 4. Handling Book Invalid Quantity Exception in Library Software

// Mohan, a librarian is creating software to automate his work. As part of this, he needs to handle the exception if the purchased quantity is greater than the available quantity. 
// Create a class named "Book" with the following attributes
// 1.	id - String
// 2.	bookTitle - String
// 3.	authorName - String
// 4.	price - float
// 5.	quantity - int
// Create an Exception class called InvalidQuantityException and use it in the class called “Book”. Include a method called purchase(int quantity) taking the purchased quantity as a parameter and update the quantity available appropriately. Print suitable exception if the purchased quantity is more than the available quantity. Help Mohan to complete this task. Refer to sample input and output.
// Input format :
// The first line of the input consists of bookID as a String
// The second line of the input consists of bookTitle as String
// The third line of the input consists of authorName as String
// The fourth line of the input consists of price as a float
// The fifth line of the input consists of the quantity available as an integer
// The sixth line of the input consists of the quantity purchased as an positive integer
// Output format :
// The output should display the quantity available if it has or else throws an exception
// Refer to the sample output for reference.
// Sample test cases :
// Input 1 :
// YCW2019
// You can win
// Shiv Khera
// 245
// 25
// 20
// Output 1 :
// Quantity Available : 5
// Input 2 :
// YCW2019
// You can win
// Shiv Khera
// 245
// 25
// 30
// Output 2 :
// InvalidQuantityException: Quantity not available