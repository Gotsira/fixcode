# fixcode
The reason for the equals method not behaving in the way it should be is because the compiler cannot check the equivalence of the objects.
It can only check the name of the Student and the Person but it cannot check the variables of the objects. So it would return false in this case.
