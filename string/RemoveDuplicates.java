package string;

//import net.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice;
//import net.bytebuddy.asm.Advice.OffsetMapping.ForAllArguments;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
	
	String text="we learn java basics as part of javasessions in java week1";
	int count=0;
	String temp="";
	String[] split = text.split(" ");
	
	for(int i=0; i<split.length; i++)
	{
		for(int j=i+1;j<split.length;j++)
		{
			if(split[i].equals(split[j]))
			{
				temp=split[i];
				count+=1;
			}
		}
	}
	if (count>1) {
				System.out.println(text.replace(temp,""));
			}
		}
	
}
	


