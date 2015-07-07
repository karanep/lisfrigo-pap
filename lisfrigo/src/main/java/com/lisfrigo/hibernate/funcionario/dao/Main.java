package main.java.com.lisfrigo.hibernate.funcionario.dao;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncionarioDAO func=new FuncionarioDAO();
		//func.addFuncionario("aaa", 1);
		Return n=new Return();
		//System.out.println(n.nome(4));
		Delete d=new Delete();
		d.delete(5);
	}

}
