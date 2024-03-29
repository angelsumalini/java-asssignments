class stringmin
 {
	static String minimize(String str)
	{
		String mstr = " ";
		int l, i, flagchar[] = new int[26];
		char ch;

		l = str.length();

		for (i = 0; i < str.length(); i++) 
                             {
			ch = str.charAt(i);
			if (flagchar[ch - 97] == 0)
                   {
				mstr = mstr + ch;
				flagchar[ch - 97] = 1;
			}
		}

		return mstr; 
	}

	
	static void replaceMinimizeUtil(String str)
	{
		String minimizedStr, finalStr = "";
		int i, index, l;
		char ch;
		l = str.length();

		minimizedStr = minimize(str); 
		for (i = 0; i < minimizedStr.length(); i++)
  {
			ch = minimizedStr.charAt(i);
			index = (ch * ch) % l;

			finalStr = finalStr + str.charAt(index);
		}
		
		System.out.println("Final String: " + finalStr);
}
	public static void main(String args[])
	{
		String str = "cabbaaabcc";

		replaceMinimizeUtil(str);
	}
}
