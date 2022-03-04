//supawit itthisiriwet
//6209650370
package homework1;

import java.util.Random;
import java.util.*;
public class Matrix {
	private  int [][] data;
	private  int row,col;
	private  boolean genData;
	
	Random ran = new Random();
	
		public Matrix(int a,int b,boolean c) {
			row = a;
			col = b;
			genData =c;
			this.data = new int[row][col];
			if(genData==true) {
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						this.data[i][j] = ran.nextInt(9);
						
										   }
										} 
							 }
			else if(genData==false){
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						data[i][j] = 0;
											}
				 						}
			}

					
														}
	
		public void printData() {
			for (int[] row : this.data) {
	            System.out.println(Arrays.toString(row)); 
	            
	            				
			 						}
				System.out.println();
								}	
			 
		public Matrix plus(Matrix b) {
			Matrix a = this;
			Matrix c = new Matrix (row,col,genData);
			if(a.col!= b.col||a.row!= b.row) {
				System.out.printf("Error, can only sum matrix with the same dimension\n ");
				return null;
			}
			for (int i = 0; i < row; i++)
	            for (int j = 0; j < col; j++)
	                c.data[i][j] = a.data[i][j] + b.data[i][j];
	        return c;
		}
		 public Matrix multiply(Matrix B) {
		        Matrix A = this;
		        if (A.col != B.row) {
		        	System.out.printf("Error, cannot multiply\n");
					return null;
		        }
		        Matrix C = new Matrix(row,col,genData);
		        for (int i = 0; i < C.row; i++)
		            for (int j = 0; j < C.col; j++)
		                for (int k = 0; k < A.col; k++)
		                    C.data[i][j] += A.data[i][k] * B.data[k][j];
		        return C;
		    }
		 public Matrix transpose() {
		        Matrix A = new Matrix(row,col,genData);
		        for (int i = 0; i < col; i++)
		            for (int j = 0; j < row; j++)
		                A.data[j][i] = this.data[i][j];
		        return A;
		    }
}

