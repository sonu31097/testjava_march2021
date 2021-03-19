package com.demo.test;

import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.services.ProductService;
import com.demo.services.ProductServiceInterface;

public class ProductTest {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			ProductServiceInterface ob=new ProductService();
			int choice=0;
			do {//menu
				System.out.println("1.Add data\n2. display all by category\n3. display all\n4. display By Id\n5. calculate tax\n6.exit");
				choice=sc.nextInt();
				switch(choice) {
				case 1:System.out.println("Enter the type of product you want to add");
						System.out.println("1.Perishable\n2.Non-perishable");
						int ch=sc.nextInt();
						ob.acceptdata(ch);
						break;
				case 2:System.out.println("Please enter the category");
						System.out.println("1.Perishable\n2.Non-perishable");
						ch=sc.nextInt();
						Product[] s=ob.displaybycategory(ch);
						if(s!=null) {
							for(int i=0;i<s.length;i++) {
								System.out.println(s[i]);
							}
						}
						else
							System.out.println("NO DATA");
						break;
				case 3:ob.displayall();
					
					break;
				case 4:System.out.println("Please enter the id");
						int id=sc.nextInt();
						Product p=ob.displayById(id);
						if(p!=null) {
							System.out.println(p);
						}
						else
							System.out.println("Invalid id");
					
					break;
				case 5: System.out.println("Please enter the id");
						id=sc.nextInt();
						float price=ob.calculateGST(id);
						if(price!=0.0f) {
						System.out.println(price);
						}
						else
							System.out.println("Invalid Id");
						break;
				case 6:
					sc.close();
					break;
				}
				}while(choice!=6);

			}

			
		}

