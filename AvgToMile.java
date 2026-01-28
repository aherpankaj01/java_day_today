class AvgToMile
{
	public static void main(String[] args) 
	{
		float distanceCoverd = 14;
		float secInMinute=45.5f;
		float distanceCoveredInMinute= distanceCoverd/secInMinute;
		float distanceCoveredInHour= 60*distanceCoveredInMinute;
		double kmToMiles= distanceCoveredInHour * 1.6;
		
		System.out.printf("total avg speed the runner travel in hour per mile is : %3f miles \n ", kmToMiles);
	}
}
