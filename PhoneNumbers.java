import java.util.*;

class PhoneNumbers {
   public static void main(String[] args) {
      // Write your code here
      String[] names = new String[30];
      names[0] = "Gina";
      names[1] = "Marcia";
      names[2] = "Rita";
      names[3] = "Jennifer";
      names[4] = "Fred";
      names[5] = "Neil";
      names[6] = "Judy";
      names[7] = "Arlene";
      names[8] = "LaWanda";
      names[9] = "Deepak";

      String numbers[] = new String[30];
      numbers[0] = "(847) 341-0912";
      numbers[1] = "(847) 341-2392";
      numbers[2] = "(847) 354-0654";
      numbers[3] = "(414) 234-0912";
      numbers[4] = "(414) 435-6567";
      numbers[5] = "(608) 123-0904";
      numbers[6] = "(608) 435-0434";
      numbers[7] = "(608) 123-0312";
      numbers[8] = "(920) 787-9813";
      numbers[9] = "(930) 412-0991";

      String entryName, entryPhone;
      boolean Found = false;
      int x, highest = 10;
      System.out.println("Enter name to look up. Type 'quit' to quit.");
      Scanner input = new Scanner(System.in);
      entryName = input.nextLine();
      while (highest < 30 && !entryName.equals("quit")) {
         for (x = 0; x < highest; ++x)
            if (entryName.equals(names[x])) {
               Found = true;
               System.out.println(names[x] + "'s phone number is " + numbers[x]);
               x = highest;
            }
         if (!Found) {
            System.out.println("Enter phone number for " + entryName);
            entryPhone = input.nextLine();
            names[highest] = entryName;
            numbers[highest] = entryPhone;
            ++highest;
         }
         System.out.println("Enter name to look up. Type 'quit' to quit.");
         entryName = input.nextLine();
         Found = false;
      }
   }
}
