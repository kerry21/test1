package cn.tjuscs.st.zzy;

public class triangle {
	
	public int tri(int a, int b, int c){
		if((a==b)&&(a==c)&&(b==c)){//�ȱ�
			return 0;
		}
		else if((a!=b)&&(a!=c)&&(b!=c)){//�ǵ���
			return 1;
		}
		else{//����
			return 2;
		}
	}
	

}
