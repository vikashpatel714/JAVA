class DispOvrload
{
    public void show(char ch)
    {
         System.out.println ("You have typed the letter: "+ch);
    }
    public void show(char ch, char ch1)  
    {
         System.out.println("You have typed the letter: "+ch+", and " + ch1);
    }
}
class Main
{
   public static void main (String args[] )
   {
       DispOvrload o1 = new DispOvrload();
       o1.show('V');
       o1.show( 'K', 'P' );
   }
}

//OUTPUT
// RATICAL\DAY3\Overloading\" && javac Main.java && java Main
// You have typed the letter: V
// You have typed the letter: K, and P