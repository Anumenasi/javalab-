import java.io.File;
import java.util.*;
public class FileOp {
	
	   public static void main(String args[]){
		 Scanner obj=new Scanner(System.in);
		 System.out.println("\nEnter the file name:");
		 String fname=obj.next();
		 File f=new File(fname);
		 f.setWritable(true);
		 System.out.println(f.exists() ?"File exist":"File does not Exist");
		 System.out.println(f.canWrite()?"File is writable":"File is not writable");
		 System.out.println(f.canRead()?"File is readable":"File is not readable");

		 String filename=f.toString();
		 int index=filename.lastIndexOf('.');		
		 if(index>0){
			 String type=filename.substring(index+1);
			 System.out.println("File type is:"+type);
		 }
		 else
			 System.out.println("File doesn't have type:");
		 System.out.println("File size:"+f.length()+"Bytes");
			 
		 }
	   }
























































































































































































































































































































































































































































































































































































































































































































































































