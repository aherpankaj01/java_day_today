class ass_Increment_Decresment
{
	public static void main(String[] args) 
	{
		int p=-3, q=8, r= 13, s;
		s= p++ - q-- *r;
		q= --p + s++ - --q;
		p= p++ * p-- + r;
		r= r--;
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s); 
	}
}
