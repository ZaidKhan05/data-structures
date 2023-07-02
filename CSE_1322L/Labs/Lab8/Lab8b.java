public class Lab8b {
   
    public static void main(String[] Args){
       

    }
}

/*
Lab 8B Tasks:
● Recursive method repeatNTimes
○ Takes in a string and an integer as parameters
○ Concatenates the string to itself the number of times indicated. Returns the
resulting string.
○ For example, if passed “Hi”, 4. It would return “HiHiHiHi”. If passed
“This is a test “,2, it would return “This is a test This is a test”.
○ If passed “Test”,0, it should return an empty string “”
● Recursive method isReverse
○ Takes in 2 strings as parameters
○ Returns a boolean indicating if the 2 strings have the same characters but
reversed from eachother.
○ For example, if passed “Hello” and “olleH” it would return true
○ If passed “a” and “a” it would return true
○ If passed “Test” and “Test” it would return false.
○ 2 empty strings should be considered the reverse of each other.
○ Capitalization must also match. I.e. abcd and DCBA should return false.
○ You will may find the following methods helpful:
■ Java: string.length(), string.charAt(0), string.substring()
■ C#: string.Length, string[0], string.Substring()
● Main method:
○ Using the repeatNTimes method print out the string “I must study recursion
until it makes sense\n” 100 times.
○ Next prompt the user for string 1 (e.g. s1), then prompt the user for string 2
(e.g. s2).
○ Call your isReverse method passing it the first and second strings entered
by the user.
○ If they are the reverse print s1+” is the reverse of “+s2
○ If they the second is not the reverse of the first, print s1+” is not the reverse
of “+s2
Lab 8B Sample Output:
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
I must study recursion until it makes sense
Enter the first string
abcd
Enter the second string
dcba
abcd is the reverse of dcba
**Separate run, ignoring the first 100 lines…**
Enter the first string
a
Enter the second string
a
a is the reverse of a
**Separate run, ignoring the first 100 lines…**
Enter the first string
abcd
Enter the second string
ddba
abcd is not the reverse of ddba
**Separate run, ignoring the first 100 lines. Note here we are
hitting return for each string, which sends empty string**
Enter the first string
Enter the second string
is the reverse of
 */