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
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	}
		System.out.println("  ");	
	for (int i=0; i<l.size();i++) {
	
		for(int j=(i+1);j<(l.size());j++) {
		
				try {
					
					if(l.get(i)>l.get(j)) {
						int aux =l.get(i);
						l.add(l.get(j), i+1);
						l.remova(i);
						l.add(aux,j+1);
						l.remova(j);
					}
				} catch (Exception e) {
				e.printStackTrace();
				}
			}
		}
	
		for(int i=0; i<10;i++) {
		try {
			System.out.print(l.get(i)+ " ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
}





