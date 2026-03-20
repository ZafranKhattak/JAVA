class ConfusingCompiler {
    
   static void ambigous(int ... a)
    {
        for (int i: a)
        {
            System.out.println(i);
        }
    }

    static void ambigous(boolean ... b)
    {
        for (boolean i: b)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        
        ambigous();
    }
}

// when we pass different datatype parameter in and in main when we call without passing any argument then it
// will show reference is ambiguous