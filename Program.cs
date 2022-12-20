Console.Write("Enter the first number:  ");
string a = Console.ReadLine();
Console.Write("Enter the second number: ");
string b = Console.ReadLine();

int aNum = Int32.Parse(a);
int bNum = Int32.Parse(b);
int rem = bNum % aNum;

if (rem == 0)
{
    Console.WriteLine("Yes");
}
else
{
    Console.WriteLine(rem);
}