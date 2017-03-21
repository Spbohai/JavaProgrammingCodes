package weekOneUnionFind;
import java.io.*;
import java.util.stream.*;

public class UF {
	private int[] id;
	public UF(int N){
		id= new int[N];
		for(int i=0;i<N;i++)
			id[i]=i;
	}
	public boolean connected(int p,int q){
		return id[p]==id[q];
	}
	public void union(int p,int q){
		int pid=id[p];
		int qid=id[q];
		for(int i=0;i<id.length;i++){
			if(id[i]==pid) id[i]=qid;
		}
	}
	public void printId(int[] array){
		System.out.print("id:\t");
		for(int i=0;i<array.length;i++){
			System.out.print(i+",\t");
		}
		System.out.print("\n");
		System.out.print("id[]:\t");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+",\t");
		}
		System.out.print("\n");
		System.out.print("*****************************************************");
		System.out.print("\n");
			
	}
	public static void readTxt(String filePath){
		try{
			File file=new File(filePath);
			if(file.isFile()&&file.exists()){
				InputStreamReader isr=new InputStreamReader(new FileInputStream(filePath));
				BufferedReader br=new BufferedReader(isr);
				String lineTxt=null;
				while((lineTxt=br.readLine())!=null){
					System.out.println(lineTxt);
				}
				br.close();
			}
			else{
				System.out.println("file is not exist");
				
			}
		}catch(Exception e){
			System.out.println("error of read file");
		}
	}
		
	public static void main(String[] args){
		UF uf1=new UF(10);
		uf1.printId(uf1.id);
		uf1.union(3, 5);
		uf1.union(5, 7);
		uf1.union(7, 9);
		uf1.printId(uf1.id);
//		int N=StdIn.readInt();
		String filePath="D:\\JavaTestFiles\\ProgrammingClassTestFromCoursera\\src\\weekOneUnionFind\\tinyUF.txt";
		readTxt(filePath);
		}
	

}
