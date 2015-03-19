package cn.tjuscs.st.zzy;

public class triangle {
	
	public int tri(int a, int b, int c){
		if((a==b)&&(a==c)&&(b==c)){//等边
			return 0;
		}
		else if((a!=b)&&(a!=c)&&(b!=c)){//非等腰
			return 1;
		}
		else{//等腰
			return 2;
		}
	}
	

}
