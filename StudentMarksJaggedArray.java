public class StudentMarksJaggedArray 
{
    public static void main(String[] args) 
	{
        int[][] marks = {
            {85},            
            {78, 92},        
            {88, 75, 95}    
        };
        for (int i = 0; i < marks.length; i++) 
		{
            System.out.println("Student " + (i + 1) + " Marks:");
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) 
			{
                System.out.println("Subject " + (j + 1) + " : " + marks[i][j]);
                total += marks[i][j];
            }
            double average = (double) total / marks[i].length;
            System.out.println("Total Marks : " + total);
            System.out.println("Average Marks : " + average);
            System.out.println();
        }
    }
}