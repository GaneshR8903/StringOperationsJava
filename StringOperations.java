import java.util.*;

class CharacterAt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.next();
        System.out.println("Enter the index of the character in the string:");
        int index=sc.nextInt();
        getcharacter(str,index);
        sc.close();
    }
    public static void getcharacter(String str,int index){
        try{
            char ch=str.charAt(index);
            System.out.println("The character at "+index+" is: "+ch);
        }
        catch(IndexOutOfBoundsException e){
           System.out.println("Index out of bounds,index must 0 to "+(str.length()-1));
        }
        
    }
    
}

class StringCompare {
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String1:");
        String str1=sc.next();
        System.out.println("Enter the String2:");
        String str2=sc.next();
        boolean Compare=isequal(str1,str2);
        System.out.println(Compare?"Both Strings are same":"Two different strings");
        sc.close();
        
    }
    public static boolean isequal(String str1,String str2){
        return (str1.equals(str2))?true:false;
    }
    
}
class StringCompareIgnoreCase{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String1:");
        String str1=sc.next();
        System.out.println("Enter the String2:");
        String str2=sc.next();
        boolean Compare=isequal(str1,str2);
        System.out.println(Compare?"Both Strings are same":"Two different strings");
        sc.close();  
    }
    public static boolean isequal(String str1,String str2){
        return (str1.equalsIgnoreCase(str2))?true:false;
    }
}
class CompareTo{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String1:");
        String str1=sc.next();
        System.out.println("Enter the String2:");
        String str2=sc.next();
        int Compare=str1.compareTo(str2);
        System.out.println("Value of Comapring 2 Strings: "+Compare);
        sc.close();  
    }
}
    class CompareToIgnoreCase{
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the String1:");
            String str1=sc.next();
            System.out.println("Enter the String2:");
            String str2=sc.next();
            int Compare=str1.compareToIgnoreCase(str2);
            System.out.println("Value of Comapring 2 Strings by Ignoring case: "+Compare);
            sc.close();  
        }   
}

class StartsWith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the index of the string to be start with:");
        int index=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the prefix to be Compared :");
        String cmp=sc.next();
        boolean compared=comparePrefixWithIndex(str,cmp,index);
        System.out.println(compared?"Prefix present in given Index of the String":"Prefix not found");
        sc.close();
    }
    public static boolean comparePrefixWithIndex(String str,String cmp,int index){
        try{
            return str.startsWith(cmp,index);
        }
        catch(IndexOutOfBoundsException e){
           return false;
        }   
    }  
}
class StartsWithPrefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the prefix to be Compared :");
        String cmp=sc.next();
        boolean compared=comparePrefix(str,cmp);
        System.out.println(compared?"Prefix present in given String":"Prefix is not found");
        sc.close();
    }
    public static boolean comparePrefix(String str,String cmp){
        try{
            return str.startsWith(cmp);
        }
        catch(IndexOutOfBoundsException e){
           return false;
        }   
    }  
}
class EndsWithSuffix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the suffix to be Compared :");
        String cmp=sc.next();
        boolean compared=compareSuffix(str,cmp);
        System.out.println(compared?"Suffix present in given String":"Suffix is not found");
        sc.close();
    }
    public static boolean compareSuffix(String str,String cmp){
        try{
            return str.endsWith(cmp);
        }
        catch(IndexOutOfBoundsException e){
           return false;
        }   
    }  
}
class HashCode{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("The HashCode of the String "+str+" is "+str.hashCode());
        sc.close();
}
}
class IndexOf{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the Character to be checked in the string:");
        char ch=sc.next().charAt(0);
        System.out.println("The Index of Character "+ch+" in the String at "+str.indexOf(ch));
        sc.close();
}

}
class IndexOfWithIndex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the Character to be checked in the string:");
        char ch=sc.next().charAt(0);
        System.out.println("Enter the index of the string to search from:");
        int index=sc.nextInt();
        System.out.println("The Index of Character "+ch+" in the String from the index "+index+" is "+str.indexOf(ch,index));
        sc.close();
}
}
class LastIndexOf{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the Character to be checked in the string at last Occurance:");
        char ch=sc.next().charAt(0);
        System.out.println("The Character at the last Occurance of the String is "+str.lastIndexOf(ch));
        sc.close();
}
}
class LastIndexOfStr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the String to be checked in the string:");
        String cmp=sc.next();
        System.out.println("Last Index of String is : "+str.lastIndexOf(cmp));
        sc.close();
    }
}
class LastIndexOfWithIndex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the Character to be checked in the string at last Occurance:");
        char ch=sc.next().charAt(0);
        System.out.println("Enter the index of the string to search from:");
        int index=sc.nextInt();
        System.out.println("The Index of Character "+ch+" before the index of "+index+" at the last Occurance of the String is "+str.lastIndexOf(ch,index));
        sc.close();
}
}
class BeginIndex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the index of the string to print from :");
        int index=sc.nextInt();
        System.out.println("Substring from index "+index+" of the String is "+str.substring(index));
        sc.close();
}
}
class BeginAndEndIndex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the index of the string to print from:");
        int beginindex=sc.nextInt();
        System.out.println("Enter the index of the string to print until:");
        int lastindex=sc.nextInt();
        System.out.println("Substring from index "+beginindex+" to "+lastindex+" of the String is "+str.substring(beginindex,lastindex));
        sc.close();
}

}
class Concatenation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String 1:");
        String str1=sc.nextLine();
        System.out.println("Enter the String 2:");
        String str2=sc.nextLine();
        System.out.println("Concatenation of the String is "+str1.concat(str2));
        sc.close();
}
}
class Replace{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the Character to remove");
        char remove=sc.next().charAt(0);
        System.out.println("Enter the Character to replace");
        char add=sc.next().charAt(0);
        System.out.println("New String is "+str.replace(remove,add));
        sc.close();
}
}
class Find{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the Character to find");
        char find=sc.next().charAt(0);
        String findstr=String.valueOf(find);
        System.out.println(str.contains(findstr)?"Character found":"Not found");
        sc.close();
}
}
class UpperLocale{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the Locale language tag (e.g., en-US):");
        String languageTag = sc.next();
        Locale locale = Locale.forLanguageTag(languageTag);
        System.out.println("Uppercase of the String with locale is: "+str.toUpperCase(locale));
        sc.close();
}
}
class UpperCase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Uppercase of the String is: "+str.toUpperCase());
        sc.close();
}
}
class Intern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        String intern=str.intern();
        System.out.println("String==Intern: "+(str==intern?"Same reference after interning":"Not Interned properly"));
        sc.close();
} 
}
class LengthFind{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println(str.isEmpty()?"The String is empty":"The string has Characters");
        sc.close();
    }
}
class Join{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the words to join (separate each word by pressing enter):");

