package OPP.Array;

public class TextCodierung {
	
	private char[] code;
	private static char[][] codeTwo = new char[4][4];
	public char[] getCode() {
		return code;
	}
	
	public void setCode(char[] code) {
		this.code = code;
	}
	
	public static void combinationOfCode(char[] code) {
		for (int i = 0; i < code.length; i++) {
			System.out.print(code[i]);
		}
	}
	
	public static void matrix(char[] code) {
		codeTwo[0][0] = code[0];
		codeTwo[0][1] = code[1];
		codeTwo[0][2] = code[2];
		codeTwo[0][3] = code[3];
		codeTwo[1][0] = code[4];
		codeTwo[1][1] = code[5];
		codeTwo[1][2] = code[6];
		codeTwo[1][3] = code[7];
		codeTwo[2][0] = code[8];
		codeTwo[2][1] = code[9];
		codeTwo[2][2] = code[10];
		codeTwo[2][3] = code[11];
		codeTwo[3][0] = code[12];
		codeTwo[3][1] = code[13];
		codeTwo[3][2] = code[14];
		codeTwo[3][3] = code[15];
		
		for (int i = 0; i < codeTwo.length; i++) {
			for (int j = 0; j < codeTwo[i].length; j++) {
				System.out.print(codeTwo[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void encryption(int[] number) {
		codeTwo[0][0] = code[number[0]]; //0
		codeTwo[0][1] = code[1];
		codeTwo[0][2] = code[2];
		codeTwo[0][3] = code[3];
		codeTwo[1][0] = code[number[1]]; //4
		codeTwo[1][1] = code[5];
		codeTwo[1][2] = code[6];
		codeTwo[1][3] = code[number[2]]; //7
		codeTwo[2][0] = code[8];
		codeTwo[2][1] = code[number[5]]; //9
		codeTwo[2][2] = code[10];
		codeTwo[2][3] = code[number[3]]; //11
		codeTwo[3][0] = code[12];
		codeTwo[3][1] = code[13];
		codeTwo[3][2] = code[number[4]]; //14
		codeTwo[3][3] = code[15];
		
		for (int i = 0; i < codeTwo.length; i++) {
			for (int j = 0; j < codeTwo[i].length; j++) {
				System.out.print(codeTwo[i][j] + " ");
			}
		}
	}
	
	public void decode(int[] decode) {
		codeTwo[0][0] = code[decode[0]]; //0
		codeTwo[0][1] = code[1];
		codeTwo[0][2] = code[2];
		codeTwo[0][3] = code[3];
		codeTwo[1][0] = code[decode[1]]; //4
		codeTwo[1][1] = code[5];
		codeTwo[1][2] = code[6];
		codeTwo[1][3] = code[decode[2]]; //7
		codeTwo[2][0] = code[8];
		codeTwo[2][1] = code[decode[3]]; //9
		codeTwo[2][2] = code[10];
		codeTwo[2][3] = code[decode[4]]; //11
		codeTwo[3][0] = code[12];
		codeTwo[3][1] = code[13];
		codeTwo[3][2] = code[decode[5]]; //14
		codeTwo[3][3] = code[15];
		
		for (int i = 0; i < codeTwo.length; i++) {
			for (int j = 0; j < codeTwo[i].length; j++) {
				System.out.print(codeTwo[i][j] + " ");
			}
		}
	}
	
}
