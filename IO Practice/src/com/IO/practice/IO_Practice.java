package com.IO.practice;

import java.io.File;
import java.io.IOException;

public class IO_Practice {

	private static final File NewFail = null;

	public static void main(String[] args) throws IOException  {
		/*File file = new File("C:\\Users\\ELCOT\\Desktop\\Temp1\\out\\src");
		boolean IsPresents = file.exists();
		System.out.println(IsPresents);
		
		if(IsPresents== false)
			file.mkdirs();
			
		IsPresents = file.exists();
		System.out.println(IsPresents);
		*/
		
		/*
		File file = new File("C:\\Users\\ELCOT\\Desktop\\Temp1\\Chris.txt");
		boolean  IsCreated = file.exists();
		
		if(IsCreated == false) {
			try {
				
				boolean Is_Created =file.createNewFile();
				System.out.println("File Created:"+Is_Created);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		*/
		
		// -->DELETE
		
		/*File file =new File("C:\\Users\\ELCOT\\Desktop\\Temp1\\Chris.txt");
		file.delete();
		
		boolean IsExists = file.exists();
		System.out.println("Is the file is exists: "+IsExists);
		*/
		
		// -->Rename The file
		
		/*File file = new File("C:\\Users\\ELCOT\\Desktop\\Temp1\\Thas.txt");
		file.createNewFile();
		
		File NewFile =new File("C:\\Users\\ELCOT\\Desktop\\Temp1\\Chris.txt");
		boolean IsChanged =file.renameTo(NewFile);
		System.out.println("Name Changed: "+IsChanged);
		
		//  --> Printing a file name
		System.out.println("Name of the File: "+NewFile.getName());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		*/
		
		//--> Listing Files And Folders
		
		/*File file = new File("C:\\Users\\ELCOT\\Desktop");
		String []Files =file.list();
		for(String s:Files) {
			System.out.println(s);
			
		}
		*/
		// -->Listing only Files
		/*
		File file =new File("C:\\Users\\ELCOT\\Desktop");
		File[] Files =file.listFiles();
		for(File f:Files) {
			if(f.isFile())
				System.out.println(f);
		}
		
		*/
		
		// -->Listing only Folders
		
		/*
		File file =new File("C:\\Users\\ELCOT\\Desktop");
		File[] Files =file.listFiles();
		for(File f:Files) {
			if(f.isDirectory())
				System.out.println(f);
		}
		*/
		
		//Listing only .Text file
		File file =new File("C:\\Users\\ELCOT\\Desktop");
		File[] Files =file.listFiles();
		for(File f:Files) {
			if(f.isFile()) {
			String fileName =f.getName();
			int lastDot = fileName.lastIndexOf(".");
			String extension =fileName.substring(lastDot+1);
			if (extension.equals("html"))
				System.out.println(fileName);
			
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
		

	}

}
