package project5;

public class ta04_3 {
	public static void main(String args[]){
		
		int X;
		int Y;
		X = 1; Y = 2;
		double M;
		double N;
		M = 2.2; N = 4.2;
		
		int suma = X + Y;
		int diferencia = X - Y;
		int producto = X * Y;
		int cociente = X / Y;
		int resto = X % Y;
		
		double dsuma = N + M;
		double ddiferencia = N - M;
		double dproducto = N * M;
		double dcociente = N / M;
		double dresto = N % M;
		
		double sum = X + N;
		double coc = Y / M;
		double rest = Y % M;
		
		int dX = 2 * X;
		int dY = 2 * Y;
		double dM = 2 * M;
		double dN = 2 * N;
		
		double sumaTot = X + Y + M + N;
		double productoTotal = X * Y * M * N;
				
		System.out.println("X = "+X);
		System.out.println("Y = "+Y);
		System.out.println("M = "+M);
		System.out.println("N = "+N);
		
		System.out.println("suma_X+Y = "+suma);
		System.out.println("diferencia_X-Y = "+diferencia);
		System.out.println("producto_X*Y = "+producto);
		System.out.println("cociente_X/Y = "+cociente);
		System.out.println("resto_X/Y = "+resto);
				
		System.out.println("suma_N+M = "+dsuma);
		System.out.println("diferencia_N-M = "+ddiferencia);
		System.out.println("producto_N*M = "+dproducto);
		System.out.println("cociente_N/M = "+dcociente);
		System.out.println("resto_N/M = "+dresto);
				
		System.out.println("suma_X+N = "+sum);
		System.out.println("cociente_Y/M = "+coc);
		System.out.println("resto_Y%M = "+rest);
						
		System.out.println("dobleX = "+dX);
		System.out.println("dobleY = "+dY);
		System.out.println("dobleM = "+dM);
		System.out.println("dobleN = "+dN);
						
		System.out.println("sumaTot = "+sumaTot);
		System.out.println("productoTot = "+productoTotal);
						
	}
}
