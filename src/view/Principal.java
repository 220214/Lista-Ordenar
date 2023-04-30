package view;

import model.Lista;

public class Principal {

	public static void main(String[] args){
		Lista l = new Lista();
		int [] vet = {10,5,8,1,9,2,4,7,3,6};
		
		l.isEmpty();
		for (int i=0; i< vet.length;i++) {
			int v =vet[i];
			if( i==0) {
				
			l.addFirst(v); 
			}else {
				l.addFirst(v);
			}
						
		try {
				System.out.print("  "+ l.get(0));
				System.out.println("  ");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	}
		int tm = l.size();
		
		for (int i=0; i<tm-1;i++) {
	
		for(int j=0;j<(tm-i-1);j++) {
				try {
					if(l.get(j)>l.get(j+1)) {
						l.add(l.get(j+1), j);
						l.remova(j+1);
						l.add(l.get(j), j+1);
						l.remova(j);
					}
				} catch (Exception e) {
				e.printStackTrace();
				}
			}
		}
	
		for(int i=0; i<l.size();i++) {
		try {
			System.out.println(l.get(i)+ " ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}





