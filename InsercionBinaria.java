import java.util.Scanner;
import javax.swing.*;

class InsercionBinaria
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int a [];  //arreglo
		int n; //numero de elementos

		n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo"));
		a = new int [n];
		for (int i=0; i<n; i++) 
		{
			System.out.print((i+1)+". Digite un numero: ");
			a[i] = entrada.nextInt();
		}

		int m;
		int j;
		int aux;
		int der;
		int izq;

		for (int i=1; i<n; i++) 
		{
			aux = a [i];
			izq = 0;
			der = i-1;

			while (izq <= der) 
			{
				m = (izq + der) / 2;
			
				if (aux <= a[m]) 
				{
					der = m-1;
				}

				else 
				{
					izq = m+1;	
				}	
			}

			j = i-1;
			while (j >= izq) 
			{
				a [j+1] = a [j];
				j--;
			}

			a[izq] = aux;
		}

		System.out.println("\nOrden de los numeros: ");
		for (int i=0; i<n; i++) 
		{
			System.out.print(a[i]+" - ");
		}
	}
}