            String word1 = sc.next();
            String word2 = sc.next();
            String word3 = sc.next();

            String[] words = {word1, word2, word3};            
           
            String joinedString = String.join(", ", words);
           
            System.out.println("Joined String: " + joinedString);
            sc.close();
        }
    }

class ReplaceFirst{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the String to remove");
        String remove=sc.next();
        System.out.println("Enter the String to replace");
        String add=sc.next();
        System.out.println("New String is "+str.replaceFirst(remove,add));
        sc.close();
    }
}
class ReplaceAll{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the String to remove");
        String remove=sc.next();
        System.out.println("Enter the String to replace");
        String add=sc.next();
        System.out.println("New String is "+str.replaceAll(remove,add));
        sc.close();
    }
}
class Split{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        String strArr[]= str.split(" ");
        System.out.println("The String is Splited into:");
        for (String temp: strArr){
          System.out.println(temp);
        }
        sc.close();
    }
}
class LowerLocale{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the Locale language tag (e.g., en-US):");
        String languageTag = sc.next();
        Locale locale = Locale.forLanguageTag(languageTag);
        System.out.println("Lowercase of the String with locale is: "+str.toLowerCase(locale));
        sc.close();
}
}

class StringFormat{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name=sc.nextLine();
        System.out.println("Enter the Age:");
        int age=sc.nextInt();
        System.out.println("Enter the Salary:");
        Double salary=sc.nextDouble();    
        System.out.println(String.format("Name: %s, Age: %d, Salary: %.2f", name,age,salary));
        sc.close();
}
}
class Lowercase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Lowercase of the String is: "+str.toLowerCase());
        sc.close();
}
}
class Trim{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("The Trimmed String is :"+str.trim());
        sc.close();
    }
}
class CharacterArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        char[] chArr=str.toCharArray();
        for(char c:chArr){
            System.out.print(c+" ");
        }
        sc.close();
    }
}
class CopyValue{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        char[] chArr=str.toCharArray();
        String name=String.copyValueOf(chArr);
        System.out.print(name);
        sc.close();
    }
}
class StringValueOf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("The Value of the String is :"+ String.valueOf(str));
        sc.close();
    }
}
class ContentEquals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String1:");
        String str1=sc.nextLine();
        System.out.println("Enter the String2:");
        String str2=sc.nextLine();
        boolean isEquals = str1.contentEquals(str2);
        System.out.println(isEquals ? "Equal" : "Not Equal");
        sc.close();
    }
}
class Matches {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String1:");
        String str1=sc.nextLine();
        System.out.println("Enter the String2:");
        String str2=sc.nextLine();
        boolean isEquals = str1.contentEquals(str2);
        System.out.println(isEquals ? "Equal" : "Not Equal");
        sc.close();
    }
}
class Length{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("The Length of the String is "+str.length());
        sc.close();
    }
}
class CodePointAt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the index of the character in the string:");
        int index=sc.nextInt();
        if (index >= 0 && index < str.length()) {
            int codePoint = str.codePointAt(index);
            System.out.println("The Unicode code point of the character at index " + index + " in the string is: " + codePoint);
        } else {
            System.out.println("Index out of bounds. Please enter a valid index.");
        } 
        sc.close();
    }
}

