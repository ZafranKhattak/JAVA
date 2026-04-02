class Main 
{
    public static void main(String args[])
    {
        String name = "Hello World";
        String first = "hello world";
        String empty = "";
        System.out.println("Length: " + name.length());
        System.out.println("UpperCase: " + name.toUpperCase());
        System.out.println("LowerCase: " + name.toLowerCase());
        System.out.println("Trim: " + name.trim());
        System.out.println("CHAR AT: " + name.charAt(0));
        System.out.println("STRIP: " + name.strip());
        System.out.println("SUBSTRING: " + name.substring(2));
        System.out.println("SUBSTRING: " + name.substring(1,5));
        System.out.println("index of: " + name.indexOf("W"));
        System.out.println("last index of: " + name.lastIndexOf("d"));
        System.out.println("IS EMPTY (CHECK OF LENGTH IS 0): " + name.isEmpty());
        System.out.println("EQAUL INGORE CASE: " + name.equalsIgnoreCase(first));
        System.out.println("blank: " + empty.isBlank());
        System.out.println("Replace: " + name.replace('e' , 'i'));
        String joined = String.join("-", "2024", "12", "25");
        System.out.println("join: " + joined);  // "2024-12-25"
    }
}